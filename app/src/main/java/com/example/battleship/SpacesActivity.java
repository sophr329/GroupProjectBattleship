package com.example.battleship;

import static java.lang.Integer.parseInt;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class SpacesActivity extends AppCompatActivity {

    private Spaces[][] spacesArray;


    private View.OnClickListener buttonOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            checkSpaces(v);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spacesArray =  new Spaces[7][7];

        for(int i = 0; i < spacesArray.length; i++) {
            for (int j = 0; j < spacesArray[0].length; j++) {
                String id = ""+ i+j;
                spacesArray[i][j] = new Spaces(id);
                // you can' use v because there is no v in the onCreate
                // need to figure out a way to programmatically access ALL ImageButtons in xml

               // spacesArray[i][j].setImgButton(findViewById(v.getId()));

                // I don't thinkyou need listener
              //  spacesArray[i][j].getImgButton().setOnClickListener(buttonOnClickListener);
            }
        }

        placeShips();

}

    public void placeShips(){

        spacesArray[0][0].setShip(true);
        spacesArray[0][1].setShip(true);
      //  spacesArray[0][2].setShip(true);
      //  spacesArray[0][3].setShip(true);
    }

    public void checkSpaces(View v){
        ImageButton img = findViewById(v.getId());
        String imgStr = img.getContentDescription().toString();

         int row, col;
         row = parseInt(imgStr.substring(6,7));
         col = parseInt(imgStr.substring(7,8));

         Spaces spaceSelected = spacesArray[row][col];

         if(spaceSelected.isShip() && !spaceSelected.isHitStatus())
         {
             img.setImageResource(R.drawable.newcheck);
             spaceSelected.setHitStatus(true);
         }
         else if(spaceSelected.isShip() && spaceSelected.isHitStatus())
         {
             //toast
         }
         else if(!spaceSelected.isShip() && !spaceSelected.isHitStatus()){

             img.setImageResource(R.drawable.x);
             spaceSelected.setHitStatus(true);
         }
         else
         {
             //toast
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
