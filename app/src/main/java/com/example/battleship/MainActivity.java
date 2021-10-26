package com.example.battleship;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    ImageButton buttonID;
    ImageButton buttonIDtest;
    Boolean ship;
    Boolean hitStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonID = (ImageButton) findViewById(R.id.button00);
        buttonID.setOnClickListener(imgA);

        buttonIDtest = (ImageButton) findViewById(R.id.button01);
        buttonIDtest.setOnClickListener(imgB);
    }

    View.OnClickListener imgA = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            buttonID.setImageResource(R.drawable.x);
        }
    };

    View.OnClickListener imgB = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            buttonIDtest.setImageResource(R.drawable.check);
        }
    };



//    public void changeImage(boolean hitStatus){
//        if(hitStatus && ship){
//
//
//        }
//        else if(hitStatus){
//
//        }
//}

}
