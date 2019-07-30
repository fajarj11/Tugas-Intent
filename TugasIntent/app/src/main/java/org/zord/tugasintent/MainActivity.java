package org.zord.tugasintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NABUNG = "extra_nabung";
    TextView hasil_nab;
    Button c, c2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c = findViewById(R.id.transfer);
        c2 = findViewById(R.id.menabung);
        hasil_nab = findViewById(R.id.hasil_nabung);

        String uang = getIntent().getStringExtra(EXTRA_NABUNG);
        hasil_nab.setText(uang);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, Transfer.class);
                startActivity(intent1);
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, Menabung.class);
                startActivity(intent2);
            }
        });

    }
}
