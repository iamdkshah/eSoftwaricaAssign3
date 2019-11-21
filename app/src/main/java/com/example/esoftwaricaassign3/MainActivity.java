package com.example.esoftwaricaassign3;

import android.os.Bundle;

import com.example.esoftwaricaassign3.adapters.UserAdapter;
import com.example.esoftwaricaassign3.models.UserModel;
import com.example.esoftwaricaassign3.ui.dashboard.AddUser;
import com.example.esoftwaricaassign3.ui.home.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AddUser.userDetails.add(new UserModel("Shah Rukh Khan", "54","Bandra, Mumbai", "male"));
        AddUser.userDetails.add(new UserModel("Gauri Khan", "50","Bandra, Mumbai", "female"));
        AddUser.userDetails.add(new UserModel("Aryan Khan", "22","Bandra, Mumbai", "male"));



        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
    }

}
