package com.example.instagramandroid1.heart;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instagramandroid1.R;
import com.example.instagramandroid1.databinding.FragmentLikeeBinding;

import java.util.ArrayList;


public class LikeeFragment extends Fragment {
    private FragmentLikeeBinding binding;
    private ArrayList<ModelLike> data;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentLikeeBinding.inflate(LayoutInflater.from(requireActivity()),container,false);
        // Inflate the layout for this fragment
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState); 
        loadData();
        AdapterLike adapterLike =new AdapterLike(data);
        binding.newRecycler.setAdapter(adapterLike);
    }

    private void loadData() {
        data=new ArrayList<>();
        data.add(new ModelLike (R.drawable.oval,R.drawable.squarepicture,"karennne liked your photo. 1h"));
        data.add(new ModelLike(R.drawable.oval,R.drawable.squarepicture,"karennne liked your photo. 1h"));
        data.add(new ModelLike(R.drawable.oval,R.drawable.squarepicture,"karennne liked your photo. 1h"));
        data.add(new ModelLike(R.drawable.oval,R.drawable.squarepicture,"karennne liked your photo. 1h"));

    }
}