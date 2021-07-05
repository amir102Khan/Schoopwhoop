package com.myapplication.schoopwhoopassignment.ui.fragments;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.myapplication.schoopwhoopassignment.R;
import com.myapplication.schoopwhoopassignment.adapter.EditorsChoiceShowsAdapter;
import com.myapplication.schoopwhoopassignment.adapter.LatestShowsAdapter;
import com.myapplication.schoopwhoopassignment.adapter.PremiumShowsAdapter;
import com.myapplication.schoopwhoopassignment.adapter.TopShowsAdapter;
import com.myapplication.schoopwhoopassignment.core.BaseFragment;
import com.myapplication.schoopwhoopassignment.core.MyViewPagerAdapter;
import com.myapplication.schoopwhoopassignment.databinding.FragmentHomeBinding;
import com.myapplication.schoopwhoopassignment.models.Datum;
import com.myapplication.schoopwhoopassignment.models.EditorsChoiceModel;
import com.myapplication.schoopwhoopassignment.models.LatestVideosModel;
import com.myapplication.schoopwhoopassignment.models.PremiumModel;
import com.myapplication.schoopwhoopassignment.models.TopShowsModel;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import com.google.gson.reflect.TypeToken;

import java.io.FileOutputStream;
import java.lang.reflect.Type;


public class Home extends BaseFragment {


