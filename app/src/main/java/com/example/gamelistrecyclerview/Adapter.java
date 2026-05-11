package com.example.gamelistrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyHolder> {

    ArrayList<Game> list;

    public Adapter(ArrayList<Game> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);

        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        Game g = list.get(position);

        holder.num.setText(String.valueOf(position + 1));
        holder.name.setText(g.name);
        holder.type.setText(g.type);
        holder.rate.setText(g.rate);
        holder.img.setImageResource(g.image);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {

        TextView num, name, type, rate;
        ImageView img;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            num = itemView.findViewById(R.id.num);
            name = itemView.findViewById(R.id.name);
            type = itemView.findViewById(R.id.type);
            rate = itemView.findViewById(R.id.rate);
            img = itemView.findViewById(R.id.img);
        }
    }
}