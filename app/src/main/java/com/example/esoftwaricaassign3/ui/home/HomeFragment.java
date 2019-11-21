package com.example.esoftwaricaassign3.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.esoftwaricaassign3.R;
import com.example.esoftwaricaassign3.adapters.StudentAdapter;
import com.example.esoftwaricaassign3.ui.dashboard.AddStudents;

public class HomeFragment extends Fragment {
    RecyclerView userRV;

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_home, container, false);

        userRV = root.findViewById(R.id.rv);

        StudentAdapter homeUserAdapter = new StudentAdapter(root.getContext(), AddStudents.userDetails);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        userRV.setLayoutManager(layoutManager);
        userRV.setAdapter(homeUserAdapter);

        return root;
    }
}