package com.example.gamelistrecyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    ArrayList<Game> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recycler);

        list = new ArrayList<>();

        list.add(new Game(R.drawable.blockblast,
                "Block Blast!",
                "Puzzle • Block • Casual",
                "4.5 ★"));

        list.add(new Game(R.drawable.vitamahjong,
                "Vita Mahjong",
                "Board • Puzzle",
                "4.6 ★"));

        list.add(new Game(R.drawable.jigsaw,
                "Jigsolitaire",
                "Puzzle",
                "4.3 ★"));

        list.add(new Game(R.drawable.tileexplorer,
                "Tile Explorer",
                "Puzzle • Match 3",
                "4.5 ★"));

        list.add(new Game(R.drawable.watersort,
                "Water Match",
                "Casual",
                "4.7 ★"));

        list.add(new Game(R.drawable.roblox,
                "Roblox",
                "Adventure • Sandbox",
                "4.4 ★"));

        list.add(new Game(R.drawable.happycolor,
                "Happy Color",
                "Coloring Game",
                "4.6 ★"));
        list.add(new Game(R.drawable.subwaysurf,
                "Subway Surfers",
                "Arcade • Endless Run",
                "4.5 ★"));

        list.add(new Game(R.drawable.candycrush,
                "Candy Crush",
                "Puzzle • Match",
                "4.6 ★"));


        Adapter adapter = new Adapter(list);

        recycler.setLayoutManager(new LinearLayoutManager(this));

        recycler.setAdapter(adapter);
    }
}