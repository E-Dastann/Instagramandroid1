package com.example.instagramandroid1.person.TabsRecycler;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instagramandroid1.R;
import com.example.instagramandroid1.databinding.FragmentTab1Binding;

import java.util.ArrayList;


public class Tab1Fragment extends Fragment {
    private FragmentTab1Binding binding;
    private ArrayList<Modeltab1> data;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentTab1Binding.inflate(LayoutInflater.from(getContext()),container,false);

        // Inflate the layout for this fragment
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        AdapterTabs1 adapterTabs1 = new AdapterTabs1(data);
        binding.imageRecycler.setAdapter(adapterTabs1); }

    private void loadData() {
        data= new ArrayList<>();
        data.add(new Modeltab1(R.drawable.picturefortab));
        data.add(new Modeltab1(R.drawable.picturefortab));
        data.add(new Modeltab1(R.drawable.picturefortab));
        data.add(new Modeltab1(R.drawable.picturefortab));
        data.add(new Modeltab1(R.drawable.picturefortab));
        data.add(new Modeltab1(R.drawable.picturefortab));
        data.add(new Modeltab1(R.drawable.picturefortab));
        data.add(new Modeltab1(R.drawable.picturefortab));
        data.add(new Modeltab1(R.drawable.picturefortab));
        data.add(new Modeltab1(R.drawable.picturefortab));
        data.add(new Modeltab1(R.drawable.picturefortab));
        data.add(new Modeltab1(R.drawable.picturefortab));
        data.add(new Modeltab1(R.drawable.picturefortab));
        data.add(new Modeltab1(R.drawable.picturefortab));
        data.add(new Modeltab1(R.drawable.picturefortab));
        data.add(new Modeltab1(R.drawable.picturefortab));
        data.add(new Modeltab1(R.drawable.picturefortab));
    }
}