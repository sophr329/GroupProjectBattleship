package com.example.battleship;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity<i> extends AppCompatActivity {

//    ImageButton buttonID;
//    ImageButton buttonIDtest;
    Boolean ship;
    Boolean hitStatus;

    private ImageButton [][] spacesArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spacesArray =  new ImageButton[8][8];
        for (int x = 0; x < 8; x++) {
            for (int k = 0; k < 8; k++) {
                String buttID = "button" + x + k;
                int id = getResources().getIdentifier(buttID, "id", getPackageName());
                spacesArray[x][k] = findViewById(id);

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

    public void changeImage(boolean hitStatus, boolean ship){
        if(hitStatus && ship){


        }
        else if(hitStatus){

        }
}

}
