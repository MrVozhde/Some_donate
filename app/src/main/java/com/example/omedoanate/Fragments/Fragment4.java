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

import com.example.omedoanate.Adapters.Recycler_Adapter_Showall;
import com.example.omedoanate.Adapters.Recycler_Adapter_porbazdid;
import com.example.omedoanate.Model.Recycler_model_porbazdid;
import com.example.omedoanate.Model.Recycler_model_showall;
import com.example.omedoanate.R;

import java.util.ArrayList;

public class Fragment4 extends Fragment {

    private RecyclerView recyclerView_porbazdid;
    private RecyclerView recyclerView_showall;
    private ArrayList<Recycler_model_showall> itemsshow = new ArrayList<>();
    private ArrayList<Recycler_model_porbazdid> items_porbazdid = new ArrayList<>();
    private Recycler_Adapter_porbazdid adapter_porbazdid;
    private Recycler_Adapter_Showall adapter_showall;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment4 , container , false);

        recyclerView_porbazdid = (RecyclerView) view.findViewById(R.id.recycler_porbazdid_f4_id);
        recyclerView_showall = (RecyclerView) view.findViewById(R.id.recycler_showall_f4_id);

        adapter_porbazdid = new Recycler_Adapter_porbazdid(getActivity() , items_porbazdid);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity() , LinearLayoutManager.HORIZONTAL , false);
        recyclerView_porbazdid.setLayoutManager(linearLayoutManager);
        setItems();
        recyclerView_porbazdid.setAdapter(adapter_porbazdid);

        adapter_showall = new Recycler_Adapter_Showall(getActivity() , itemsshow);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getActivity() , LinearLayoutManager.VERTICAL , false);
        recyclerView_showall.setLayoutManager(linearLayoutManager1);
        setItems_showall();
        recyclerView_showall.setAdapter(adapter_showall);

        return view;
    }

    public void setItems(){
        items_porbazdid.add(new Recycler_model_porbazdid("هلال احمر" , R.drawable.ic_person_black_24dp));
        items_porbazdid.add(new Recycler_model_porbazdid("حسن" , R.drawable.ic_person_black_24dp));
        items_porbazdid.add(new Recycler_model_porbazdid("امین" , R.drawable.ic_person_black_24dp));
        items_porbazdid.add(new Recycler_model_porbazdid("کمیته امداد" , R.drawable.ic_person_black_24dp));
        items_porbazdid.add(new Recycler_model_porbazdid("سایپا" , R.drawable.ic_person_black_24dp));
        items_porbazdid.add(new Recycler_model_porbazdid("ایران خودرو" , R.drawable.ic_person_black_24dp));
        items_porbazdid.add(new Recycler_model_porbazdid("محسن" , R.drawable.ic_person_black_24dp));
        items_porbazdid.add(new Recycler_model_porbazdid("جعفر" , R.drawable.ic_person_black_24dp));
        items_porbazdid.add(new Recycler_model_porbazdid("زهره" , R.drawable.ic_person_black_24dp));
        items_porbazdid.add(new Recycler_model_porbazdid("سمانه" , R.drawable.ic_person_black_24dp));
    }

    public void setItems_showall(){
        itemsshow.add(new Recycler_model_showall("هلال احمر","120,000 تومان" , " 15,000 تومان" , R.drawable.ic_person_black_24dp));
        itemsshow.add(new Recycler_model_showall("هلال احمر","120,000 تومان" , " 15,000 تومان" , R.drawable.ic_person_black_24dp));
        itemsshow.add(new Recycler_model_showall("هلال احمر","120,000 تومان" , " 15,000 تومان" , R.drawable.ic_person_black_24dp));
        itemsshow.add(new Recycler_model_showall("هلال احمر","120,000 تومان" , " 15,000 تومان" , R.drawable.ic_person_black_24dp));
        itemsshow.add(new Recycler_model_showall("هلال احمر","120,000 تومان" , " 15,000 تومان" , R.drawable.ic_person_black_24dp));
        itemsshow.add(new Recycler_model_showall("هلال احمر","120,000 تومان" , " 15,000 تومان" , R.drawable.ic_person_black_24dp));
        itemsshow.add(new Recycler_model_showall("هلال احمر","120,000 تومان" , " 15,000 تومان" , R.drawable.ic_person_black_24dp));
        itemsshow.add(new Recycler_model_showall("هلال احمر","120,000 تومان" , " 15,000 تومان" , R.drawable.ic_person_black_24dp));
        itemsshow.add(new Recycler_model_showall("هلال احمر","120,000 تومان" , " 15,000 تومان" , R.drawable.ic_person_black_24dp));
        itemsshow.add(new Recycler_model_showall("هلال احمر","120,000 تومان" , " 15,000 تومان" , R.drawable.ic_person_black_24dp));
        itemsshow.add(new Recycler_model_showall("هلال احمر","120,000 تومان" , " 15,000 تومان" , R.drawable.ic_person_black_24dp));
        itemsshow.add(new Recycler_model_showall("هلال احمر","120,000 تومان" , " 15,000 تومان" , R.drawable.ic_person_black_24dp));
        itemsshow.add(new Recycler_model_showall("هلال احمر","120,000 تومان" , " 15,000 تومان" , R.drawable.ic_person_black_24dp));
        itemsshow.add(new Recycler_model_showall("هلال احمر","120,000 تومان" , " 15,000 تومان" , R.drawable.ic_person_black_24dp));
        itemsshow.add(new Recycler_model_showall("هلال احمر","120,000 تومان" , " 15,000 تومان" , R.drawable.ic_person_black_24dp));
    }

}
