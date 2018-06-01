package com.example.vivien.chinesecharactergame;

import java.util.Random;

public class PianPang implements IRandom{

    public int spin(){
        Random random = new Random();
        int number = random.nextInt(6);
        return number;
    }

}
