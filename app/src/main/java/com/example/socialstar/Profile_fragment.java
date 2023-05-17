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

import de.hdodenhof.circleimageview.CircleImageView;

public class Profile_fragment extends Fragment {
    ImageView background_img,profile_img;
    TextView username,profession,followers_count,friends_count,photo_count;
    CircleImageView contacts,call,text;
    RecyclerView friend_recycler;
    ArrayList<my_friend_str_class> model_my_friend=new ArrayList<>();
/*
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
*/
    public Profile_fragment() {
        // Required empty public constructor
    }
/*
    public static Profile_fragment newInstance(String param1, String param2) {
        Profile_fragment fragment = new Profile_fragment();
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
        View view= inflater.inflate(R.layout.fragment_profile_fragment, container, false);
        background_img=view.findViewById(R.id.background_img);
        profile_img=view.findViewById(R.id.profile_img);
        username=view.findViewById(R.id.username);
        profession=view.findViewById(R.id.profession);
        friends_count=view.findViewById(R.id.friends_count);
        followers_count=view.findViewById(R.id.followers_count);
        photo_count=view.findViewById(R.id.photo_count);
        friend_recycler=view.findViewById(R.id.friend_recycler);
        call=view.findViewById(R.id.call);
        text=view.findViewById(R.id.text);
        contacts=view.findViewById(R.id.contacts);
        friend_recycler=view.findViewById(R.id.friend_recycler);
        friend_recycler.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        model_my_friend.add(new my_friend_str_class(R.drawable.ic_launcher_background));
        model_my_friend.add(new my_friend_str_class(R.drawable.ic_launcher_background));
        model_my_friend.add(new my_friend_str_class(R.drawable.ic_launcher_background));
        model_my_friend.add(new my_friend_str_class(R.drawable.ic_launcher_background));
        model_my_friend.add(new my_friend_str_class(R.drawable.ic_launcher_background));
        model_my_friend.add(new my_friend_str_class(R.drawable.ic_launcher_background));
        model_my_friend.add(new my_friend_str_class(R.drawable.ic_launcher_background));
        model_my_friend.add(new my_friend_str_class(R.drawable.ic_launcher_background));
        model_my_friend.add(new my_friend_str_class(R.drawable.ic_launcher_background));
        model_my_friend.add(new my_friend_str_class(R.drawable.ic_launcher_background));
        model_my_friend.add(new my_friend_str_class(R.drawable.ic_launcher_background));
        model_my_friend.add(new my_friend_str_class(R.drawable.ic_launcher_background));
        model_my_friend.add(new my_friend_str_class(R.drawable.ic_launcher_background));
        model_my_friend.add(new my_friend_str_class(R.drawable.ic_launcher_background));
        model_my_friend.add(new my_friend_str_class(R.drawable.ic_launcher_background));
        model_my_friend.add(new my_friend_str_class(R.drawable.ic_launcher_background));



        my_firend_adapter adapter=new my_firend_adapter(getContext(),model_my_friend);
        friend_recycler.setAdapter(adapter);



        return view;
    }
}