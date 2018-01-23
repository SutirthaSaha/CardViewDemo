package com.example.dell.cardviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> titleDataSet;
    int[] imageDataSet={
            R.drawable.abkhazia,
            R.drawable.afghanistan,
            R.drawable.albania,
            R.drawable.algeria,
            R.drawable.andorra,
            R.drawable.angola,
            R.drawable.anguilla,
            R.drawable.argentina,
            R.drawable.armenia,
            R.drawable.aruba,
            R.drawable.australia,
            R.drawable.austria,
            R.drawable.azerbaijan,
            R.drawable.bahamas,
            R.drawable.bahrain,
            R.drawable.bangladesh,
            R.drawable.barbados,
            R.drawable.belarus,
            R.drawable.belgium,
            R.drawable.belize,
            R.drawable.benin,
            R.drawable.bermuda,
            R.drawable.bhutan,
            R.drawable.bolivia,
            R.drawable.bonaire
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleDataSet=new ArrayList<>();
        for(int i=0;i<25;i++){
            titleDataSet.add("Title Number "+i+"Yaha Hai");
        }

        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);

        adapter=new MainAdapter(titleDataSet,imageDataSet);
        recyclerView.setAdapter(adapter);

    }
}
