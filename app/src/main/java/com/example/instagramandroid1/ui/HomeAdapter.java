package com.example.instagramandroid1.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagramandroid1.databinding.ItemHomeBinding;

import java.util.ArrayList;


public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolderHome> {
    private ArrayList<ModelHome> data;

    public HomeAdapter(ArrayList<ModelHome> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolderHome onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderHome(ItemHomeBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderHome holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ViewHolderHome extends RecyclerView.ViewHolder {
        private ItemHomeBinding binding;

        public ViewHolderHome(@NonNull ItemHomeBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;

        }

        public void bind(ModelHome modelHome) {
            binding.imageRecycler.setImageResource(modelHome.getImageView());
            binding.textUnder.setText(modelHome.getTextViewMore());
            binding.textMonth.setText(modelHome.getTextViewMonth());
        }
    }
}
