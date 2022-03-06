package com.example.instagramandroid1.person.tab2package;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagramandroid1.R;
import com.example.instagramandroid1.databinding.Itemtab2Binding;
import com.example.instagramandroid1.person.TabsRecycler.Modeltab1;
import com.example.instagramandroid1.tabLayoutpackage.Model;

import java.util.ArrayList;


public class AdapterTab2  extends RecyclerView.Adapter<AdapterTab2.ViewHolderTab2> {
    private ArrayList<Modeltab1> list2;

    public AdapterTab2(ArrayList<Modeltab1> list2) {
        this.list2 = list2;
    }

    @NonNull
    @Override
    public ViewHolderTab2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderTab2(Itemtab2Binding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderTab2 holder, int position) {
        holder.listData(list2.get(position));

    }

    @Override
    public int getItemCount() {
        return list2.size();
    }

    class ViewHolderTab2 extends RecyclerView.ViewHolder {
        private Itemtab2Binding binding;

        public ViewHolderTab2(@NonNull Itemtab2Binding itemView) {
            super(itemView.getRoot());
            binding=itemView;
        }

        public void listData(Modeltab1 modeltab1) {
            binding.imageTab2.setImageResource(modeltab1.getPicture());
        }
    }
}
