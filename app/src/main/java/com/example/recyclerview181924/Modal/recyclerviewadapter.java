package com.example.recyclerview181924.Modal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview181924.R;

import java.util.List;

public class recyclerviewadapter extends RecyclerView.Adapter<recyclerviewadapter.ViewHolder> {
    List<student> studentList;
    Context context;

    public recyclerviewadapter(List<student> studentList, Context context) {
        this.studentList = studentList;
        this.context = context;
    }

    @NonNull
    @Override
    public recyclerviewadapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerviewadapter.ViewHolder holder, int position) {
    student student= studentList.get(position);
    holder.txtName.setText(student.getName());
    holder.textRollno.setText(student.getRollno());
    }

    @Override
    public int getItemCount()
    {
        return studentList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    TextView txtName,textRollno;
    Button btn181924;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName=itemView.findViewById(R.id.t2);
            textRollno=itemView.findViewById(R.id.txt1);
            btn181924=itemView.findViewById(R.id.btn1);
            itemView.setOnClickListener(this);
            btn181924.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    studentList.remove(getAdapterPosition());
                    notifyItemRemoved(getAdapterPosition());
                }
            });

        }

        @Override
        public void onClick(View v) {
            Toast.makeText(context,studentList.get(getAdapterPosition()).getName(),Toast.LENGTH_LONG);
        }
    }
}



