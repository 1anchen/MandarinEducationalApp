package com.example.vivien.chinesecharactergame;

import android.content.Intent;

import java.util.Random;

// PianPang is the indexing component which
// form a Chinese character normal appears
// on the left side of the character


public class PianPang extends Wheel{

    protected int id;
    protected int image;
    protected int symbol;
    protected static int[] imageList;


    public PianPang( int id, int image, int symbol){
        this.id= id;
        this.image = image;
        this.symbol = symbol;
        this.imageList = new int[]{
                                R.drawable.sandianshuileft, R.drawable.beizhileft,
                                R.drawable.huozileft, R.drawable.jinzibianleft,
                                R.drawable.muzhipiangleft};
    }

    public int getid() {
        return this.id;
    }

    public int getImage() {
        return this.image;
    }

    public int getSymbol() {
        return this.symbol;
    }

    public static int[] getImagelist() {
        return imageList;
    }

    public  void spin(){
        currentIndex++;

        if (currentIndex > imageList.length){
            currentIndex = 0;
        }
    }





}
