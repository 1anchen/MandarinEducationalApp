package com.example.vivien.chinesecharactergame;


// BuShou is the symbol component which
// form a Chinese character normal appears
// on the right side of the character


import java.util.ArrayList;

public class BuShou extends Wheel {

    protected int id;
    protected int image;
    protected int symbol;
    protected static int[] imageList;
    protected int[] painPangList;
    protected String information;


    public BuShou(int id, int image, int symbol, String information,int[] pianPangList){
        this.id = id;
        this.image = image;
        this.symbol = symbol;
        this.information = information;
        this.imageList = new int[]{R.drawable.dingziright, R.drawable.cairight};
        this.painPangList = pianPangList;

    }

    public int getid() {
        return this.id;
    }

    public int getImage() {
        return this.image;
    }

    public int getSymbol() {
        return symbol;
    }

    public String getInformation() {
        return this.information;
    }

    public static int[] getImagelist() {
        return imageList;
    }

    public int[] getPainPangList() {
        return painPangList;
    }

    public void spin() {
        currentIndex++;

        if (currentIndex > imageList.length) {
            currentIndex = 0;
        }
    }
}


