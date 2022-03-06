package com.example.instagramandroid1.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instagramandroid1.R;
import com.example.instagramandroid1.databinding.FragmentHomeBinding;

import java.util.ArrayList;


public class  HomeFragment extends Fragment {
    private FragmentHomeBinding binding;
    private ArrayList<ModelHome> modelHomes;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(LayoutInflater.from(requireActivity()), container, false);

        // Inflate the layout for this fragment
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        HomeAdapter homeAdapter = new HomeAdapter(modelHomes);
        binding.RecyclerView.setAdapter(homeAdapter);

    }

    private void loadData() {
        modelHomes = new ArrayList<>();
        modelHomes.add(new ModelHome(R.drawable.photo_resicler, "joshua_l The game in Japan was amazing and I want to share some photos", "Septenber 16"));
        modelHomes.add(new ModelHome(R.drawable.photo_resicler, "joshua_l The game in Japan was amazing and I want to share some photos", "Septenber 16"));
        modelHomes.add(new ModelHome(R.drawable.photo_resicler, "joshua_l The game in Japan was amazing and I want to share some photos", "Septenber 16"));
        modelHomes.add(new ModelHome(R.drawable.photo_resicler, "joshua_l The game in Japan was amazing and I want to share some photos", "Septenber 16"));
        modelHomes.add(new ModelHome(R.drawable.photo_resicler, "joshua_l The game in Japan was amazing and I want to share some photos", "Septenber 16"));
        modelHomes.add(new ModelHome(R.drawable.photo_resicler, "joshua_l The game in Japan was amazing and I want to share some photos", "Septenber 16"));
        modelHomes.add(new ModelHome(R.drawable.photo_resicler, "joshua_l The game in Japan was amazing and I want to share some photos", "Septenber 16"));
        modelHomes.add(new ModelHome(R.drawable.photo_resicler, "joshua_l The game in Japan was amazing and I want to share some photos", "Septenber 16"));
        modelHomes.add(new ModelHome(R.drawable.photo_resicler, "joshua_l The game in Japan was amazing and I want to share some photos", "Septenber 16"));
        modelHomes.add(new ModelHome(R.drawable.photo_resicler, "joshua_l The game in Japan was amazing and I want to share some photos", "Septenber 16"));
        modelHomes.add(new ModelHome(R.drawable.photo_resicler, "joshua_l The game in Japan was amazing and I want to share some photos", "Septenber 16"));
        modelHomes.add(new ModelHome(R.drawable.photo_resicler, "joshua_l The game in Japan was amazing and I want to share some photos", "Septenber 16"));

    }
}