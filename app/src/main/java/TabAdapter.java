package com.example.demobai3.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.demobai3.Tab1Fragment;
import com.example.demobai3.Tab2Fragment;

public class TabAdapter extends FragmentStateAdapter {

    public TabAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return (position == 0) ? new Tab1Fragment() : new Tab2Fragment();
    }

    @Override
    public int getItemCount() {
        return 2; // Số lượng tab
    }
}
