package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class GameGridAdapter extends RecyclerView.Adapter<GameGridAdapter.ViewHolder> {
    ArrayList<Game> listGame = new ArrayList<>();

    public GameGridAdapter(ArrayList<Game> listGame) {
        this.listGame = listGame;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(listGame.get(position));
    }

    @Override
    public int getItemCount() {
        return listGame.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivGame;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivGame = itemView.findViewById(R.id.iv_game);
        }

        void bind(Game data) {
            Picasso.get()
                    .load(data.getImage())
                    .placeholder(R.drawable.ic_image_black_24dp)
                    .error(R.drawable.ic_image_black_24dp)
                    .into(ivGame);
        }
    }
}
