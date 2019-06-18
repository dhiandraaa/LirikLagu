package com.agsatria.liriklagu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_REMARKS = "extra_remarks";
    public static final String EXTRA_NAME = "extra_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String judul = getIntent().getStringExtra(EXTRA_NAME);
        String penyanyi = getIntent().getStringExtra(EXTRA_REMARKS);

        setTitle("Lirik Lagu");

        TextView tvJudul = (TextView)findViewById(R.id.tv_judul);
        tvJudul.setText(judul);

        TextView tvPenyanyi = (TextView)findViewById(R.id.tv_penyanyi);
        tvPenyanyi.setText(penyanyi);
    }
}
