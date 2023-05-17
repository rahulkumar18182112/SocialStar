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


public class Home_fragment extends Fragment {
    RecyclerView story_recycler;
    ImageView profile_img;
    ArrayList<story_str_class> model_story= new ArrayList<>();
    ArrayList<post_str_class> model_post=new ArrayList<>();


    RecyclerView content_recycler;



/*

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;
*/
    public Home_fragment() {
        // Required empty public constructor
    }

  /*
    public static Home_fragment newInstance(String param1, String param2) {
        Home_fragment fragment = new Home_fragment();
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
        View view= inflater.inflate(R.layout.fragment_home_fragment, container, false);
        story_recycler=view.findViewById(R.id.story_recycler);
        profile_img=view.findViewById(R.id.profile_img);

        story_recycler.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        model_story.add(new story_str_class(R.drawable.ic_launcher_foreground,"rahul kumar"));
        model_story.add(new story_str_class(R.drawable.ic_launcher_foreground,"rahul kumar"));
        model_story.add(new story_str_class(R.drawable.ic_launcher_foreground,"rahul kumar"));
        model_story.add(new story_str_class(R.drawable.ic_launcher_foreground,"rahul kumar"));
        model_story.add(new story_str_class(R.drawable.ic_launcher_foreground,"rahul kumar"));
        model_story.add(new story_str_class(R.drawable.ic_launcher_foreground,"rahul kumar"));
        model_story.add(new story_str_class(R.drawable.ic_launcher_foreground,"rahul kumar"));
        model_story.add(new story_str_class(R.drawable.ic_launcher_foreground,"rahul kumar"));
        model_story.add(new story_str_class(R.drawable.ic_launcher_foreground,"rahul kumar"));
        model_story.add(new story_str_class(R.drawable.ic_launcher_foreground,"rahul kumar"));
        model_story.add(new story_str_class(R.drawable.ic_launcher_foreground,"rahul kumar"));

story_adapter adapter=new story_adapter(getContext(),model_story);
story_recycler.setAdapter(adapter);




//---------------------------------------------------post section--------------------------------------------------------------------------------------

        content_recycler=view.findViewById(R.id.content_recycler);
        content_recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        model_post.add(new post_str_class("khana kha kr jana madarchod",R.drawable.ic_launcher_foreground));
        model_post.add(new post_str_class("khana kha kr jana bsdk",R.drawable.ic_launcher_foreground));
        model_post.add(new post_str_class("khana kha kr jana tatto k saudagar",R.drawable.ic_launcher_foreground));
        model_post.add(new post_str_class("khana kha kr jana bahanchod",R.drawable.ic_launcher_foreground));
        model_post.add(new post_str_class("khana kha kr jana gandu",R.drawable.ic_launcher_foreground));
        model_post.add(new post_str_class("khana kha kr jana laude",R.drawable.ic_launcher_foreground));
        model_post.add(new post_str_class("khana kha kr jana bhan k laude",R.drawable.ic_launcher_foreground));
        model_post.add(new post_str_class("khana kha kr jana madarchod",R.drawable.ic_launcher_foreground));

        post_adapter adapter1=new post_adapter(getContext(),model_post);


        content_recycler.setAdapter(adapter1);



        return view;
    }
}