package com.c.project3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class Hitung extends AppCompatActivity {
    private TextView judul, hasil;
    private Button hitung;
    private ImageView imgBangun;
    private TextInputLayout a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung);
        judul=findViewById(R.id.txt_jenis);
        hasil=findViewById(R.id.txt_Hasil);
        hitung=findViewById(R.id.btn_hitung);
        imgBangun=findViewById(R.id.img_bangun);
        a=findViewById(R.id.input1);
        b=findViewById(R.id.input2);
        Intent go=getIntent();
        hitung(go);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void hitung(Intent go){
        switch (go.getStringExtra("Bangun")){
            case "Belaketupat":
                getSupportActionBar().setTitle("Hitung Luas Belaketupat");
                judul.setText("Belaketupat");
                imgBangun.setImageResource(R.drawable.img_ketupat);
                a.setHint("Diagonal 1");
                b.setHint("Diagonal 2");
                hitung.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (a.getEditText().getText().toString().equals("") || b.getEditText().getText().toString().equals("")){
                            Toast.makeText(Hitung.this, "Nilai diagonal 1 dan Diagonal 2 tidak boleh kosong", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Double a1=Double.parseDouble(a.getEditText().getText().toString());
                            Double a2=Double.parseDouble(b.getEditText().getText().toString());
                            Double ls=(a1*a2)/2;
                            hasil.setText("Luasnya adalah "+ls);
                        }
                    }
                });
                break;
            case "Segitiga":
                getSupportActionBar().setTitle("Hitung Luas Segitiga");
                judul.setText("Segitiga");
                imgBangun.setImageResource(R.drawable.img_segitiga);
                a.setHint("Alas");
                b.setHint("Tinggi");
                hitung.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(a.getEditText().getText().toString().equals("") || b.getEditText().getText().toString().equals("")){
                            Toast.makeText(Hitung.this, "Nilai alas dan Tinggi tidak boleh Kosong", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Double a1=Double.parseDouble(a.getEditText().getText().toString());
                            Double a2=Double.parseDouble(b.getEditText().getText().toString());
                            Double ls=(a1*a2)/2;
                            hasil.setText("Luasnya adalah "+ls);
                        }
                    }
                });
                break;
            case "Trapesium":
                getSupportActionBar().setTitle("Hitung Luas Trapesium");
                judul.setText("Trapesium");
                imgBangun.setImageResource(R.drawable.img_trapesium);
                a.setHint("Jumlah sisi sejajar");
                b.setHint("alas");
                hitung.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(a.getEditText().getText().toString().equals("") || b.getEditText().getText().toString().equals("")){
                            Toast.makeText(Hitung.this, "Nilai jumlah sisi sejajar dan alas tidak boleh kosong", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Double a1=Double.parseDouble(a.getEditText().getText().toString());
                            Double a2=Double.parseDouble(b.getEditText().getText().toString());
                            Double ls=(a1*a2)/2;
                            hasil.setText("Luasnya adalah "+ls);
                        }
                    }
                });
                break;
            case "Layang-layang":
                getSupportActionBar().setTitle("Hitung Luas layang-layang");
                judul.setText("Layang-layang");
                imgBangun.setImageResource(R.drawable.img_layang);
                a.setHint("Diagonal 1");
                b.setHint("Diagonal 2");
                hitung.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(a.getEditText().getText().toString().equals("") || b.getEditText().getText().toString().equals("")){
                            Toast.makeText(Hitung.this, "Nilai diagonal 1 dan Diagonal 2 tidak boleh kosong", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Double a1=Double.parseDouble(a.getEditText().getText().toString());
                            Double a2=Double.parseDouble(b.getEditText().getText().toString());
                            Double ls=(a1*a2)/2;
                            hasil.setText("Luasnya adalah "+ls);
                        }
                    }
                });
                break;
            default:
                Toast.makeText(this, "action tidak dikenali", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
