package com.example.vivien.chinesecharactergame;

import android.content.Intent;

import java.util.Random;

// PianPang is the indexing component which
// form a Chinese character normal appears
// on the left side of the character


public class PianPang implements IRandom{

    protected Integer id;
    protected int image;
    protected int symbol;


    public PianPang(Integer id, int image, int symbol){
        this.id= id;
        this.image = image;
        this.symbol = symbol;
    }

    public int getIndex() {
        return id;
    }

    public int getImage() {
        return this.image;
    }

    public int getComponent() {
        return symbol;
    }

    public void spin(int image){

    }


}
