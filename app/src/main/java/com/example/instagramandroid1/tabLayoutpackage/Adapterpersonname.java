package com.example.instagramandroid1.tabLayoutpackage;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class Adapterpersonname extends FragmentStateAdapter {


    private ArrayList<Model>  fragment ;

    public Adapterpersonname(@NonNull Fragment fragment) {
        super(fragment);
    }


    public  void setFragment(ArrayList<Model> fragment){
        this.fragment= new ArrayList<>();
        this.fragment.addAll(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragment.get(position).getFragmentName();
    }

    @Override
    public int getItemCount() {
        return fragment.size();
    }
}
