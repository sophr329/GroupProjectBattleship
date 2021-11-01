package com.example.battleship;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class SpacesActivity extends AppCompatActivity {

    private Spaces[][] spacesArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spacesArray =  new Spaces[7][7];

        for(int i = 0; i < spacesArray.length; i++) {
            for (int j = 0; j < spacesArray[0].length; j++) {
                spacesArray[i][j] = new Spaces();
            }
        }

        placeShips();

}

    public void placeShips(){

        spacesArray[0][0].setShip(true);
        spacesArray[0][1].setShip(true);
        spacesArray[0][2].setShip(true);
        spacesArray[0][3].setShip(true);
    }

    public void checkSpaces(View v){
        ImageButton img = findViewById(v.getId());
        String imgStr = img.getContentDescription().toString();

        int index = parseInt(imgStr.substring(6));

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
