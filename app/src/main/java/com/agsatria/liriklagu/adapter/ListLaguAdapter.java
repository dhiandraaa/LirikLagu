package com.agsatria.liriklagu.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.agsatria.liriklagu.Lagu;
import com.agsatria.liriklagu.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListLaguAdapter extends RecyclerView.Adapter<ListLaguAdapter.CategoryViewHolder> {

    private Context context;
    private ArrayList<Lagu> listLagu;

    public ListLaguAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Lagu> getListLagu() {
        return listLagu;
    }

    public void setListLagu(ArrayList<Lagu> listLagu) {
        this.listLagu = listLagu;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_lagu, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int i) {
        categoryViewHolder.tvJudul.setText(getListLagu().get(i).getJudul());
        categoryViewHolder.tvPenyanyi.setText(getListLagu().get(i).getPenyanyi());
        Glide.with(context)
                .load(getListLagu().get(i).getFoto())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgFoto);
    }

    @Override
    public int getItemCount() {
        return getListLagu().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvJudul;
        TextView tvPenyanyi;
        ImageView imgFoto;
        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
                tvJudul  = itemView.findViewById(R.id.tv_item_name);
                tvPenyanyi = itemView.findViewById(R.id.tv_item_remarks);
                imgFoto = itemView.findViewById(R.id.img_item_photo);
            }
        }
    }
