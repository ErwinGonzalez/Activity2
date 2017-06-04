package galileo.abapp.movietablist.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import galileo.abapp.movietablist.R;
import galileo.abapp.movietablist.data.movieAdapter;

/**
 * Created by EEVGG on 01/06/2017.
 */

public class MovieBestFragment extends Fragment  {
    RecyclerView rv;
    RecyclerView.LayoutManager manager;
    movieAdapter adapter;
    TextView tv;
    ArrayList movies;

    public  MovieBestFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View parentView = inflater.inflate(R.layout.fragment_main,container,false);
        tv =(TextView) parentView.findViewById(R.id.section_label);
        rv = (RecyclerView) parentView.findViewById(R.id.main_recycler_view);
        movies = (ArrayList)getArguments().getSerializable("best");
        LinearLayoutManager llm = new LinearLayoutManager(this.getContext());
        rv.setLayoutManager(llm);
        adapter = new movieAdapter(getActivity(),movies);
        rv.setAdapter(adapter);
        manager = new LinearLayoutManager(getActivity());
        return parentView;
    }

}
