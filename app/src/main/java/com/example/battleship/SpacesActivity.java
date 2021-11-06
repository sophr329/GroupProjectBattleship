package com.example.battleship;

import static java.lang.Integer.parseInt;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.lang.reflect.Array;


public class SpacesActivity extends AppCompatActivity {

    private Spaces[][] spacesArray;
    private boolean[] shipsArray;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spacesArray = new Spaces[7][7];

        for (int i = 0; i < spacesArray.length; i++) {
            for (int j = 0; j < spacesArray[0].length; j++) {
                String id = "" + i + j;
                spacesArray[i][j] = new Spaces(id);

            }
        }

        placeShips();

    }


    public void placeShips(){
        int min = 1;
        int max = 5;
        int rand = (int)Math.floor(Math.random()*(max-min+1)+min);


        if(rand == 1){
            spacesArray[0][0].setShip(true);
            spacesArray[1][0].setShip(true);
            spacesArray[2][0].setShip(true);

            spacesArray[3][2].setShip(true);
            spacesArray[3][3].setShip(true);

            spacesArray[5][1].setShip(true);
            spacesArray[5][2].setShip(true);
            spacesArray[5][3].setShip(true);

            spacesArray[1][5].setShip(true);
            spacesArray[2][5].setShip(true);
            spacesArray[3][5].setShip(true);
            spacesArray[4][5].setShip(true);
        }
        else if(rand == 2){
            spacesArray[0][1].setShip(true);
            spacesArray[0][2].setShip(true);
            spacesArray[0][3].setShip(true);
            spacesArray[0][4].setShip(true);

            spacesArray[3][0].setShip(true);
            spacesArray[4][0].setShip(true);

            spacesArray[4][2].setShip(true);
            spacesArray[5][2].setShip(true);
            spacesArray[6][2].setShip(true);

            spacesArray[2][5].setShip(true);
            spacesArray[3][5].setShip(true);
            spacesArray[4][5].setShip(true);
        }
        else if(rand == 3){
            spacesArray[0][0].setShip(true);
            spacesArray[1][0].setShip(true);

            spacesArray[2][2].setShip(true);
            spacesArray[2][3].setShip(true);
            spacesArray[2][4].setShip(true);

            spacesArray[6][0].setShip(true);
            spacesArray[6][1].setShip(true);
            spacesArray[6][2].setShip(true);

            spacesArray[3][6].setShip(true);
            spacesArray[4][6].setShip(true);
            spacesArray[5][6].setShip(true);
            spacesArray[6][6].setShip(true);
        }
        else if(rand == 4){
            spacesArray[0][0].setShip(true);
            spacesArray[1][0].setShip(true);

            spacesArray[2][2].setShip(true);
            spacesArray[2][3].setShip(true);
            spacesArray[2][4].setShip(true);

            spacesArray[6][0].setShip(true);
            spacesArray[6][1].setShip(true);
            spacesArray[6][2].setShip(true);

            spacesArray[3][6].setShip(true);
            spacesArray[4][6].setShip(true);
            spacesArray[5][6].setShip(true);
            spacesArray[6][6].setShip(true);
        }
        else{
            spacesArray[3][0].setShip(true);
            spacesArray[4][0].setShip(true);
            spacesArray[5][0].setShip(true);

            spacesArray[2][2].setShip(true);
            spacesArray[3][2].setShip(true);
            spacesArray[4][2].setShip(true);

            spacesArray[1][4].setShip(true);
            spacesArray[2][4].setShip(true);
            spacesArray[3][4].setShip(true);
            spacesArray[4][4].setShip(true);

            spacesArray[6][4].setShip(true);
            spacesArray[6][5].setShip(true);
        }
//
//        public void checkWin(){
//

    }

    public void checkSpaces(View v) {
        ImageButton img = findViewById(v.getId());
        String imgStr = img.getContentDescription().toString();


        int row, col;
        row = parseInt(imgStr.substring(6, 7));
        col = parseInt(imgStr.substring(7, 8));

        Spaces spaceSelected = spacesArray[row][col];

        if (spaceSelected.isShip() && !spaceSelected.isHitStatus()) {
            img.setImageResource(R.drawable.newcheck);
            spaceSelected.setHitStatus(true);
        } else if (spaceSelected.isShip() && spaceSelected.isHitStatus()) {
            Toast.makeText(getApplicationContext(), "You already picked this square", Toast.LENGTH_SHORT).show();
        } else if (!spaceSelected.isShip() && !spaceSelected.isHitStatus()) {

            img.setImageResource(R.drawable.x);
            spaceSelected.setHitStatus(true);
        } else {
            Toast.makeText(getApplicationContext(), "You already picked this square", Toast.LENGTH_SHORT).show();
        }


    }


}

