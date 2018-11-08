package com.example.hd_a.listpersonnalise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lst = findViewById(R.id.lstLayout);

        ArrayList<Article> lstArt = new ArrayList<Article>();

        lstArt.add(new Article(1, "Pain", 2, "alm"));
        lstArt.add(new Article(2, "Lait", 8, "alm"));
        lstArt.add(new Article(3, "Stylo", 5, "frn"));
        lstArt.add(new Article(4, "Cahier", 10, "frn"));
        lstArt.add(new Article(5, "Chimie", 170, "liv"));
        lstArt.add(new Article(6, "Sucre", 15, "alm"));

        ArtAdapter adapter = new ArtAdapter
                (getApplicationContext(), R.layout.item_art, lstArt);
        lst.setAdapter(adapter);
    }
}
