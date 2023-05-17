package com.example.socialstar;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;


public class Notification_fragment extends Fragment {
   ViewPager2 pager;
   TabLayout tab;
   Toolbar toolbar;
   String[] titles= new String[]{"Notifications","Requests"};

/*
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
*/
    public Notification_fragment() {
        // Required empty public constructor
    }

   /*
    public static Notification_fragment newInstance(String param1, String param2) {
        Notification_fragment fragment = new Notification_fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_notification_fragment, container, false);
      pager=view.findViewById(R.id.pager);
      tab=view.findViewById(R.id.tab);
      toolbar=view.findViewById(R.id.noti_toolbar);

        fragAdapter_Notifi fm=new fragAdapter_Notifi((FragmentActivity) getContext());
        pager.setAdapter(fm);
        new TabLayoutMediator(tab,pager,((tab1, position) -> tab1.setText(titles[position]))).attach();


        return view;
    }
}