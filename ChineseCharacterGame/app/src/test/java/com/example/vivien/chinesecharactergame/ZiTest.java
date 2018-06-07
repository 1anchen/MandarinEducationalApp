package com.example.vivien.chinesecharactergame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZiTest {
    Zi shallowland;
    Zi stick;
    Zi shallowland;
    Zi shallowland;
    Zi shallowland;
    Zi shallowland;
    Zi shallowland;

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
        this.shallowland = new Zi(1,"Pronounce : Ting || Definition :  a shallow land near a river",
                R.drawable.shallowLand);
        this.shallowland = new Zi(2,"Pronounce : Cheng || Definition :  Strike, Hit against ",
                R.drawable.stick);
        this.shallowland = new Zi(2,"Pronounce : Cheng || Definition :  Strike, Hit against ",
                R.drawable.stick);
        this.shallowland = new Zi(2,"Pronounce : Cheng || Definition :  Strike, Hit against ",
                R.drawable.stick);
        this.shallowland = new Zi(2,"Pronounce : Cheng || Definition :  Strike, Hit against ",
                R.drawable.stick);
        this.shallowland = new Zi(2,"Pronounce : Cheng || Definition :  Strike, Hit against ",
                R.drawable.stick);
        this.shallowland = new Zi(2,"Pronounce : Cheng || Definition :  Strike, Hit against ",
                R.drawable.stick);
        this.game = new Game();
        this.waterSign = new PianPang(1, R.drawable.sandianshuileft, R.drawable.water, "WaterSign");
        this.woodSign = new PianPang( 2, R.drawable.muzhipiangleft, R.drawable.wood,"WoodSign");
        this.fireSign = new PianPang( 3, R.drawable.huozileft, R.drawable.fire,"FireSign");
        this.shellSign = new PianPang( 4, R.drawable.beizhileft, R.drawable.shell,"ShellSign");
        this.goldSign = new PianPang( 5, R.drawable.jinzibianleft, R.drawable.gold,"GoldSign");
        this.adultMaleSign = new BuShou(1, R.drawable.dingziright,"Adult Male Over 18", new int[]{1,2,3,5});
        this.abilitySign = new BuShou(2, R.drawable.cairight, "Ability",new int[]{2,4});

    }

    @Test
    public void canGetPianPangId(){
        assertEquals(0, zi.getPianPangId());
    }

    @Test
    public void canGetBuShouId(){
        assertEquals(0, zi.getBuShouId());
    }

    @Test
    public void canGetImage(){
        assertEquals(0, zi.getImage());
    }

    @Test
    public void canGetDefinition(){
        assertEquals("", zi.getDefinition());
    }

    @Test
    public void canSetPianPangId(){
        zi.setPianPangId(waterSign.getid());
        assertEquals(1, zi.getPianPangId());
    }

    @Test
    public void canSetBuShouId(){
        zi.setBuShouId(adultMaleSign.getid());
        assertEquals(1, zi.getBuShouId());
    }

    @Test
    public void canSetImage(){
        zi.setImage(R.drawable.wrong);
        assertEquals(R.drawable.wrong, zi.getImage());
    }

    @Test
    public void canSetDefinition(){
        zi.setDefinition("Wrong");
        assertEquals("Wrong", zi.getDefinition());
    }

}
