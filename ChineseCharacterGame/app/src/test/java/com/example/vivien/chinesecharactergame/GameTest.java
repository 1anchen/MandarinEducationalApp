package com.example.vivien.chinesecharactergame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

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

        this.game = new Game();
        this.waterSign = new PianPang( 1, R.drawable.sandianshuileft, R.drawable.water);
        this.woodSign = new PianPang( 2, R.drawable.muzhipiangleft, R.drawable.wood);
        this.fireSign = new PianPang( 3, R.drawable.huozileft, R.drawable.fire);
        this.shellSign = new PianPang( 4, R.drawable.beizhileft, R.drawable.shell);
        this.goldSign = new PianPang( 5, R.drawable.jinzibianleft, R.drawable.gold);
        this.adultMaleSign = new BuShou(1, R.drawable.dingziright, new int[]{1,2,3,5});
        this.abilitySign = new BuShou(2, R.drawable.cairight, new int[]{2,4});

    }

    @Test
    public void canMatchWaterSignVSAdultMaleSignReturnTrue(){
        assertEquals(true, game.match(waterSign,adultMaleSign));
    }
    @Test
    public void canMatchWaterSignVSAbilitySignReturnFalse(){
        assertEquals(false, game.match(waterSign,abilitySign));
    }

    @Test
    public void canMatchWoodSignVSAdultMaleSignReturnTrue(){
        assertEquals(true, game.match(woodSign,adultMaleSign));
    }
    @Test
    public void canMatchWoodSignVSAbilitySignReturnTrue(){
        assertEquals(true, game.match(woodSign,abilitySign));
    }

    @Test
    public void canMatchFireSignVSAdultMaleSignReturnTrue(){
        assertEquals(true, game.match(fireSign,adultMaleSign));
    }
    @Test
    public void canMatchFireSignVSAbilitySignReturnFalse(){
        assertEquals(false, game.match(fireSign,abilitySign));
    }

    @Test
    public void canMatchShellSignVSAdultMaleSignReturnFalse(){
        assertEquals(false, game.match(shellSign,adultMaleSign));
    }
    @Test
    public void canMatchShellSignVSAbilitySignReturnTrue(){
        assertEquals(true, game.match(shellSign,abilitySign));
    }

    @Test
    public void canMatchGoldSignVSAdultMaleSignReturnTrue(){
        assertEquals(true, game.match(goldSign,adultMaleSign));
    }
    @Test
    public void canMatchGoldSignVSAbilitySignReturnFalse(){
        assertEquals(false, game.match(goldSign,abilitySign));
    }



}
