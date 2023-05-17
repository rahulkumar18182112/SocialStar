package com.example.socialstar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class notify_fragment extends Fragment {
   RecyclerView notify_recycler;
    ArrayList<notify_str_class> model_N=new ArrayList<>();

/*

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
*/
    public notify_fragment() {
        // Required empty public constructor
    }



 /*
    public static notify_fragment newInstance(String param1, String param2) {
        notify_fragment fragment = new notify_fragment();
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
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_notify_fragment, container, false);
        notify_recycler=view.findViewById(R.id.notify_recycler);


        notify_recycler.setLayoutManager(new LinearLayoutManager(getContext()));

        model_N.add(new notify_str_class(R.drawable.ic_launcher_foreground,"raja","liked your post","11:5500am"));
        model_N.add(new notify_str_class(R.drawable.ic_launcher_foreground,"rakesh","liked your post","11:5500am"));
        model_N.add(new notify_str_class(R.drawable.ic_launcher_foreground,"rahul","liked your post","11:5500am"));
        model_N.add(new notify_str_class(R.drawable.ic_launcher_foreground,"rajesh","liked your post","11:5500am"));
        model_N.add(new notify_str_class(R.drawable.ic_launcher_foreground,"Ramakant","liked your post","11:5500am"));
        model_N.add(new notify_str_class(R.drawable.ic_launcher_foreground,"Ram","liked your post","11:5500am"));



        Notifi_adapter adapter=new Notifi_adapter(getContext(),model_N);
        notify_recycler.setAdapter(adapter);




        return view;
    }
}