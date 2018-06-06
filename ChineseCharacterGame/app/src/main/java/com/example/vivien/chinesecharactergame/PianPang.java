package com.example.vivien.chinesecharactergame;


// PianPang is the indexing component which
// form a Chinese character normal appears
// on the left side of the character


public class PianPang extends Wheel{

    protected int id;
    protected int image;
    protected int symbol;
    protected static int[] imageList;
    protected String name;


    public PianPang(int id, int image, int symbol, String name){

        this.id= id;
        this.image = image;
        this.symbol = symbol;
        this.name = name;
        this.imageList = new int[]{
                                R.drawable.sandianshuileft, R.drawable.beizhileft,
                                R.drawable.huozileft, R.drawable.jinzibianleft,
                                R.drawable.muzhipiangleft};
    }

    public int getid() {
        return this.id;
    }


    public String getPianPangName(){
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
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

    public void newImage(int image){

    }
    public int randomImage(int index){
        int image = this.imageList[index];
        return image;

    }


    public void spin(){
        currentIndex++;

        if (currentIndex > imageList.length){
            currentIndex = 0;
        }
    }

    public void run(){
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


//            newImage(imagesList[currentIndex]);


        }
    }


}
