package com.example.instagramandroid1.person.TabsRecycler;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagramandroid1.databinding.ItemTab1Binding;

import java.util.ArrayList;

public class AdapterTabs1  extends RecyclerView.Adapter<AdapterTabs1.ViewHolderTabs1> {
    private ArrayList<Modeltab1> list;

    public AdapterTabs1(ArrayList<Modeltab1> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolderTabs1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderTabs1(ItemTab1Binding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderTabs1 holder, int position) {
        holder.bind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class ViewHolderTabs1 extends RecyclerView.ViewHolder {
        private ItemTab1Binding binding;
        public ViewHolderTabs1(@NonNull ItemTab1Binding itemView) {
            super(itemView.getRoot());
            binding=itemView;
        }

        public void bind(Modeltab1 modeltab1) {
            binding.imageGrid.setImageResource(modeltab1.getPicture());
        }
    }
}
