package com.kh_sof_dev.soug.View.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toolbar;

import com.kh_sof_dev.soug.R;

public class Main_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity);

        /** TODO ***************************DRAWER new Library********************************/
        ImageView hamMenu = findViewById(R.id.menu_btn);

        hamMenu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                DrawerLayout navDrawer = findViewById(R.id.drawer_layout);
                // If the navigation drawer is not open then open it, if its already open then close it.
                if(!navDrawer.isDrawerOpen(GravityCompat.START))
                    navDrawer.openDrawer(GravityCompat.START);
                else navDrawer.closeDrawer(GravityCompat.END);
            }
        });
    }
}
