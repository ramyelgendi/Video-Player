package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Activity3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.TEXT);

        TextView textView =  findViewById(R.id.textView_2);
        textView.setText(text);
        ImageView imageView = findViewById(R.id.imageView);

        TextView textView2 =  findViewById(R.id.textView_info2);


        final ListView mylistView;
        String[] Category_three = {"Empty"};
        CustomListview customListview;

        switch(text) {
            case "La Liga":
                Category_three = getResources().getStringArray(R.array.Sports1);
                imageView.setImageResource(R.drawable.laliga);
                textView2.setText(getResources().getString(R.string.Sports1_Info));
                break;
            case "Premier League":
                Category_three = getResources().getStringArray(R.array.Sports2);
                imageView.setImageResource(R.drawable.premier);
                textView2.setText(getResources().getString(R.string.Sports2_Info));
                break;
            case "The Good Place":
                Category_three = getResources().getStringArray(R.array.Comedy1);
                imageView.setImageResource(R.drawable.comedy1);
                textView2.setText(getResources().getString(R.string.Comedy1_Info));
                break;
            case "How I Met Your Mother":
                Category_three = getResources().getStringArray(R.array.Comedy2);
                imageView.setImageResource(R.drawable.comedy2);
                textView2.setText(getResources().getString(R.string.Comedy2_Info));
                break;
            case "You":
                Category_three = getResources().getStringArray(R.array.Drama1);
                imageView.setImageResource(R.drawable.drama1);
                textView2.setText(getResources().getString(R.string.Drama1_Info));
                break;
            case "Black Mirror":
                Category_three = getResources().getStringArray(R.array.Drama2);
                imageView.setImageResource(R.drawable.drama2);
                textView2.setText(getResources().getString(R.string.Drama2_Info));
                break;
            case "Arrow":
                Category_three = getResources().getStringArray(R.array.Adventure1);
                imageView.setImageResource(R.drawable.adv1);
                textView2.setText(getResources().getString(R.string.Adventure1_Info));
                break;
            case "Titans":
                Category_three = getResources().getStringArray(R.array.Adventure2);
                imageView.setImageResource(R.drawable.adv2);
                textView2.setText(getResources().getString(R.string.Adventure2_Info));
                break;
        }

        mylistView = findViewById(R.id.listView);
        customListview = new CustomListview(this, Category_three, null);
        mylistView.setAdapter(customListview);
        mylistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                openVideo( mylistView.getItemAtPosition(position).toString());
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

    public void openVideo(String text) {
        Intent intent = new Intent(this, Video.class);
        intent.putExtra(MainActivity.TEXT,text);
        startActivity(intent);

    }
    public void Info() {
        Intent intent = new Intent(this, Info.class);
        startActivity(intent);

    }
}
