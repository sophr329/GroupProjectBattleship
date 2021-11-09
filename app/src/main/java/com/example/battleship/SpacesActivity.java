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
    boolean sunk1;
    boolean sunk2;
    boolean sunk3;
    boolean sunk4;

    int min = 1;
    int max = 5;
    int rand = (int) Math.floor(Math.random() * (max - min + 1) + min);


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


    public void placeShips() {



        if (rand == 1) {
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
        } else if (rand == 2) {
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
        } else if (rand == 3) {
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
        } else if (rand == 4) {
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
        } else {
            spacesArray[1][2].setShip(true);
            spacesArray[1][3].setShip(true);
            spacesArray[1][4].setShip(true);

            spacesArray[6][3].setShip(true);
            spacesArray[6][4].setShip(true);
            spacesArray[6][5].setShip(true);

            spacesArray[3][0].setShip(true);
            spacesArray[4][0].setShip(true);
            spacesArray[5][0].setShip(true);
            spacesArray[6][0].setShip(true);

            spacesArray[3][5].setShip(true);
            spacesArray[3][6].setShip(true);
        }
    }

    public void checkSink(){

        if(rand == 1){
           if(spacesArray[0][0].isHitStatus() && spacesArray[1][0].isHitStatus()
                   && spacesArray[2][0].isHitStatus() && !sunk1){
               Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
              sunk1 = true;
           }
           else if(spacesArray[3][2].isHitStatus() && spacesArray[3][3].isHitStatus() && !sunk2){
               Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
               sunk2 = true;
           }
           else if(spacesArray[5][1].isHitStatus() && spacesArray[5][2].isHitStatus() &&
                   spacesArray[5][3].isHitStatus() && !sunk3){
               Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
               sunk3 = true;
           }
           else if(spacesArray[1][5].isHitStatus() && spacesArray[2][5].isHitStatus() &&
                   spacesArray[3][5].isHitStatus() && spacesArray[4][5].isHitStatus() && !sunk4){
               Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
               sunk4 = true;
           }

           if(sunk4 && sunk3 && sunk2 && sunk1){
               //change page?
               Toast.makeText(getApplicationContext(), "You Won!", Toast.LENGTH_LONG).show();
           }


        }
        else if(rand == 2){
            if( spacesArray[0][1].isHitStatus() && spacesArray[0][2].isHitStatus()
            && spacesArray[0][3].isHitStatus() && spacesArray[0][4].isHitStatus()  && !sunk1){
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                sunk1 = true;
            }
            else if(spacesArray[3][0].isHitStatus() && spacesArray[4][0].isHitStatus() && !sunk2){
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                sunk2 = true;
            }
            else if(spacesArray[4][2].isHitStatus() && spacesArray[5][2].isHitStatus() &&
            spacesArray[6][2].isHitStatus() && !sunk3){
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                sunk3 = true;
            }
            else if(spacesArray[2][5].isHitStatus() && spacesArray[3][5].isHitStatus() &&
                    spacesArray[4][5].isHitStatus() &&  !sunk4){
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                sunk4 = true;
            }

            if(sunk4 && sunk3 && sunk2 && sunk1){
                //change page?
                Toast.makeText(getApplicationContext(), "You Won!", Toast.LENGTH_LONG).show();
            }
        }
        else if(rand == 3){
            if(spacesArray[0][0].isHitStatus() && spacesArray[1][0].isHitStatus() && !sunk1){
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                sunk1 = true;
            }
            else if(spacesArray[2][2].isHitStatus() && spacesArray[2][3].isHitStatus() &&
            spacesArray[2][4].isHitStatus() &&!sunk2){
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                sunk2 = true;
            }
            else if(spacesArray[6][0].isHitStatus() && spacesArray[6][1].isHitStatus() &&
            spacesArray[6][2].isHitStatus() && !sunk3){
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                sunk3 = true;
            }
            else if(spacesArray[3][6].isHitStatus() && spacesArray[4][6].isHitStatus() &&
            spacesArray[5][6].isHitStatus() && spacesArray[6][6].isHitStatus() &&  !sunk4){
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                sunk4 = true;
            }

            if(sunk4 && sunk3 && sunk2 && sunk1){
                //change page?
                Toast.makeText(getApplicationContext(), "You Won!", Toast.LENGTH_LONG).show();
            }
        }
        else if(rand == 4){
            if(  spacesArray[3][0].isHitStatus() && spacesArray[4][0].isHitStatus() &&
            spacesArray[5][0].isHitStatus() && !sunk1){
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                sunk1 = true;
            }
            else if(spacesArray[2][2].isHitStatus() && spacesArray[3][2].isHitStatus() &&
                    spacesArray[4][2].isHitStatus() && !sunk2){
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                sunk2 = true;
            }
            else if( spacesArray[1][4].isHitStatus() && spacesArray[2][4].isHitStatus() &&
            spacesArray[3][4].isHitStatus() && spacesArray[4][4].isHitStatus() && !sunk3){
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                sunk3 = true;
            }
            else if(spacesArray[6][4].isHitStatus() && spacesArray[6][5].isHitStatus() && !sunk4){
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                sunk4 = true;
            }

            if(sunk4 && sunk3 && sunk2 && sunk1){
                //change page?
                Toast.makeText(getApplicationContext(), "You Won!", Toast.LENGTH_LONG).show();
            }
        }
        else if(rand == 5) {
            if (spacesArray[1][2].isHitStatus() && spacesArray[1][3].isHitStatus() &&
                    spacesArray[1][4].isHitStatus() && !sunk1) {
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                sunk1 = true;
            }
            else if (spacesArray[6][3].isHitStatus() && spacesArray[6][4].isHitStatus() &&
                    spacesArray[6][5].isHitStatus() && !sunk2) {
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                sunk2 = true;
            }
            else if (spacesArray[3][0].isHitStatus() && spacesArray[4][0].isHitStatus() &&
                    spacesArray[5][0].isHitStatus() && spacesArray[6][0].isHitStatus() && !sunk3) {
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                sunk3 = true;
            }
            else
            if (spacesArray[3][5].isHitStatus() && spacesArray[3][6].isHitStatus() && !sunk4) {
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                sunk4 = true;
            }

            if (sunk4 && sunk3 && sunk2 && sunk1) {
                //change page?
                Toast.makeText(getApplicationContext(), "You Won!", Toast.LENGTH_LONG).show();
            }
        }

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

        checkSink();

    }

    public void reset(View v) {

        for (int i = 0; i < spacesArray.length; i++) {
            for (int j = 0; j < spacesArray[0].length; j++) {
                String id = "" + i + j;
                spacesArray[i][j] = new Spaces(id);
                spacesArray[i][j].setShip(false);
                spacesArray[i][j].setHitStatus(false);
                //spacesArray[i][j].setImgButton();
                //spacesArray[i][j].getImgButton().setImageResource(R.drawable.grey); //debug says null so what do i setImageButton to?
            }
        }

        //placeShips();
    }


}

