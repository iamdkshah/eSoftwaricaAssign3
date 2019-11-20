package com.example.esoftwaricaassign3.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.esoftwaricaassign3.R;
import com.example.esoftwaricaassign3.ui.dashboard.addUser;

public class HomeFragment extends Fragment {
    RecyclerView userRV;

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        userRV = root.findViewById(R.id.rv);

        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                userAdapter homeUserAdapter = new userAdapter(addUser.userDetails);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
                userRV.setLayoutManager(layoutManager);
                userRV.setAdapter(homeUserAdapter);
            }
        });
        return root;
    }
}