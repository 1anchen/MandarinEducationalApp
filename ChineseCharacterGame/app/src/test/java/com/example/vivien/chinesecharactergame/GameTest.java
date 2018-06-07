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
    Zi shallowland;
    Zi stick;
    Zi light;
    Zi nail;
    Zi timber;
    Zi wealth;
    Zi wrong;


    @Before
    public void before() {

        this.game = new Game();
        this.waterSign = new PianPang(1, R.drawable.sandianshuileft, R.drawable.water, "WaterSign");
        this.woodSign = new PianPang( 2, R.drawable.muzhipiangleft, R.drawable.wood,"WoodSign");
        this.fireSign = new PianPang( 3, R.drawable.huozileft, R.drawable.fire,"FireSign");
        this.shellSign = new PianPang( 4, R.drawable.beizhileft, R.drawable.shell,"ShellSign");
        this.goldSign = new PianPang( 5, R.drawable.jinzibianleft, R.drawable.gold,"GoldSign");
        this.adultMaleSign = new BuShou(1, R.drawable.dingziright,R.drawable.adultmale,"Adult Male Over 18", new int[]{1,2,3,5});
        this.abilitySign = new BuShou(2, R.drawable.cairight, R.drawable.ability,"Ability",new int[]{2,4});
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

    @Test
    public void canFindTheRightZiShallowland(){
        assertEquals(shallowland.getDefinition(),game.findTheRightZi(waterSign,adultMaleSign).getDefinition());
    }

    @Test
    public void canFindTheRightZiStick(){
        assertEquals(stick.getDefinition(),game.findTheRightZi(woodSign,adultMaleSign).getDefinition());
    }

    @Test
    public void canFindTheRightZiLight(){
        assertEquals(light.getDefinition(),game.findTheRightZi(fireSign,adultMaleSign).getDefinition());
    }

    @Test
    public void canFindTheRightZiWrongOne(){
        assertEquals(wrong.getDefinition(),game.findTheRightZi(shellSign,adultMaleSign).getDefinition());
    }

    @Test
    public void canFindTheRightZiNail(){
        assertEquals(nail.getDefinition(),game.findTheRightZi(goldSign,adultMaleSign).getDefinition());
    }

    @Test
    public void canFindTheRightZiWrongTwo(){
        assertEquals(wrong.getDefinition(),game.findTheRightZi(waterSign,abilitySign).getDefinition());
    }

    @Test
    public void canFindTheRightZiTimber(){
        assertEquals(timber.getDefinition(),game.findTheRightZi(woodSign,abilitySign).getDefinition());
    }

    @Test
    public void canFindTheRightZiWrongThree(){
        assertEquals(wrong.getDefinition(),game.findTheRightZi(fireSign,abilitySign).getDefinition());
    }
    @Test
    public void canFindTheRightZiWealth(){
        assertEquals(wealth.getDefinition(),game.findTheRightZi(shellSign,abilitySign).getDefinition());
    }
    @Test
    public void canFindTheRightZiWrongFour(){
        assertEquals(wrong.getDefinition(),game.findTheRightZi(goldSign,abilitySign).getDefinition());
    }


}
