package com.example.apprecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class ActivityDetail extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        imageView=findViewById(R.id.imageView_detail);

        Bundle bundle=getIntent().getExtras();
        if (bundle != null){
            imageView.setImageResource(bundle.getInt("image"));
        }
    }
}