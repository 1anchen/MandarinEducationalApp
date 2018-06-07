package com.example.vivien.chinesecharactergame;

public class Zi {

    protected int pianPangId;
    protected int buShouId;
    protected int image;
    protected String definition;

    public Zi(int pianPangId, int buShouId, int image, String definition){
        this.pianPangId = pianPangId;
        this.buShouId = buShouId;
        this.image = image;
        this.definition = definition;
    }

    public int getPianPangId() {
        return pianPangId;
    }

    public int getBuShouId() {
        return buShouId;
    }

    public int getImage() {
        return image;
    }

    public String getDefinition() {
        return definition;
    }
}
