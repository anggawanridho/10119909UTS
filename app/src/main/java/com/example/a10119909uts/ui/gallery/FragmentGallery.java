package com.example.a10119909uts.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.a10119909uts.R;

import java.util.ArrayList;

public class FragmentGallery extends Fragment {
    RecyclerView recyclerViewGallery;
    ArrayList<ModelGallery> modelGallery;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root =inflater.inflate(R.layout.fragment_gallery, container, false);

        recyclerViewGallery = root.findViewById(R.id.view_gallery);
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerViewGallery.setLayoutManager(manager);

        modelGallery = new ArrayList<>();

        ModelGallery gallery1 = new ModelGallery(R.drawable.gallery1);
        modelGallery.add(gallery1);
        ModelGallery gallery2 = new ModelGallery(R.drawable.gallery2);
        modelGallery.add(gallery2);
        ModelGallery gallery3 = new ModelGallery(R.drawable.gallery3);
        modelGallery.add(gallery3);
        ModelGallery gallery4 = new ModelGallery(R.drawable.gallery4);
        modelGallery.add(gallery4);
        ModelGallery gallery5 = new ModelGallery(R.drawable.gallery5);
        modelGallery.add(gallery5);
        ModelGallery gallery6 = new ModelGallery(R.drawable.gallery6);
        modelGallery.add(gallery6);

        recyclerViewGallery.setAdapter(new AdapterGallery(modelGallery));

        return root;
    }
}
