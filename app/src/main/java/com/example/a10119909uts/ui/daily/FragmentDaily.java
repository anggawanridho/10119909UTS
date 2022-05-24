package com.example.a10119909uts.ui.daily;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a10119909uts.R;

import java.util.ArrayList;

public class FragmentDaily extends Fragment {

    RecyclerView recyclerViewDaily;
    ArrayList<ModelDaily> modelDaily;
    RecyclerView recyclerViewFriendlist;
    ArrayList<ModelFriendlist> modelFriendlist;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_daily, container, false);

        recyclerViewDaily = root.findViewById(R.id.view_daily);
        recyclerViewDaily.setLayoutManager(new LinearLayoutManager(getContext()));

        modelDaily = new ArrayList<>();

        ModelDaily daily1 = new ModelDaily(R.drawable.ic_light, "Wake up", "05.30 a.m");
        modelDaily.add(daily1);
        ModelDaily daily2 = new ModelDaily(R.drawable.ic_working_work, "Work", "07.00 a.m - 05.00 p.m");
        modelDaily.add(daily2);
        ModelDaily daily3 = new ModelDaily(R.drawable.ic_exercise, "Exercise", "05.15 p.m - 06.00 p.m ");
        modelDaily.add(daily3);
        ModelDaily daily4 = new ModelDaily(R.drawable.ic_study_student, "Study", "06.30 p.m - 09.00 p.m");
        modelDaily.add(daily4);
        ModelDaily daily6 = new ModelDaily(R.drawable.ic_sleep, "Sleep", "11.00 pm / 12.00 p.m");
        modelDaily.add(daily6);

        recyclerViewDaily.setAdapter(new AdapterDaily(modelDaily));

        recyclerViewFriendlist = root.findViewById(R.id.view_friendlist);
        recyclerViewFriendlist.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        modelFriendlist = new ArrayList<>();

        ModelFriendlist friendlist1 = new ModelFriendlist(R.drawable.foto_peri, "Haul");
        modelFriendlist.add(friendlist1);
        ModelFriendlist friendlist2 = new ModelFriendlist(R.drawable.foto_damai, "Damai");
        modelFriendlist.add(friendlist2);
        ModelFriendlist friendlist3 = new ModelFriendlist(R.drawable.foto_zoom, "Yolanda");
        modelFriendlist.add(friendlist3);
        ModelFriendlist friendlist4 = new ModelFriendlist(R.drawable.foto_abay, "Bayu");
        modelFriendlist.add(friendlist4);
        ModelFriendlist friendlist5 = new ModelFriendlist(R.drawable.foto_gege, "Ghea");
        modelFriendlist.add(friendlist5);

        recyclerViewFriendlist.setAdapter(new AdapterFriendlist(modelFriendlist));

        return root;
    }
}
