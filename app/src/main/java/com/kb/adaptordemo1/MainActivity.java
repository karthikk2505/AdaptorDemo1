package com.kb.adaptordemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView simpleList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] arraylist = {"Sona College of technology", "Indian Institute  of Technology","Sona Arts and science","Madras Institute of technology"};
        simpleList  = (ListView) findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                R.layout.activity_list_view, R.id.textView, arraylist);
        simpleList.setAdapter(arrayAdapter);
    }
}
