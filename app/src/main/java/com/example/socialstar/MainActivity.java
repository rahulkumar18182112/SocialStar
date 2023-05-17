package com.example.socialstar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
BottomNavigationView bottom_nav;
FrameLayout container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottom_nav=findViewById(R.id.bottom_nav);
        container=findViewById(R.id.container);
        loadFragment(new Home_fragment(),true);


        bottom_nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId=item.getItemId();
                if(itemId==R.id.home){
                    loadFragment(new Home_fragment(),false);

                }else if(itemId==R.id.search){
                    loadFragment(new search_fragment(),false);

                }else if(itemId==R.id.post)
                {
                    loadFragment(new post_fragment(),false);

                }else if(itemId==R.id.notify){
                    loadFragment(new Notification_fragment(),false);

                }else if(itemId==R.id.profile){
                    loadFragment(new Profile_fragment(),false);

                }



                return false;
            }
        });
    }
    public void loadFragment(Fragment fragment,boolean flag){
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        if(flag){
            ft.add(R.id.container,fragment);

        }else
        {
            ft.replace(R.id.container,fragment);
        }
        ft.commit();

    }

}