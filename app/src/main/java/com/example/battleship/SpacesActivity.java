package com.example.battleship;

import static java.lang.Integer.parseInt;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.gridlayout.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import org.w3c.dom.Text;


public class SpacesActivity extends AppCompatActivity {

    private Spaces[][] spacesArray;
    boolean sunk1;
    boolean sunk2;
    boolean sunk3;
    boolean sunk4;

    private VideoView videoBG;
    MediaPlayer mMediaPlayer;
    int mCurrentVideoPosition;

    int min = 1;
    int max = 5;
    int rand;

    GridLayout myGrid;

    //https://www.youtube.com/watch?v=WLwQ3SJjWfY this is what I used for the video background

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myGrid = findViewById(R.id.gridLayout);

        spacesArray = new Spaces[7][7];
        rand =(int) Math.floor(Math.random() * (max - min + 1) + min);
        for (int i = 0; i < spacesArray.length; i++) {
            for (int j = 0; j < spacesArray[0].length; j++) {
                String id = "" + i + j;
                spacesArray[i][j] = new Spaces(id);

            }
        }

        placeShips();

        videoBG = (VideoView) findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ocean);
        videoBG.setVideoURI(uri);
        videoBG.start();


        videoBG.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mMediaPlayer = mediaPlayer;
                mMediaPlayer.setLooping(true);
                if (mCurrentVideoPosition != 0) {
                    mMediaPlayer.seekTo(mCurrentVideoPosition);
                    mMediaPlayer.start();
                }
            }
        });

    }

    @Override
    protected void onPause(){
        super.onPause();
        mCurrentVideoPosition = mMediaPlayer.getCurrentPosition();
        videoBG.pause();
    }
    @Override
    protected void onResume(){
        super.onResume();
        videoBG.start();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        mMediaPlayer.release();
        mMediaPlayer = null;
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
               TextView tv31 = (TextView)findViewById(R.id.square31);
               tv31.setText("sunk!");
              sunk1 = true;
           }
           else if(spacesArray[3][2].isHitStatus() && spacesArray[3][3].isHitStatus() && !sunk2){
               Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
               TextView tv2 = (TextView)findViewById(R.id.square2);
               tv2.setText("sunk!");
               sunk2 = true;
           }
           else if(spacesArray[5][1].isHitStatus() && spacesArray[5][2].isHitStatus() &&
                   spacesArray[5][3].isHitStatus() && !sunk3){
               Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
               TextView tv32 = (TextView)findViewById(R.id.square32);
               tv32.setText("sunk!");
               sunk3 = true;
           }
           else if(spacesArray[1][5].isHitStatus() && spacesArray[2][5].isHitStatus() &&
                   spacesArray[3][5].isHitStatus() && spacesArray[4][5].isHitStatus() && !sunk4){
               Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
               TextView tv4 = (TextView)findViewById(R.id.square4);
               tv4.setText("sunk!");
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
                TextView tv4 = (TextView)findViewById(R.id.square4);
                tv4.setText("sunk!");
            }
            else if(spacesArray[3][0].isHitStatus() && spacesArray[4][0].isHitStatus() && !sunk2){
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                TextView tv2 = (TextView)findViewById(R.id.square2);
                tv2.setText("sunk!");
                sunk2 = true;
            }
            else if(spacesArray[4][2].isHitStatus() && spacesArray[5][2].isHitStatus() &&
            spacesArray[6][2].isHitStatus() && !sunk3){
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                TextView tv31 = (TextView)findViewById(R.id.square31);
                tv31.setText("sunk!");
                sunk3 = true;
            }
            else if(spacesArray[2][5].isHitStatus() && spacesArray[3][5].isHitStatus() &&
                    spacesArray[4][5].isHitStatus() &&  !sunk4){
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                TextView tv32 = (TextView)findViewById(R.id.square32);
                tv32.setText("sunk!");
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
                TextView tv2 = (TextView)findViewById(R.id.square2);
                tv2.setText("sunk!");
                sunk1 = true;
            }
            else if(spacesArray[2][2].isHitStatus() && spacesArray[2][3].isHitStatus() &&
            spacesArray[2][4].isHitStatus() &&!sunk2){
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                TextView tv31 = (TextView)findViewById(R.id.square31);
                tv31.setText("sunk!");
                sunk2 = true;
            }
            else if(spacesArray[6][0].isHitStatus() && spacesArray[6][1].isHitStatus() &&
            spacesArray[6][2].isHitStatus() && !sunk3){
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                TextView tv32 = (TextView)findViewById(R.id.square32);
                tv32.setText("sunk!");
                sunk3 = true;
            }
            else if(spacesArray[3][6].isHitStatus() && spacesArray[4][6].isHitStatus() &&
            spacesArray[5][6].isHitStatus() && spacesArray[6][6].isHitStatus() &&  !sunk4){
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                sunk4 = true;
                TextView tv4 = (TextView)findViewById(R.id.square4);
                tv4.setText("sunk!");
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
                TextView tv31 = (TextView)findViewById(R.id.square31);
                tv31.setText("sunk!");
                sunk1 = true;
            }
            else if(spacesArray[2][2].isHitStatus() && spacesArray[3][2].isHitStatus() &&
                    spacesArray[4][2].isHitStatus() && !sunk2){
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                TextView tv32 = (TextView)findViewById(R.id.square32);
                tv32.setText("sunk!");
                sunk2 = true;
            }
            else if( spacesArray[1][4].isHitStatus() && spacesArray[2][4].isHitStatus() &&
            spacesArray[3][4].isHitStatus() && spacesArray[4][4].isHitStatus() && !sunk3){
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                TextView tv4 = (TextView)findViewById(R.id.square4);
                tv4.setText("sunk!");
                sunk3 = true;
            }
            else if(spacesArray[6][4].isHitStatus() && spacesArray[6][5].isHitStatus() && !sunk4){
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                TextView tv2 = (TextView)findViewById(R.id.square2);
                tv2.setText("sunk!");
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
                TextView tv32 = (TextView)findViewById(R.id.square32);
                tv32.setText("sunk!");
                sunk1 = true;
            }
            else if (spacesArray[6][3].isHitStatus() && spacesArray[6][4].isHitStatus() &&
                    spacesArray[6][5].isHitStatus() && !sunk2) {
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                TextView tv31 = (TextView)findViewById(R.id.square31);
                tv31.setText("sunk!");
                sunk2 = true;
            }
            else if (spacesArray[3][0].isHitStatus() && spacesArray[4][0].isHitStatus() &&
                    spacesArray[5][0].isHitStatus() && spacesArray[6][0].isHitStatus() && !sunk3) {
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                TextView tv4 = (TextView)findViewById(R.id.square4);
                tv4.setText("sunk!");
                sunk3 = true;
            }
            else if (spacesArray[3][5].isHitStatus() && spacesArray[3][6].isHitStatus() && !sunk4) {
                Toast.makeText(getApplicationContext(), "You sunk a battleship!!", Toast.LENGTH_SHORT).show();
                TextView tv2 = (TextView)findViewById(R.id.square2);
                tv2.setText("sunk!");
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
    //https://www.dev2qa.com/android-gridlayout-example-programmatically/
    //https://www.tabnine.com/code/java/methods/android.view.View/findViewById
    public void reset(View v) {

        int childCount = myGrid.getChildCount();
        Log.i("sophie", "child count " + childCount);
        spacesArray = new Spaces[7][7];

        for (int i = 0; i < spacesArray.length; i++) {
            for (int j = 0; j < spacesArray[0].length; j++) {
                String id = "" + i + j;
                spacesArray[i][j] = new Spaces(id);
                spacesArray[i][j].setShip(false);
                spacesArray[i][j].setHitStatus(false);
            }
        }

        sunk1 = false;
        sunk2 = false;
        sunk3 = false;
        sunk4 = false;

        TextView tv4 = (TextView)findViewById(R.id.square4);
        tv4.setText("4 squares");
        TextView tv32 = (TextView)findViewById(R.id.square32);
        tv32.setText("3 squares");
        TextView tv31 = (TextView)findViewById(R.id.square31);
        tv31.setText("3 squares");
        TextView tv2 = (TextView)findViewById(R.id.square2);
        tv2.setText("2 squares");

        for (int i = 0; i < childCount; i++) {
            Object child = myGrid.getChildAt(i);
            if(child instanceof ImageButton){
                ImageButton img = (ImageButton)child;
                img.setImageResource(R.drawable.grey);
            }
        }
        rand =(int) Math.floor(Math.random() * (max - min + 1) + min);
        placeShips();

    }


}

