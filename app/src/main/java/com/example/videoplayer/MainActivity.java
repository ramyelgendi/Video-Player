package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {

    public static final String TEXT = "com.example.videoplayer.TEXT";
    public static final String ID = "com.example.videoplayer.ID";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView mylistView;
        String[] Category= getResources().getStringArray(R.array.Cat);
//        int[] Image = getResources().getIntArray(R.array.Cat_Img);
        int[] Image= {R.drawable.adventure,R.drawable.drama,R.drawable.comedy,R.drawable.sports};
//        int[] Image = getResources().getIdentifier("drawable/" + "drama" , null, getPackageName());


        mylistView = findViewById(R.id.listView);
        CustomListview customListview = new CustomListview(this,Category,Image);
        mylistView.setAdapter(customListview);

        mylistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                openActivity2( mylistView.getItemAtPosition(position).toString());
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

    public void openActivity2(String text) {
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra(TEXT,text);
        startActivity(intent);

    }
    public void Info() {
        Intent intent = new Intent(this, Info.class);
        startActivity(intent);

    }

}
