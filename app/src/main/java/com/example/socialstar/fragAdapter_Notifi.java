package com.example.socialstar;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class fragAdapter_Notifi extends FragmentStateAdapter {
    String [] titles={"Notifications","Requests"};

    public fragAdapter_Notifi(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new notify_fragment();

            case 1:
                return new Request_fragment();


        }
        return null;
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
