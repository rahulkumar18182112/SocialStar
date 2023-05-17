package com.example.socialstar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;


public class Request_fragment extends Fragment {
  RecyclerView request_recycler;
  ArrayList<request_str> model_R=new ArrayList<>();



  /*
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
*/
    public Request_fragment() {
        // Required empty public constructor
    }

  /*
    public static Request_fragment newInstance(String param1, String param2) {
        Request_fragment fragment = new Request_fragment();
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
        View view= inflater.inflate(R.layout.fragment_request_fragment, container, false);
        request_recycler=view.findViewById(R.id.request_recycler);

        request_recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        model_R.add(new request_str(R.drawable.ic_launcher_background,"Raja","Raja have sended you frnd request","12:50pm"));
        model_R.add(new request_str(R.drawable.ic_launcher_background,"Raja","Raja have sended you frnd request","12:50pm"));
        model_R.add(new request_str(R.drawable.ic_launcher_background,"Raja","Raja have sended you frnd request","12:50pm"));
        model_R.add(new request_str(R.drawable.ic_launcher_background,"Raja","Raja have sended you frnd request","12:50pm"));
        model_R.add(new request_str(R.drawable.ic_launcher_background,"Raja","Raja have sended you frnd request","12:50pm"));
        model_R.add(new request_str(R.drawable.ic_launcher_background,"Raja","Raja have sended you frnd request","12:50pm"));
        model_R.add(new request_str(R.drawable.ic_launcher_background,"Raja","Raja have sended you frnd request","12:50pm"));
        model_R.add(new request_str(R.drawable.ic_launcher_background,"Raja","Raja have sended you frnd request","12:50pm"));
        model_R.add(new request_str(R.drawable.ic_launcher_background,"Raja","Raja have sended you frnd request","12:50pm"));
        model_R.add(new request_str(R.drawable.ic_launcher_background,"Raja","Raja have sended you frnd request","12:50pm"));




        request_adapter adapter=new request_adapter(getContext(),model_R);
        request_recycler.setAdapter(adapter);


        return view;
    }
}