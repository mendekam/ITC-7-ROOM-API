package com.example.eplstanding;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.eplstanding.database.Entity;

import java.util.ArrayList;
import java.util.Arrays;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private final Context context;

    TextView tvRank;
    ImageView ivLogo;

    ArrayList<Entity> entity;

    public Adapter(Context context, ArrayList<Entity> entity) {
        this.context = context;
        this.entity = entity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(entity.get(position));
    }

    @Override
    public int getItemCount() {
        return entity.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void onBind(Entity entity) {
            ArrayList<TextView> textViews = new ArrayList<>(
                    Arrays.asList(
                            itemView.findViewById(R.id.tv_nama),
                            itemView.findViewById(R.id.tv_win),
                            itemView.findViewById(R.id.tv_lose),
                            itemView.findViewById(R.id.tv_draw),
                            itemView.findViewById(R.id.tv_points)
                    )
            );
            tvRank = itemView.findViewById(R.id.tv_rank);
            ivLogo = itemView.findViewById(R.id.iv_logo);

            ArrayList<String> dataEntity = new ArrayList<>(
                    Arrays.asList(
                            entity.getNama(),
                            entity.getWin(),
                            entity.getLose(),
                            entity.getDraw(),
                            entity.getPoints()
                    )
            );

            for (int i = 0; i < dataEntity.size(); i++){
                textViews.get(i).setText(dataEntity.get(i));
            }
            tvRank.setText(String.valueOf(entity.getRank()));
            Glide.with(context)
                    .load(entity.getLogo())
                    .into(ivLogo);

        }

    }
}

