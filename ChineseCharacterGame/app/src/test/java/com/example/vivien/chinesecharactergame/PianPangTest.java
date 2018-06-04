package com.example.vivien.chinesecharactergame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianPangTest {
    PianPang pianPang;

    @Before
    public void before() {

        this.pianPang = new PianPang(1,R.drawable.dingziright, R.drawable.huozileft);
    }

    @Test
    public void canAccessImage(){
        assertEquals(R.drawable.dingziright, pianPang.image);
    }

    @Test
    public void canAccessSymbol(){
        assertEquals(R.drawable.dingziright, pianPang.image);
    }
}
