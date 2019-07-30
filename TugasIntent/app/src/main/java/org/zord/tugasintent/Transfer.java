package org.zord.tugasintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Transfer extends AppCompatActivity implements View.OnClickListener {
    EditText edit1, edit2;
    Button cetak_j;
    TextView hasil_j, rek_j;

    Integer rekening, uang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);

        edit1 = findViewById(R.id.rekening);
        edit2 = findViewById(R.id.uang);
        cetak_j = findViewById(R.id.cetak);
        hasil_j = findViewById(R.id.hasil);
        rek_j = findViewById(R.id.rek);

        cetak_j.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int uang1 = 10000000;
        uang = Integer.parseInt(edit2.getText().toString());
        rekening = Integer.parseInt(edit1.getText().toString());

        Integer cetak1 = uang1 - uang;
        Integer cetak2 = rekening;
        hasil_j.setText(String.valueOf("Sisa Saldo : Rp. "+cetak1));
        rek_j.setText(String.valueOf("No. Rekening : "+cetak2));
    }
}
