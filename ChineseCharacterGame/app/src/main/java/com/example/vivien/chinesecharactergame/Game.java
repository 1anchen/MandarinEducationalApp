package com.example.vivien.chinesecharactergame;

import java.util.Random;

public class Game {

    protected Random random;
    protected int number;
    protected PianPang[] pianPanglist;
    protected BuShou[] buShoulist;
    protected Zi[] zilist;
    protected boolean isStarted;

   public Game() {

       random = new Random();
       pianPanglist = new PianPang[]{
               new PianPang(1, R.drawable.sandianshuileft, R.drawable.water, "WaterSign"),
               new PianPang(2, R.drawable.muzhipiangleft, R.drawable.wood, "WoodSign"),
               new PianPang(3, R.drawable.huozileft, R.drawable.fire, "FireSign"),
               new PianPang(4, R.drawable.beizhileft, R.drawable.shell, "ShellSign"),
               new PianPang(5, R.drawable.jinzibianleft, R.drawable.gold, "GoldSign")
       };
       buShoulist = new BuShou[]{
               new BuShou(1, R.drawable.dingziright,"Adult Male Over 18", new int[]{1,2,3,5}),
               new BuShou(2, R.drawable.cairight,"Ability", new int[]{2,4})
       };
       zilist = new Zi[]{
               new Zi(1,1,1,"Pronounce : Ting || Definition :  a shallow land near a river ",
                       R.drawable.shallowLand),
               new Zi(2,2,1,"Pronounce : Cheng || Definition :  Strike, Hit against ",
               R.drawable.stick),
               new Zi(3,3,1,"Pronounce : Deng || Definition :  Light ",
               R.drawable.light),
               new Zi(4,5,1,"Pronounce : Ding || Definition :  Nail ",
               R.drawable.nail),
               new Zi(5,2,2,"Pronounce : Cai || Definition :  Timber, Wooden Material ",
               R.drawable.timber),
               new Zi(6,4,2,"Pronounce : Cai || Definition :  Wealth, Property, Valuables ",
               R.drawable.wealth),
               new Zi(7,0,0,"Sorry This Word Doesn't Exit, You Can Call It Whatever You Want ",
               R.drawable.wrong)
       };
       this.isStarted = true;
   }

    public boolean match(PianPang pianPang, BuShou buShou){

      for(int i=0; i< buShou.getPainPangList().length; i++){

        if (pianPang.getid() == buShou.getPainPangList()[i]){
            return true;
        }
      }
      return false;
    }

//    public int testRandom(){
//       number = random.nextInt(6);
//       return number;
//    }

    public int getPianPangSymbolByID(int index){
       int image = 0;
       index++;
        for(int i=0; i<pianPanglist.length; i++) {
            if(pianPanglist[i].getid()==index){
                image = pianPanglist[i].getSymbol();
            }
        }
        return image;

    }

    public int getPianPangIamgeByID(int index){
       int image = 0;
       index++;
        for(int i=0; i<pianPanglist.length; i++) {
            if(pianPanglist[i].getid()==index){
                image = pianPanglist[i].getImage();
            }
        }
        return image;
    }

    public String getPianPangDemoText(int index){
       StringBuilder name = new StringBuilder();

        index++;
        for(int i=0; i<pianPanglist.length; i++) {
            if(pianPanglist[i].getid()==index){
                name.append(pianPanglist[i].getPianPangName());
            }
        }
        return name.toString();

    }

    public int getBuShouIamgeByID(int index){
        int image = 0;
        index++;
        for(int i=0; i<buShoulist.length; i++) {
            if(buShoulist[i].getid()==index){
                image = buShoulist[i].getImage();
            }
        }
        return image;
    }

    public String getBuShouInformationByID(int index){
        StringBuilder name = new StringBuilder();

        index++;
        for(int i=0; i<buShoulist.length; i++) {
            if(buShoulist[i].getid()==index){
                name.append(buShoulist[i].getInformation());
            }
        }
        return name.toString();

    }


    public boolean getIsStarted() {
        return this.isStarted;
    }


    public PianPang getPianPangByID(int index){
        PianPang pianPang = null;
        index++;
        for(int i=0; i<pianPanglist.length; i++) {
            if(pianPanglist[i].getid()==index){
               return pianPanglist[i];
            }
        }
        return pianPang;

    }

    public BuShou getBuShouByID(int index){
        BuShou buShou = null;
        index++;
        for(int i=0; i<buShoulist.length; i++) {
            if(buShoulist[i].getid()==index){
                return buShoulist[i];
            }
        }
        return buShou;

    }

    public Zi findTheRightZi(){
        Zi newZi = new Zi(0,0,0,"",0);
        for(int i=0; i<5; i++ ){

            for (int j=0; j<2; j++){
                if(){

                }
            }

        }

        return newZi;
    }
}

