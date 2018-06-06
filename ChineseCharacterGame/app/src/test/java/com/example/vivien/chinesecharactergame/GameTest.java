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
        this.waterSign = new PianPang(1, R.drawable.sandianshuileft, R.drawable.water, "WaterSign");
        this.woodSign = new PianPang( 2, R.drawable.muzhipiangleft, R.drawable.wood,"WoodSign");
        this.fireSign = new PianPang( 3, R.drawable.huozileft, R.drawable.fire,"FireSign");
        this.shellSign = new PianPang( 4, R.drawable.beizhileft, R.drawable.shell,"ShellSign");
        this.goldSign = new PianPang( 5, R.drawable.jinzibianleft, R.drawable.gold,"GoldSign");
        this.adultMaleSign = new BuShou(1, R.drawable.dingziright,"Adult Male Over 18", new int[]{1,2,3,5});
        this.abilitySign = new BuShou(2, R.drawable.cairight, "Ability",new int[]{2,4});

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

    @Test
    public void canGetRamdomIndexSymbolImageIndexOne(){
        assertEquals(R.drawable.water, game.getPianPangSymbolByID(0));
    }

    @Test
    public void canGetRamdomIndexSymbolImageIndexTwo(){
        assertEquals(R.drawable.wood, game.getPianPangSymbolByID(1));
    }

    @Test
    public void canGetRamdomIndexSymbolImageIndexThree(){
        assertEquals( R.drawable.fire, game.getPianPangSymbolByID(2));
    }

    @Test
    public void canGetRamdomIndexSymbolImageIndexFour(){
        assertEquals( R.drawable.shell, game.getPianPangSymbolByID(3));
    }

    @Test
    public void canGetRamdomIndexSymbolImageIndexFive(){
        assertEquals( R.drawable.gold, game.getPianPangSymbolByID(4));
    }

    @Test
    public void canGetPianPangNameIndexOne(){

        assertEquals("WaterSign", game.getPianPangDemoText(0));
    }

    @Test
    public void canGetPianPangNameIndexTwo(){

        assertEquals("WoodSign", game.getPianPangDemoText(1));
    }

    @Test
    public void canGetPianPangNameIndexThree(){

        assertEquals("FireSign", game.getPianPangDemoText(2));
    }

    @Test
    public void canGetPianPangNameIndexFour(){

        assertEquals("ShellSign", game.getPianPangDemoText(3));
    }

    @Test
    public void canGetPianPangNameIndexFive(){

        assertEquals("GoldSign", game.getPianPangDemoText(4));
    }


    @Test
    public void canGetRamdomIndexBuShouSymbolImageIndexOne(){
        assertEquals(R.drawable.dingziright, game.getBuShouIamgeByID(0));
    }

    @Test
    public void canGetRamdomIndexBuShouSymbolImageIndexTwo(){
        assertEquals(R.drawable.cairight, game.getBuShouIamgeByID(1));
    }

    @Test
    public void canGetBuShouInformationNumberOne(){

        assertEquals("Adult Male Over 18", game.getBuShouInformationByID(0));

    }@Test
    public void canGetBuShouInformationNumberTwo(){

        assertEquals("Ability", game.getBuShouInformationByID(1));
    }

    @Test
    public void canGetIsStarted(){
        assertEquals(true, game.getIsStarted());
    }
    @Test
    public void canGetPianPangByIDZero(){
        assertEquals(waterSign.name, game.getPianPangByID(0).getPianPangName());
    }
    @Test
    public void canGetPianPangByIDOne(){
        assertEquals(woodSign.name, game.getPianPangByID(1).getPianPangName());
    }
    @Test
    public void canGetPianPangByIDTwo(){
        assertEquals(fireSign.name, game.getPianPangByID(2).getPianPangName());
    }
    @Test
    public void canGetPianPangByIDThree(){
        assertEquals(shellSign.name, game.getPianPangByID(3).getPianPangName());
    }
    @Test
    public void canGetPianPangByIDFour(){
        assertEquals(goldSign.name, game.getPianPangByID(4).getPianPangName());
    }

    @Test
    public void canGetBuShouByIDZero(){
        assertEquals(adultMaleSign.information, game.getBuShouByID(0).getInformation());
    }
    @Test
    public void canGetBuShouByIDOne(){
        assertEquals(abilitySign.information, game.getBuShouByID(1).getInformation());
    }


}
