package com.example.vivien.chinesecharactergame;

import android.content.Context;
import android.media.MediaPlayer;

public class Zi {

    private int id;
    protected int pianPangId;
    protected int buShouId;
    protected int image;
    protected String definition;
    protected int[] pianPandIdList;
    protected int[] buShouIdList;
//    public Context context;
    protected MediaPlayer mediaPlayer;

//    public void audio(Context context){
//        this.context = context;
//    }

    public Zi(int id, int pianPangId, int buShouId, String definition, int image, int sound){
        this.id = id;
        this.pianPangId = pianPangId;
        this.buShouId = buShouId;
        this.image = image;
        this.definition = definition;
//        this.mediaPlayer = MediaPlayer.create(context,sound);
        this.pianPandIdList = new int[]{1,2,3,4,5};
        this.buShouIdList = new int[]{1,2};

    }

    public int getId() {
        return id;
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

    public void setPianPangId(int pianPangId) {
        this.pianPangId = pianPangId;
    }

    public void setBuShouId(int buShouId) {
        this.buShouId = buShouId;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }
}
