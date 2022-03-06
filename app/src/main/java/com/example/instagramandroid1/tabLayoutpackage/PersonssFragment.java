package com.example.instagramandroid1.tabLayoutpackage;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instagramandroid1.R;
import com.example.instagramandroid1.databinding.FragmentPersonssBinding;
import com.example.instagramandroid1.person.tab2package.Tab2Fragment;
import com.example.instagramandroid1.person.TabsRecycler.Tab1Fragment;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;


public class PersonssFragment extends Fragment {
    private FragmentPersonssBinding binding;
    private Adapterpersonname adapter;
    private ArrayList<Model> fragments;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPersonssBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        // Inflate the layout for this fragment
        return binding.getRoot();


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fragments = new ArrayList<>();
        fragments.add(new Model(R.drawable.ic_grid_icon__1_, new Tab1Fragment()));
        fragments.add(new Model(R.drawable.ic_tags_icon, new Tab2Fragment()));
        adapter = new Adapterpersonname(this);
        adapter.setFragment(fragments);
        binding.pagerView.setAdapter(adapter);
        new TabLayoutMediator(binding.tabLayout, binding.pagerView, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setIcon(fragments.get(position).getIcon());


            }
        }).attach();
    }
}