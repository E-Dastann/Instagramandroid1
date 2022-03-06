package com.example.instagramandroid1.tabLayoutpackage;

import androidx.fragment.app.Fragment;

import com.example.instagramandroid1.person.TabsRecycler.Modeltab1;

public class Model {
    private Integer Icon;
    private Fragment fragmentName;

    public Model(Integer icon, Fragment fragment) {
        Icon = icon;
        this.fragmentName = fragment;
    }

    public Integer getIcon() {
        return Icon;
    }

    public void setIcon(Integer icon) {
        Icon = icon;
    }

    public Fragment getFragmentName() {
        return fragmentName;
    }

    public void setFragmentName(Fragment fragmentName) {
        this.fragmentName = fragmentName;
    }
}
