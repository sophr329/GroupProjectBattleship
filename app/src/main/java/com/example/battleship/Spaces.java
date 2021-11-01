package com.example.battleship;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class Spaces<i> extends AppCompatActivity {

//    ImageButton buttonID;
//    ImageButton buttonIDtest;
      Boolean ship;
      Boolean hitStatus;
      String buttID;
      ImageButton imgButton;
    private Spaces [] spacesArray;
    private Boolean [][] shipArray;

    public Spaces(View v){
        buttID = " ";
        ship = false;
        hitStatus = false;
        imgButton = (ImageButton) findViewById(v.getId());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spacesArray =  new Spaces[50];
        for(int i = 0; i < 50; i++){
            spacesArray[i] = new Spaces();
        }


}



        //        buttonID = (ImageButton) findViewById(R.id.button00);
//        buttonID.setOnClickListener(imgA);
//
//        buttonIDtest = (ImageButton) findViewById(R.id.button01);
//        buttonIDtest.setOnClickListener(imgB);
    }

//    View.OnClickListener imgA = new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            buttonID.setImageResource(R.drawable.x);
//        }
//    }
//
//    View.OnClickListener imgB = new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            buttonIDtest.setImageResource(R.drawable.check);
//        }
//    }
