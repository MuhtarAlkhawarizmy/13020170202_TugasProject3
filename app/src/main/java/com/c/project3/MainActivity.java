package com.c.project3;

//import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private CardView ketupat, stiga, trapesium, layang;
    private Image img;
    private Intent go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolbar);
        ketupat=findViewById(R.id.btn_belaketupat);
        stiga=findViewById(R.id.btn_segitiga);
        trapesium=findViewById(R.id.btn_trapesium);
        layang=findViewById(R.id.btn_layang);

        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        ketupat.setOnClickListener(click);
        stiga.setOnClickListener(click);
        trapesium.setOnClickListener(click);
        layang.setOnClickListener(click);

    }

    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_belaketupat:
                    Intent go=new Intent(MainActivity.this, Hitung.class);
                    go.putExtra("Bangun", "Belaketupat");
                    startActivity(go);
                    break;
                case R.id.btn_segitiga:
                    go=new Intent(MainActivity.this, Hitung.class);
                    go.putExtra("Bangun", "Segitiga");
                    startActivity(go);
                    break;
                case R.id.btn_trapesium:
                    go=new Intent(MainActivity.this, Hitung.class);
                    go.putExtra("Bangun", "Trapesium");
                    startActivity(go);
                    break;
                case R.id.btn_layang:
                    go=new Intent(MainActivity.this, Hitung.class);
                    go.putExtra("Bangun", "Layang-layang");
                    startActivity(go);
                    break;
                default:
                    break;
            }
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.akun){
            startActivity(new Intent(MainActivity.this, about.class));
        }
        return super.onOptionsItemSelected(item);
    }
}
