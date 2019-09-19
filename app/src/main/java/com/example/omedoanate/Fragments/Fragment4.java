package com.example.omedoanate.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.omedoanate.Adapters.Recycler_Adapter_porbazdid;
import com.example.omedoanate.Model.Recycler_model;
import com.example.omedoanate.R;

import java.util.ArrayList;

public class Fragment4 extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<Recycler_model> items = new ArrayList<>();
    private Recycler_Adapter_porbazdid adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment4 , container , false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_porbazdid_f4_id);

        adapter = new Recycler_Adapter_porbazdid(getActivity() , items);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity() , LinearLayoutManager.HORIZONTAL , false);
        recyclerView.setLayoutManager(linearLayoutManager);
        setItems();
        recyclerView.setAdapter(adapter);

        return view;
    }

    public void setItems(){
        items.add(new Recycler_model("هلال احمر" , R.drawable.ic_person_black_24dp));
        items.add(new Recycler_model("حسن" , R.drawable.ic_person_black_24dp));
        items.add(new Recycler_model("امین" , R.drawable.ic_person_black_24dp));
        items.add(new Recycler_model("کمیته امداد" , R.drawable.ic_person_black_24dp));
        items.add(new Recycler_model("سایپا" , R.drawable.ic_person_black_24dp));
        items.add(new Recycler_model("ایران خودرو" , R.drawable.ic_person_black_24dp));
        items.add(new Recycler_model("محسن" , R.drawable.ic_person_black_24dp));
        items.add(new Recycler_model("جعفر" , R.drawable.ic_person_black_24dp));
        items.add(new Recycler_model("زهره" , R.drawable.ic_person_black_24dp));
        items.add(new Recycler_model("سمانه" , R.drawable.ic_person_black_24dp));
    }
}
