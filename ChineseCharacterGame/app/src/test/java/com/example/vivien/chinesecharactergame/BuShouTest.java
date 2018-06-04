package com.example.vivien.chinesecharactergame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuShouTest {

    BuShou buShou;

    @Before
    public void before() {
        this.buShou = new BuShou(1, R.drawable.dingziright);
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
    public void canGetImageList(){
        assertEquals(2, buShou.getImagelist().length);
    }

    @Test
    public void canGetCurrentIndex(){
        assertEquals(0, buShou.getCurrentIndex());
    }


}
