package com.myapplication.schoopwhoopassignment.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.myapplication.schoopwhoopassignment.R;
import com.myapplication.schoopwhoopassignment.models.Datum;
import com.squareup.picasso.Callback;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;

public class LatestShowsAdapter extends RecyclerView.Adapter<LatestShowsAdapter.MyViewHolder> {

  private ArrayList<Datum> latestVideos;
  private Context context;

  public LatestShowsAdapter(ArrayList<Datum> latestVideos, Context context) {
    this.latestVideos = latestVideos;
    this.context = context;
  }

  @NonNull
  @org.jetbrains.annotations.NotNull
  @Override
  public MyViewHolder onCreateViewHolder(
      @NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
    View view = LayoutInflater
        .from(parent.getContext()).inflate(R.layout.item_image, parent, false);
    return new MyViewHolder(view);

  }

  @Override
  public void onBindViewHolder(
      @NonNull @org.jetbrains.annotations.NotNull LatestShowsAdapter.MyViewHolder holder,
      int position) {
    try {
      Picasso.with(context)
          .load(latestVideos.get(position).getFeatureImg())
          .placeholder(R.drawable.ic_launcher_background)
          .networkPolicy(NetworkPolicy.OFFLINE)
          .into(holder.imageView, new Callback() {
            @Override
            public void onSuccess() {

            }

            @Override
            public void onError() {
              Picasso.with(context)
                  .load(latestVideos.get(position).getFeatureImg())
                  .into(holder.imageView, new Callback() {
                    @Override
                    public void onSuccess() {

                    }

                    @Override
                    public void onError() {
                      Log.v("Picasso", "Could not fetch image");
                    }
                  });
            }
          });
    } catch (Exception e) {
      holder.imageView
          .setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_launcher_background));
    }

    if (latestVideos.get(position).getPremium()){
      holder.imgPremium.setVisibility(View.VISIBLE);
    }
    else {
      holder.imgPremium.setVisibility(View.GONE);
    }
  }

  @Override
  public int getItemCount() {
    return latestVideos.size();
  }

  class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    ImageView imgPremium;

    public MyViewHolder(
        @NonNull @org.jetbrains.annotations.NotNull View itemView) {
      super(itemView);
      imageView = itemView.findViewById(R.id.imgThumbnail);
      imgPremium = itemView.findViewById(R.id.imgPremium);
    }
  }
}
