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

        ArrayList<Integer> lstInt = new ArrayList<Integer>();

        for (int i = 0; i<30; i++){
            lstInt.add(i);
        }

        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>
                (getApplicationContext(), android.R.layout.simple_list_item_1, lstInt);
        lst.setAdapter(adapter);
    }
}
