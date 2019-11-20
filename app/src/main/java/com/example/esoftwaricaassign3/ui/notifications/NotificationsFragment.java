package com.example.esoftwaricaassign3.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.esoftwaricaassign3.R;

public class NotificationsFragment extends Fragment {

    WebView aboutUs;

    private NotificationsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);

        aboutUs = root.findViewById(R.id.aboutUs);
//        final TextView textView = root.findViewById(R.id.aboutUs);
//        notificationsViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        aboutUs.getSettings().setJavaScriptEnabled(true);
        aboutUs.setWebViewClient(new WebViewClient());
        aboutUs.loadUrl("https://softwarica.edu.np");
        return root;
    }
}