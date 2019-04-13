package com.agsatria.liriklagu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

public class DaftarSayaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_saya);

        setTitle("Daftar Saya"); //type 2

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //hanya menampilkan tombol back pada actionbar
    }

    public boolean onSupportNavigateUp() { //method yg bersal dari AppCompat dan butuh tombol back di ActionBar
        onBackPressed();
        return true;
    }

}
