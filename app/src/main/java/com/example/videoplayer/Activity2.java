package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Activity2 extends AppCompatActivity {

    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        text = intent.getStringExtra(MainActivity.TEXT);

        TextView textView =  findViewById(R.id.textView_2);
        textView.setText(text);



        final ListView mylistView;
        String[] Category_two;
        int[] Image_two;
        CustomListview customListview;



        switch(text) {
            case "Adventure":
                Category_two = getResources().getStringArray(R.array.Adventure);
                Image_two = new int[]{R.drawable.adv1, R.drawable.adv2};
                break;

            case "Drama":
                Category_two = getResources().getStringArray(R.array.Drama);
                Image_two = new int[]{R.drawable.drama1, R.drawable.drama2};
                break;

            case "Sports":
                Category_two = getResources().getStringArray(R.array.Sports);
                Image_two = new int[]{R.drawable.laliga, R.drawable.premier};
                break;

            case "Comedy": default:
                Category_two = getResources().getStringArray(R.array.Comedy);
                Image_two = new int[]{R.drawable.comedy1, R.drawable.comedy2};
                break;
        }
        mylistView = findViewById(R.id.listView);
        customListview = new CustomListview(this, Category_two, Image_two);
        mylistView.setAdapter(customListview);




        mylistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                openActivity3( mylistView.getItemAtPosition(position).toString());
            }
        });
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Info();
            }
        });
    }

    public void openActivity3(String text) {
        Intent intent = new Intent(this, Activity3.class);
        intent.putExtra(MainActivity.TEXT,text);
        startActivity(intent);

    }
    public void Info() {
        Intent intent = new Intent(this, Info.class);
        startActivity(intent);

    }
}

