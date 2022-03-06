package com.example.instagramandroid1.person.tab2package;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instagramandroid1.R;
import com.example.instagramandroid1.databinding.FragmentTab2Binding;
import com.example.instagramandroid1.person.TabsRecycler.Modeltab1;

import java.util.ArrayList;


public class Tab2Fragment extends Fragment {
    private FragmentTab2Binding binding;
    ArrayList<Modeltab1> list2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentTab2Binding.inflate(LayoutInflater.from(requireActivity()), container, false);
        // Inflate the layout for this fragment
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listData();
        AdapterTab2 adapterTab2 = new AdapterTab2(list2);
        binding.RecyclerViewTab2.setAdapter(adapterTab2);
    }

    private void listData() {
        list2 = new ArrayList<>();
        list2.add(new Modeltab1(R.drawable.picturefortab));
        list2.add(new Modeltab1(R.drawable.picturefortab));
        list2.add(new Modeltab1(R.drawable.picturefortab));
        list2.add(new Modeltab1(R.drawable.picturefortab));
        list2.add(new Modeltab1(R.drawable.picturefortab));
        list2.add(new Modeltab1(R.drawable.picturefortab));
        list2.add(new Modeltab1(R.drawable.picturefortab));
        list2.add(new Modeltab1(R.drawable.picturefortab));
        list2.add(new Modeltab1(R.drawable.picturefortab));
        list2.add(new Modeltab1(R.drawable.picturefortab));
        list2.add(new Modeltab1(R.drawable.picturefortab));
        list2.add(new Modeltab1(R.drawable.picturefortab));
        list2.add(new Modeltab1(R.drawable.picturefortab));
        list2.add(new Modeltab1(R.drawable.picturefortab));
        list2.add(new Modeltab1(R.drawable.picturefortab));
        list2.add(new Modeltab1(R.drawable.picturefortab));
        list2.add(new Modeltab1(R.drawable.picturefortab));
        list2.add(new Modeltab1(R.drawable.picturefortab));

    }
}