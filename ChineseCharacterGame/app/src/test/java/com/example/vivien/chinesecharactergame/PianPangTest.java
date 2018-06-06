package com.example.vivien.chinesecharactergame;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class PianPangTest {
    PianPang pianPang;
    int number;
    Random random;

    @Before
    public void before() {

        this.pianPang = new PianPang(1, R.drawable.sandianshuileft, R.drawable.water, "WaterSign");
        this.random = new Random();
        this.number = random.nextInt(5);

    }

    @Test
    public void canGetId(){
        assertEquals(1, pianPang.getid());
    }

    @Test
    public void canAccessImage(){
        assertEquals(R.drawable.dingziright, pianPang.getImage());
    }

    @Test
    public void canAccessSymbol(){
        assertEquals(R.drawable.huozileft, pianPang.getSymbol());
    }


    @Test
    public void canGetImageList(){
        assertEquals(5, pianPang.getImagelist().length);
    }

    @Test
    public void canGetCurrentIndex(){
        assertEquals(0, pianPang.getCurrentIndex());
    }

    @Test
    public void canGetStartTime(){
        assertEquals(500, pianPang.getStartTime());
    }

    @Test
    public void canStart(){
        assertEquals(true, pianPang.getIsStarted());
    }

    @Test
    public void canGetFlashingTime() {
        assertEquals(0, pianPang.getFlashingTime());
    }

    @Test
    public void canSpin(){
        pianPang.spin();
        assertEquals(1, pianPang.getCurrentIndex());
    }

    @Test
    public void canTwiceSpin(){
        pianPang.spin();
        pianPang.spin();
        assertEquals(2, pianPang.getCurrentIndex());
    }

    @Test
    public void canSpinSixTimes(){
        pianPang.spin();
        pianPang.spin();
        pianPang.spin();
        pianPang.spin();
        pianPang.spin();
        pianPang.spin();
        assertEquals(0, pianPang.getCurrentIndex());
    }

    @Test
    public void canStopWheel(){
        pianPang.stopWheel();
        assertEquals(false,pianPang.getIsStarted());
    }


    @Test
    public void canReturnRandomImageIndexZero(){
        assertEquals(R.drawable.sandianshuileft,pianPang.randomImage(0));
    }

    @Test
    public void canReturnRandomImageIndexOne(){
        assertEquals(R.drawable.beizhileft,pianPang.randomImage(1));
    }

    @Test
    public void canReturnRandomImageIndexTwo(){
        assertEquals(R.drawable.huozileft,pianPang.randomImage(2));
    }

    @Test
    public void canReturnRandomImageIndexThree(){
        assertEquals(R.drawable.jinzibianleft,pianPang.randomImage(3));
    }

    @Test
    public void canReturnRandomImageIndexFive(){
        assertEquals(R.drawable.muzhipiangleft,pianPang.randomImage(4));
    }

    @Test
    public void canGetPianPangName(){
        assertEquals("WaterSign", pianPang.getPianPangName());
    }











}
