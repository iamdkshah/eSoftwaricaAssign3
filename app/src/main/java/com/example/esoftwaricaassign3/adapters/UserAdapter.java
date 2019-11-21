package com.example.esoftwaricaassign3.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.esoftwaricaassign3.R;
import com.example.esoftwaricaassign3.models.UserModel;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder> {
    Context context;
    List<UserModel> data;

    public UserAdapter(Context context,List<UserModel> data) {

        this.context = context;
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
    public void onBindViewHolder(@NonNull UserHolder holder, final int position) {
        final UserModel users = data.get(position);
        holder.tvName.setText(users.getName());
        holder.tvGender.setText(users.getGender());
        holder.tvAge.setText(users.getAge());
        holder.tvAddress.setText(users.getAddress());


        if (users.getGender().equals("male")){
            holder.tvImage.setImageResource(R.drawable.user);
        }else if (users.getGender().equals("female")){
            holder.tvImage.setImageResource(R.drawable.userf);
        }else if (users.getGender().equals("other")){
            holder.tvImage.setImageResource(R.drawable.usero);
        }


        holder.tvDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.remove(users);
                notifyItemRemoved(position);
            }
        });
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
            tvName = itemView.findViewById(R.id.userName);
            tvAddress = itemView.findViewById(R.id.userAd);
            tvAge = itemView.findViewById(R.id.userAge);
            tvGender = itemView.findViewById(R.id.userGender);
            tvImage = itemView.findViewById(R.id.userImage);
            tvDelete = itemView.findViewById(R.id.deleteUser);

        }
    }
}
