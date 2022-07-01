package com.creditline.Dreasy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class MainActivity2 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private BottomNavigationView bottomNavigationView2;
    private NavController navController2;
    private DrawerLayout drawerLayout2;
    private ActionBarDrawerToggle toggle2;
    private NavigationView navigationView2;
    Intent intent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setTitle("Home");

        bottomNavigationView2 = (BottomNavigationView) findViewById(R.id.home_nav2);
        navController2 = Navigation.findNavController(this, R.id.frame_layout2);

        drawerLayout2 = (DrawerLayout) findViewById(R.id.drawer_layout2);
        navigationView2 = (NavigationView) findViewById(R.id.nav_view2);

        toggle2 = new ActionBarDrawerToggle(this, drawerLayout2, R.string.nav_open, R.string.nav_close);

        drawerLayout2.addDrawerListener(toggle2);
        toggle2.syncState();

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        navigationView2.setNavigationItemSelectedListener(this);

        NavigationUI.setupWithNavController(bottomNavigationView2, navController2);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(toggle2.onOptionsItemSelected(item)){
            return true;
        }
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.contact_nav:
                intent2 = new Intent(this, Contact.class);
                startActivity(intent2);
                break;
            case R.id.info_nav:
                intent2 = new Intent(this, Info.class);
                startActivity(intent2);
                break;
            case R.id.settings_nav:
                intent2 = new Intent(this, SettingsActivity.class);
                startActivity(intent2);
                break;
            case R.id.sign_out_nav:
                intent2 = new Intent(this, Login.class);
                startActivity(intent2);
                Toast.makeText(MainActivity2.this, "Signed Out", Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }
}