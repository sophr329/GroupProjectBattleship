package com.example.battleship;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


     private ImageButton[][] spacesArray = ImageButton[][]{
             for(int i = 0; i < 7; i++){
                 for(int k = 0; k < 1; k++){
                     spacesArray[i][k] = ;
                 }
             }
    }






}