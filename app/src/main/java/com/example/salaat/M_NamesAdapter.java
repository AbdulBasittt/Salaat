package com.example.salaat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class M_NamesAdapter extends RecyclerView.Adapter<M_NamesAdapter.MyViewHolder>  {
    public M_NamesAdapter(Context mcontext, List<M_NamesModel> mlist) {
        this.mcontext = mcontext;
        this.mlist = mlist;
    }

    private Context mcontext;
 private List<M_NamesModel> mlist;
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view= LayoutInflater.from(mcontext).inflate(R.layout.item_names,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_name.setText(mlist.get(position).getName());
        holder.tv_phone.setText(mlist.get(position).getDisc());
        holder.img.setImageResource(mlist.get(position).getPhoto());
        holder.tv_urdu.setText(mlist.get(position).getUrduName());

    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_name;
        private TextView tv_phone;
        private ImageView img;
        private TextView tv_urdu;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name=itemView.findViewById(R.id.name_contactm);
            tv_phone=itemView.findViewById(R.id.phone_contactm);
            img=itemView.findViewById(R.id.img_numm);
            tv_urdu=itemView.findViewById(R.id.name_urdum);
        }
    }



}
