package com.example.apprecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Hello extends AppCompatActivity {

    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=findViewById(R.id.image_hello);

        Thread banggio=new Thread(){
            public  void run() {
               try {
                   sleep(3000);
               }catch (Exception e){

               }finally {
                   Intent intent=new Intent(Hello.this, Main.class);
                   startActivity(intent);
               }
            }
        };
        banggio.start();
    }
}