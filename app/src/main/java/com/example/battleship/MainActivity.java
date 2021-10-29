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
      String buttID;
      ImageButton imgButton;
    private ImageButton [][] spacesArray;
    private Boolean [][] shipArray;

    public MainActivity(View v){
        buttID = " ";
        ship = false;
        hitStatus = false;
        imgButton = (ImageButton) findViewById(v.getId());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spacesArray =  new ImageButton[8][8];
        for (int x = 0; x < 8; x++) {
            for (int k = 0; k < 8; k++) {
                buttID = "button" + x + k;
                int id = getResources().getIdentifier(buttID, "id", getPackageName());
                spacesArray[x][k] = findViewById(id);

            }
        }

        shipArray = new Boolean[8][8];
            shipArray[1][0] = true;
            shipArray[1][1] = true;

}
        public void checkSpace(ImageButton imgButton){
            if(spacesArray.get)

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
