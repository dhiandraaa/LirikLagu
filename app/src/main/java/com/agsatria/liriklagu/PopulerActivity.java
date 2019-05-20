package com.agsatria.liriklagu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

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
    }
}
