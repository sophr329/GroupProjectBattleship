package com.example.battleship;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    ImageButton buttonID;
//    imageID; /
//    private Boolean ship;
//    private Boolean hitStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonID = (ImageButton) findViewById(R.id.button00);
        buttonID.setOnClickListener(imgB);
    }

    View.OnClickListener imgB = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            buttonID.setImageResource(R.drawable.x);
        }
    };


//    public void changeImage(boolean hitStatus){
//        if(hitStatus && ship){
//            imageID = "check.png";
//        }
//        else if(hitStatus){
//            imageID = "x.png";
//        }
//}

}
