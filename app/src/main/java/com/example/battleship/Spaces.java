package com.example.battleship;

import android.view.View;
import android.widget.ImageButton;

public class Spaces {
    //    ImageButton buttonID;
//    ImageButton buttonIDtest;
    boolean ship;
    boolean hitStatus;
    String buttID;
    ImageButton imgButton;


    public Spaces(String id){
        buttID = id;
        ship = false;
        hitStatus = false;
        imgButton = null;
    }

    public boolean isShip() {
        return ship;
    }

    public void setShip(boolean ship) {
        this.ship = ship;
    }

    public boolean isHitStatus() {
        return hitStatus;
    }

    public void setHitStatus(boolean hitStatus) {
        this.hitStatus = hitStatus;
    }

    public String getButtID() {
        return buttID;
    }

    public void setButtID(String buttID) {
        this.buttID = buttID;
    }

    public ImageButton getImgButton() {
        return imgButton;
    }

    public void setImgButton(ImageButton imgButton) {
        this.imgButton = imgButton;
    }
}
