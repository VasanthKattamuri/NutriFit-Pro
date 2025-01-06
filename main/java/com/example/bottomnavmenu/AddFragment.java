package com.example.bottomnavmenu;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/*import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;*/


import com.example.bottomnavmenu.Adapters.CardAdapterForAdd;
import com.example.bottomnavmenu.Model.Card;

import java.util.ArrayList;
import java.util.List;

public class AddFragment extends Fragment {

    RecyclerView recyclerView;
    List<Card> cardList;

    public AddFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add , container , false);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        cardList = new ArrayList<>();
        cardList.add(new Card("Sleep Duration"));
        cardList.add(new Card("Weight"));
        cardList.add(new Card("Calories"));

        recyclerView.setAdapter(new CardAdapterForAdd(getContext() , cardList));

        return view;
    }
}
