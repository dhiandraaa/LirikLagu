package com.agsatria.liriklagu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.agsatria.liriklagu.adapter.ListLaguAdapter;

import java.util.ArrayList;

public class PopulerActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Lagu> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_populer);

        setTitle("Populer");

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(LaguData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListLaguAdapter listPresidentAdapter = new ListLaguAdapter(this);
        listPresidentAdapter.setListLagu(list);
        rvCategory.setAdapter(listPresidentAdapter);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedSong(list.get(position));
            }
        });
    }

    private void showSelectedSong(Lagu lagu){
        Toast.makeText(this, "Kamu memilih "+lagu.getJudul(), Toast.LENGTH_SHORT).show();
        Intent detail = new Intent(PopulerActivity.this, DetailActivity.class);
        detail.putExtra(DetailActivity.EXTRA_NAME, lagu.getJudul());
        detail.putExtra(DetailActivity.EXTRA_REMARKS, lagu.getPenyanyi());
        startActivity(detail);
    }
}
