package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        TextView textView4 =  findViewById(R.id.textView4);
        TextView textView3 =  findViewById(R.id.textView3);
        TextView textView5 =  findViewById(R.id.textView5);
        textView4.setText("This Video Player has been developed by: ");
        textView3.setText("Ramy ElGendi");
        textView5.setText("900170269");
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Back();
            }
        });
    }
    public void Back() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
