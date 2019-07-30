package org.zord.tugasintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Menabung extends AppCompatActivity implements View.OnClickListener {
    EditText uang_j;
    Button cetak;

    Integer uang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menabung);
        uang_j = findViewById(R.id.uang);
        cetak = findViewById(R.id.nabung);

        cetak.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int uang1 = 10000000;
        uang = Integer.parseInt(uang_j.getText().toString());
        Integer cetak = uang1 + uang;

        Intent intent = new Intent(Menabung.this, MainActivity.class);
        intent.putExtra(MainActivity.EXTRA_NABUNG, "Saldo : Rp. "+cetak);
        startActivity(intent);
    }
}
