package com.example.taskrecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Rrecyle extends AppCompatActivity {
   private RecyclerView recyclerView;

   private  Radapter radapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rrecyle);
        recyclerView = findViewById(R.id.recyclerrr);
        recyclerView.setHasFixedSize(true);


        ArrayList<DemoData> arrayList= new ArrayList<>();
        arrayList.add(new DemoData(1, "Rajesh"));
        arrayList.add(new DemoData(2, "Sachin"));
        arrayList.add(new DemoData(3, "Akash"));
        arrayList.add(new DemoData(4, "Sanjeev"));
        arrayList.add(new DemoData(5, "Mohit"));


        radapter = new Radapter(this, arrayList);
        recyclerView.setAdapter(radapter);




    }
}
