package com.example.battleship;

import android.view.View;
import android.widget.ImageButton;

public class Spaces {

    boolean ship;
    boolean hitStatus;
    String buttID;
    ImageButton imgButton;
    boolean sunk;
    String shipName;
    int count;



    public Spaces(String id){
        buttID = id;
        ship = false;
        hitStatus = false;
        imgButton = null;
        shipName = "";
        count = 0;
        sunk = false;
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

    public boolean isSunk() {
        return sunk;
    }

    public void setSunk(boolean sunk) {
        this.sunk = sunk;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
