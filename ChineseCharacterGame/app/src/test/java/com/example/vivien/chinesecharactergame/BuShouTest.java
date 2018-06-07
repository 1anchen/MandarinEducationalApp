package com.example.vivien.chinesecharactergame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuShouTest {

    BuShou buShou;

    @Before
    public void before() {
        this.buShou = new BuShou(1, R.drawable.dingziright, R.drawable.adultmale,"Adult Male Over 18",new int[]{1,2,3,5});
    }

    @Test
    public void canGetId(){
        assertEquals(1, buShou.getid());
    }

    @Test
    public void canAccessImage(){
        assertEquals(R.drawable.dingziright, buShou.getImage());
    }

    @Test
    public void canAccessSymbol(){
        assertEquals(R.drawable.adultmale, buShou.getSymbol());
    }

    @Test
    public void canGetImageList(){
        assertEquals(2, buShou.getImagelist().length);
    }

    @Test
    public void canGetCurrentIndex(){
        assertEquals(0, buShou.getCurrentIndex());
    }

    @Test
    public void canGetPianPangList(){
        assertEquals(4, buShou.getPainPangList().length);
    }

    @Test
    public void canGetInformation(){
        assertEquals("Adult Male Over 18", buShou.getInformation());
    }

    @Test
    public void canGetPianPangListFristIndex(){
        assertEquals(1, buShou.getPainPangList()[0]);
    }

    @Test
    public void canGetPianPangListSecondIndex(){
        assertEquals(2, buShou.getPainPangList()[1]);
    }

    @Test
    public void canGetPianPangListThirdIndex(){
        assertEquals(3, buShou.getPainPangList()[2]);
    }

    @Test
    public void canGetPianPangListForthIndex(){
        assertEquals(5, buShou.getPainPangList()[3]);
    }



}