  private FragmentHomeBinding homeBinding;
  private LatestShowsAdapter latestShowsAdapter;
  private TopShowsAdapter topShowsAdapter;
  private EditorsChoiceShowsAdapter editorsChoiceShowsAdapter;
  private PremiumShowsAdapter premiumShowsAdapter;
  private ArrayList<PremiumModel.PremiumData> premiumData = new ArrayList<>();
  private ArrayList<Datum> latestVideos = new ArrayList<>();
  private ArrayList<Datum> editorsChoiceVideos = new ArrayList<>();
  private ArrayList<TopShowsModel.TopData> topShows = new ArrayList<>();
  private MyViewPagerAdapter myViewPagerAdapter;
  private Timer timer;
  private int currentPage = 0;


  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (getArguments() != null) {

    }
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    // Inflate the layout for this fragment
     homeBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
    return homeBinding.getRoot();
  }

  @Override
  public void onViewCreated(@NonNull @NotNull View view, @Nullable
  @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    setEmptyAdapter();
    getData();
  }

  private void setEmptyAdapter() {

    homeBinding.viewPager.setPageMargin(30);
    homeBinding.viewPager.setPageTransformer(false, new ViewPager.PageTransformer() {
      @Override
      public void transformPage(@NonNull View page, float position) {
        float smallerScale= 0.7f;
        float startOffset=0;
        float absPosition = Math.abs(position - startOffset);

        if (absPosition >= 1) {
          // page.setElevation(baseElevation);
          page.setScaleY(smallerScale);
        } else {
          // This will be during transformation
          //page.setElevation(((1 - absPosition) * raisingElevation + baseElevation));
          page.setScaleY((smallerScale - 1) * absPosition + 1);
        }
      }
    });

    myViewPagerAdapter = new MyViewPagerAdapter(mContext, premiumData);
    homeBinding.viewPager.setAdapter(myViewPagerAdapter);

    homeBinding.tabLayout.setupWithViewPager(homeBinding.viewPager,true);

    homeBinding.rvLatest.setLayoutManager(new LinearLayoutManager(getContext(),
        LinearLayoutManager.HORIZONTAL,
        false));
    latestShowsAdapter = new LatestShowsAdapter(latestVideos, getContext());
    homeBinding.rvLatest.setAdapter(latestShowsAdapter);

    homeBinding.rvEditors.setLayoutManager(new LinearLayoutManager(getContext(),
        LinearLayoutManager.HORIZONTAL,
        false));
    editorsChoiceShowsAdapter = new EditorsChoiceShowsAdapter(editorsChoiceVideos, getContext());
    homeBinding.rvEditors.setAdapter(editorsChoiceShowsAdapter);

    homeBinding.rvTop.setLayoutManager(new LinearLayoutManager(getContext(),
        LinearLayoutManager.HORIZONTAL,
        false));
    topShowsAdapter = new TopShowsAdapter(topShows, getContext());
    homeBinding.rvTop.setAdapter(topShowsAdapter);
  }

  private void getData() {
    if (checkInternetConnection()){
      getPremiumVideos();

    } else {
      showToast("Please check your internet connection");
    }
  }
  private void getPremiumVideos() {
    call = api.getPremiumVideos();
    call.enqueue(new Callback<ResponseBody>() {
      @Override
      public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
        try {
          Type type = new TypeToken<PremiumModel>(){}.getType();
          if (response.code() == 200) {
            PremiumModel data = gson.fromJson(response.body().string(), type);
            premiumData.addAll(data.getData());
            myViewPagerAdapter.notifyDataSetChanged();
            setupAutoPager();
          }
          else {
            showToast("not able to load latest videos");
          }
        }
        catch (Exception exception) {
          Log.e("error",exception.getMessage());
        }

        getLatestShows();
      }

      @Override
      public void onFailure(Call<ResponseBody> call, Throwable t) {
        showToast("not able to load latest videos");
        getLatestShows();
      }
    });
  }

  private void setupAutoPager() {
    final Handler handler = new Handler();

    final Runnable update = new Runnable() {
      public void run() {


        homeBinding.viewPager.setCurrentItem(currentPage, true);
        if(currentPage == premiumData.size() - 1) {
          currentPage = 0;
        }
        else {
          ++currentPage ;
        }
        int j = 9;
      }
    };


    timer = new Timer();
    timer.schedule(new TimerTask() {

      @Override
      public void run() {
        handler.post(update);
      }
    }, 2000, 2500);
  }

  private void getLatestShows() {
    call = api.getLatestVideos();
    call.enqueue(new Callback<ResponseBody>() {
      @Override
      public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
        try {
          Type type = new TypeToken<LatestVideosModel>(){}.getType();
          if (response.code() == 200) {
            LatestVideosModel data = gson.fromJson(response.body().string(), type);
            latestVideos.addAll(data.getData());
            latestShowsAdapter.notifyDataSetChanged();
          }
          else {
            showToast("not able to load latest videos");
          }
        }
        catch (Exception exception) {
          Log.e("error",exception.getMessage());
        }
        getEditorsChoice();
      }

      @Override
      public void onFailure(Call<ResponseBody> call, Throwable t) {
        showToast("not able to load latest videos");
        getEditorsChoice();
      }
    });
  }

  private void getEditorsChoice() {
    call = api.getEditorsChoiceVideos();
    call.enqueue(new Callback<ResponseBody>() {
      @Override
      public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
        try {
          Type type = new TypeToken<EditorsChoiceModel>(){}.getType();
          if (response.code() == 200) {
            EditorsChoiceModel data = gson.fromJson(response.body().string(), type);
            editorsChoiceVideos.addAll(data.getData());
            editorsChoiceShowsAdapter.notifyDataSetChanged();
          }
          else {
            showToast("not able to load editors videos");
          }
        }
        catch (Exception exception) {
          Log.e("error",exception.getMessage());
        }
        getTopShows();
      }

      @Override
      public void onFailure(Call<ResponseBody> call, Throwable t) {
        showToast("not able to load editors videos");
        getTopShows();
      }
    });
  }

  private void getTopShows() {
    call = api.getTopShows();
    call.enqueue(new Callback<ResponseBody>() {
      @Override
      public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
        try {
          Type type = new TypeToken<TopShowsModel>(){}.getType();
          if (response.code() == 200) {
            TopShowsModel data = gson.fromJson(response.body().string(), type);
            topShows.addAll(data.getData());
            topShowsAdapter.notifyDataSetChanged();
          }
          else {
            showToast("not able to load top videos");
          }
        }
        catch (Exception exception) {
          Log.e("error",exception.getMessage());
        }
      }

      @Override
      public void onFailure(Call<ResponseBody> call, Throwable t) {
        showToast("not able to load top videos");
      }
    });
  }
}