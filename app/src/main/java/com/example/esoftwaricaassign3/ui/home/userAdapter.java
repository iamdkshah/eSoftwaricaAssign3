package com.example.esoftwaricaassign3.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.esoftwaricaassign3.R;
import com.example.esoftwaricaassign3.ui.dashboard.UserModel;

import java.util.List;
import java.util.zip.Inflater;

public class userAdapter extends RecyclerView.Adapter<userAdapter.UserHolder> {
    List<UserModel> data;

    public userAdapter(List<UserModel> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_list,parent,false);
            UserHolder holderObject = new UserHolder(view);
        return holderObject;
    }

    @Override
    public void onBindViewHolder(@NonNull UserHolder holder, int position) {
        final UserModel users = data.get(position);
        holder.tvName.setText(users.getName());
        holder.tvGender.setText(users.getGender());
        holder.tvAge.setText(users.getAge());
        holder.tvAddress.setText(users.getAddress());
        holder.tvImage.setImageResource(R.drawable.user);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class UserHolder extends RecyclerView.ViewHolder{

        TextView tvName, tvAge,tvAddress, tvGender;
        ImageView tvImage;
        Button tvDelete;
        public UserHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.editName);
            tvAddress = itemView.findViewById(R.id.editAddress);
            tvAge = itemView.findViewById(R.id.editAge);
            tvGender = itemView.findViewById(R.id.checkGender);
            tvImage = itemView.findViewById(R.id.userImage);
            tvDelete = itemView.findViewById(R.id.deleteUser);

        }
    }
}
