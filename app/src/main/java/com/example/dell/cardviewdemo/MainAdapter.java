package com.example.dell.cardviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DELL on 23-Jan-18.
 */

class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyHolder> {
    private ArrayList<String> titleDataSet;
    private int[] imageDataSet;

    public MainAdapter(ArrayList<String> titleDataSet,int[] imageDataSet) {
        this.titleDataSet = titleDataSet;
        this.imageDataSet=imageDataSet;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        MyHolder holder=new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.title.setText(titleDataSet.get(position));
        holder.image.setImageResource(imageDataSet[position]);
    }

    @Override
    public int getItemCount() {
        return titleDataSet.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder{

        public TextView title;
        public ImageView image;
        public MyHolder(View itemView) {
            super(itemView);
            title=(TextView) itemView.findViewById(R.id.title);
            image=(ImageView)itemView.findViewById(R.id.image);
        }
    }
}
