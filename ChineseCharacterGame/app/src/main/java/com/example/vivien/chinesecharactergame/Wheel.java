package com.example.vivien.chinesecharactergame;

public class Wheel extends Thread {

        protected static int[] imagesList;
        protected int currentIndex;
        protected long flashingTime;
        protected long startTime;
        protected boolean isStarted;

    public Wheel() {
        this.flashingTime = 0;
        this.startTime = 500;
        this.currentIndex = 0;
        this.isStarted = true;

    }

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    public long getFlashingTime() {
        return flashingTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public boolean getIsStarted() {
        return isStarted;
    }

    public void spin(){

    }

   public void newImage(int image){

   }

    @Override
    public void run(){

    }

    public void stopWheel() {
        isStarted = false;
    }
}

