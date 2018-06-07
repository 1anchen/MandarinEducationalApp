package com.example.vivien.chinesecharactergame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZiTest {
    Zi shallowland;
    Zi stick;
    Zi light;
    Zi nail;
    Zi timber;
    Zi wealth;
    Zi wrong;

    Game game;
    PianPang waterSign;
    PianPang woodSign;
    PianPang fireSign;
    PianPang shellSign;
    PianPang goldSign;
    BuShou adultMaleSign;
    BuShou abilitySign;


    @Before
    public void before() {
        this.shallowland = new Zi(1,1,1,"Pronounce : Ting || Definition :  a shallow land near a river ",
                R.drawable.shallowland, R.raw.pting);
        this.stick = new Zi(2,2,1,"Pronounce : Cheng || Definition :  Strike, Hit against ",
                R.drawable.stick, R.raw.pcheng);
        this.light = new Zi(3,3,1,"Pronounce : Deng || Definition :  Light ",
                R.drawable.light, R.raw.pdeng);
        this.nail = new Zi(4,5,1,"Pronounce : Ding || Definition :  Nail ",
                R.drawable.nail, R.raw.pding);
        this.timber = new Zi(5,2,2,"Pronounce : Cai || Definition :  Timber, Wooden Material ",
                R.drawable.timber,R.raw.pcai);
        this.wealth = new Zi(6,4,2,"Pronounce : Cai || Definition :  Wealth, Property, Valuables ",
                R.drawable.wealth,R.raw.pcai);
        this.wrong = new Zi(7,0,0,"Sorry This Word Doesn't Exit, You Can Call It Whatever You Want ",
                R.drawable.wrong,R.raw.bleat);
        this.game = new Game();
        this.waterSign = new PianPang(1, R.drawable.sandianshuileft, R.drawable.water, "WaterSign");
        this.woodSign = new PianPang( 2, R.drawable.muzhipiangleft, R.drawable.wood,"WoodSign");
        this.fireSign = new PianPang( 3, R.drawable.huozileft, R.drawable.fire,"FireSign");
        this.shellSign = new PianPang( 4, R.drawable.beizhileft, R.drawable.shell,"ShellSign");
        this.goldSign = new PianPang( 5, R.drawable.jinzibianleft, R.drawable.gold,"GoldSign");
        this.adultMaleSign = new BuShou(1, R.drawable.dingziright,R.drawable.adultmale,"Adult Male Over 18", new int[]{1,2,3,5});
        this.abilitySign = new BuShou(2, R.drawable.cairight, R.drawable.ability,"Ability",new int[]{2,4});

    }

    @Test
    public void canGetPianPangId(){
        assertEquals(0, wrong.getPianPangId());
    }

    @Test
    public void canGetBuShouId(){
        assertEquals(0, wrong.getBuShouId());
    }

    @Test
    public void canGetImage(){
        assertEquals(R.drawable.wrong, wrong.getImage());
    }

    @Test
    public void canGetDefinition(){
        assertEquals("Sorry This Word Doesn't Exit, You Can Call It Whatever You Want ", wrong.getDefinition());
    }
//
//    @Test
//    public void canGetSound(){
//        assertEquals(R.raw.bleat, wrong.getMediaPlayer().getSelectedTrack(1));
//    }



}
