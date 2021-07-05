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
import com.myapplication.schoopwhoopassignment.models.PremiumModel;
import com.squareup.picasso.Callback;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;

public class PremiumShowsAdapter extends RecyclerView.Adapter<PremiumShowsAdapter.MyViewHolder> {

  private ArrayList<PremiumModel.PremiumData> premiumData;
  private Context context;

  public PremiumShowsAdapter (ArrayList<PremiumModel.PremiumData> premiumData, Context context) {
    this.context = context;
    this.premiumData = premiumData;
  }
  @NonNull
  @org.jetbrains.annotations.NotNull
  @Override
  public MyViewHolder onCreateViewHolder(
      @NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
    View view = LayoutInflater
        .from(parent.getContext()).inflate(R.layout.item_carousel_image, parent, false);
    return new MyViewHolder(view);

  }

  @Override
  public void onBindViewHolder(
      @NonNull @org.jetbrains.annotations.NotNull PremiumShowsAdapter.MyViewHolder holder,
      int position) {
    try {
      Picasso.with(context)
          .load(premiumData.get(position).getVideoThumbnail16x9())
          .placeholder(R.drawable.ic_launcher_background)
          .networkPolicy(NetworkPolicy.OFFLINE)
          .into(holder.imageView, new Callback() {
            @Override
            public void onSuccess() {

            }

            @Override
            public void onError() {
              Picasso.with(context)
                  .load(premiumData.get(position).getVideoThumbnail16x9())
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

  }

  @Override
  public int getItemCount() {
    return premiumData.size();
  }

  class MyViewHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    public MyViewHolder(
        @NonNull @org.jetbrains.annotations.NotNull View itemView) {
      super(itemView);
      imageView = itemView.findViewById(R.id.imgBanner);
    }
  }
}
