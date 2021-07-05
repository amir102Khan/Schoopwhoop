package com.myapplication.schoopwhoopassignment.ui.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import com.google.android.material.tabs.TabLayout;
import com.myapplication.schoopwhoopassignment.R;
import com.myapplication.schoopwhoopassignment.databinding.ActivitySchoopwhoopDashboardBinding;

public class SchoopwhoopDashboard extends AppCompatActivity {

  private NavController navController;
  private ActivitySchoopwhoopDashboardBinding dashboardBinding;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    dashboardBinding = DataBindingUtil.setContentView(this,
        R.layout.activity_schoopwhoop_dashboard);

    navController = Navigation.findNavController(this,R.id.nav_host_fragment);
    setUpTab();
    setTabListener();
  }

  private void setUpTab() {
    setCustomTabView( R.drawable.home_selcetor, "HOME");
    setCustomTabView( R.drawable.profile_selcetor, "PROFILE");
    setCustomTabView(R.drawable.menu_selcetor, "MENU");
  }

  private void setCustomTabView( int icon, String tabName) {
    LinearLayout customView = (LinearLayout) LayoutInflater
        .from(SchoopwhoopDashboard.this).inflate(R.layout.item_custom_tab, null);
    ((ImageView) customView.findViewById(R.id.ivIcon)).setImageResource(icon);
    ((TextView) customView.findViewById(R.id.tvName)).setText(tabName);

    dashboardBinding.tabs.addTab(dashboardBinding.tabs.newTab().setCustomView(customView));
  }

  private void setTabListener() {
    dashboardBinding.tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
      @Override
      public void onTabSelected(TabLayout.Tab tab) {
        switch (tab.getPosition()) {
          case 0:
            navController.navigate(R.id.home_fragment);
            break;
          case 1 :
            navController.navigate(R.id.profile_fragment);
            break;
          case 2:
            navController.navigate(R.id.menu_fragment);
            break;
        }
      }

      @Override
      public void onTabUnselected(TabLayout.Tab tab) {

      }

      @Override
      public void onTabReselected(TabLayout.Tab tab) {

      }
    });
  }
}