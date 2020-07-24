package com.example.taskrecycle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Radapter extends RecyclerView.Adapter<Radapter.viewHolder> {

    private Context context;
    private ArrayList<DemoData> demoDataArrayList;

    public Radapter(Context context, ArrayList<DemoData> demoDataArrayList) {
        this.context = context;
        this.demoDataArrayList = demoDataArrayList;
    }


    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.layout,parent, false);
        return new viewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.name.setText(demoDataArrayList.get(position).getName());
        holder.rollno.setText(String.valueOf(demoDataArrayList.get(position).getRollno()));

    }

    @Override
    public int getItemCount() {
        return demoDataArrayList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView rollno;
        private TextView name;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.image);
            rollno=itemView.findViewById(R.id.rollno);
            name=itemView.findViewById(R.id.name);
        }
    }
}
