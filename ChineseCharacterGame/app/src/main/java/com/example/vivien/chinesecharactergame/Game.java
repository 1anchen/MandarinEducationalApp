package com.example.vivien.chinesecharactergame;

import java.util.Random;

public class Game {

public boolean match(PianPang pianPang, BuShou buShou){

    for(int i=0; i< buShou.getPainPangList().length; i++){

        if (pianPang.getid() == buShou.getPainPangList()[i]){
            return true;
        }
    }
    return false;
}

}

