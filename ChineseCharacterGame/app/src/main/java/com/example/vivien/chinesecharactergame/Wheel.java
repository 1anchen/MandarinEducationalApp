package com.example.vivien.chinesecharactergame;

public abstract class Wheel extends Thread{

        interface ISpin {

            void newImage(int image);
        }

        protected static int[] imagesList;
        protected int currentIndex;
        protected ISpin iSpin;
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

    public abstract void spin();

    @Override
    public void run() {
        try {
            Thread.sleep(startTime);
        } catch (InterruptedException e) {
        }

        while(isStarted) {
            try {
                Thread.sleep(flashingTime);
            } catch (InterruptedException e) {
            }

            spin();

            if (iSpin != null) {
                iSpin.newImage(imagesList[currentIndex]);
            }
        }
    }

    public void stopWheel() {
        isStarted = false;
    }
}

