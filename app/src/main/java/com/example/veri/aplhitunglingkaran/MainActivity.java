package com.example.veri.aplhitunglingkaran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity{

    Button button1, button2, reset;
    EditText kelText;
    TextView tvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.kell);
        button2 = (Button) findViewById(R.id.luas);
        reset = (Button) findViewById(R.id.reset);
        kelText = (EditText) findViewById(R.id.jariInput);
        tvHasil = (TextView) findViewById(R.id.Hasil);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelText.length() == 0) {
                    Toast.makeText(getApplication(), "Kolom Jari Jari Harus Terisi ", Toast.LENGTH_LONG).show();
                } else {
                    int jariJari = Integer.parseInt(kelText.getText().toString());
                    double hasil = 3.14 * jariJari * jariJari;
                    NumberFormat hasiltext = NumberFormat.getInstance();
                    tvHasil.setText(hasiltext.format(hasil));
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kelText.length() == 0) {
                    Toast.makeText(getApplication(), "Kolom Jari Jari Harus Terisi ", Toast.LENGTH_LONG).show();
                } else {
                    int jariJari = Integer.parseInt(kelText.getText().toString());
                    double hasil = 2 * jariJari * 3.14;
                    NumberFormat hasiltext = NumberFormat.getInstance();
                    tvHasil.setText(hasiltext.format(hasil));
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              tvHasil.setText("0");
              kelText.getText().clear();
            }
        });
    }
}