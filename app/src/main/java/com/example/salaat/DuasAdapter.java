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

public class DuasAdapter extends RecyclerView.Adapter<DuasAdapter.MyViewHolder>  {
    private Context mcontext;
    private List<DuasModel> list_dua;
    private OnItemClickListener mListener;


    public DuasAdapter(Context mcontext, List<DuasModel> list_dua) {
        this.mcontext = mcontext;
        this.list_dua = list_dua;
    }
    public  void setOnItemClickListener(OnItemClickListener listener){
        mListener=listener;

    }
    public interface OnItemClickListener {
        void OnItemClick(int position);
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_name;
        private ImageView img;
        private TextView tv_arabic;
        private TextView tv_translation;
        private TextView tv_refrence;

        public MyViewHolder(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);

            tv_name=itemView.findViewById(R.id.name_dua);
            img=itemView.findViewById(R.id.img_dua);
            tv_arabic=itemView.findViewById(R.id.arabictv);
            tv_translation=itemView.findViewById(R.id.eng_translation);
            tv_refrence=itemView.findViewById(R.id.refernecetv);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                if (listener!=null){
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION){
                        listener.OnItemClick( position );
                    }
                }
                }
            });
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view= LayoutInflater.from(mcontext).inflate(R.layout.item_dua,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view,mListener);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_name.setText(list_dua.get(position).getDua_Name());
        holder.img.setImageResource(list_dua.get(position).getDua_Photo());
        holder.tv_arabic.setText(list_dua.get(position).getDua_Arabic());
        holder.tv_translation.setText(list_dua.get(position).getDua_Translation());
        holder.tv_refrence.setText(list_dua.get(position).getDua_Reference());


    }

    @Override
    public int getItemCount() {
        return list_dua.size();
    }


}
