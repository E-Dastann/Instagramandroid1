package com.example.instagramandroid1.heart;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagramandroid1.databinding.FragmentLikeeBinding;
import com.example.instagramandroid1.databinding.ItemlikeeBinding;

import java.util.ArrayList;

public class AdapterLike extends RecyclerView.Adapter<AdapterLike.ViewHolderLike> {
    private ArrayList<ModelLike> data;

    public AdapterLike(ArrayList<ModelLike> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolderLike onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderLike(ItemlikeeBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderLike holder, int position) {
        holder.bind(data.get(position));

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ViewHolderLike extends RecyclerView.ViewHolder {
        private ItemlikeeBinding binding;


        public ViewHolderLike(@NonNull ItemlikeeBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(ModelLike modelLike) {
            binding.imageOval.setImageResource(modelLike.getPhotoOval());
            binding.square.setImageResource(modelLike.getPhotoSquare());
            binding.textMore.setText(modelLike.getWordName());
        }
    }
}
