package com.example.vivien.chinesecharactergame;


// BuShou is the symbol component which
// form a Chinese character normal appears
// on the right side of the character


public class BuShou extends Wheel {

    protected int id;
    protected int image;
    protected int symbol;
    protected static int[] imageList;


    public BuShou(int id, int image) {
        this.id = id;
        this.image = image;
        this.imageList = new int[]{
                R.drawable.dingziright, R.drawable.cairight};
    }

    public int getid() {
        return this.id;
    }

    public int getImage() {
        return this.image;
    }


    public static int[] getImagelist() {
        return imageList;
    }

    public void spin() {
        currentIndex++;

        if (currentIndex > imageList.length) {
            currentIndex = 0;
        }
    }
}


