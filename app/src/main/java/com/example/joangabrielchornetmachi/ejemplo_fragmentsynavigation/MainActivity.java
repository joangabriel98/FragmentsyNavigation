package com.example.joangabrielchornetmachi.ejemplo_fragmentsynavigation;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.joangabrielchornetmachi.ejemplo_fragmentsynavigation.Fragments.CameraFragment;
import com.example.joangabrielchornetmachi.ejemplo_fragmentsynavigation.Fragments.GalleryFragment;
import com.example.joangabrielchornetmachi.ejemplo_fragmentsynavigation.Fragments.ManageFragment;
import com.example.joangabrielchornetmachi.ejemplo_fragmentsynavigation.Fragments.SlideShowFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);




    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            //Paso 1: instanciar el nuevo fragment
            CameraFragment cameraFragment=new CameraFragment();

            //Paso 2: Colocar el nuevo fragment en su zona visible
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, cameraFragment).commit();

        } else if (id == R.id.nav_gallery) {
            //Paso 1: instanciar el nuevo fragment
            GalleryFragment galleryFragment=new GalleryFragment();

            //Paso 2: Colocar el nuevo fragment en su zona visible
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, galleryFragment).commit();

        } else if (id == R.id.nav_slideshow) {
            //Paso 1: instanciar el nuevo fragment
           SlideShowFragment slideFragment=new SlideShowFragment();

            //Paso 2: Colocar el nuevo fragment en su zona visible
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, slideFragment).commit();

        } else if (id == R.id.nav_manage) {

            //Paso 1: instanciar el nuevo fragment
           ManageFragment manageFragment=new ManageFragment();

            //Paso 2: Colocar el nuevo fragment en su zona visible
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, manageFragment).commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
