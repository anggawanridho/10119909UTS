package com.example.a10119909uts.ui.daily;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a10119909uts.R;

import java.util.ArrayList;

public class AdapterFriendlist extends RecyclerView.Adapter<AdapterFriendlist.myviewholder> {

    ArrayList<ModelFriendlist> modelFriendlist;

    public AdapterFriendlist(ArrayList<ModelFriendlist> modelFriendlist) {
        this.modelFriendlist = modelFriendlist;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_friendlist, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.ivFriendlist.setImageResource(modelFriendlist.get(position).getImage());
        holder.tvNama.setText(modelFriendlist.get(position).getNama());
    }

    @Override
    public int getItemCount() {
        return modelFriendlist.size();
    }

    static class myviewholder extends RecyclerView.ViewHolder {
        ImageView ivFriendlist;
        TextView tvNama;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            ivFriendlist = itemView.findViewById(R.id.iv_friendlist);
            tvNama = itemView.findViewById(R.id.tv_nama);
        }
    }
}
