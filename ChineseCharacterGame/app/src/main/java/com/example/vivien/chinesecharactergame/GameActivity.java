package com.example.vivien.chinesecharactergame;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class GameActivity extends AppCompatActivity {

    private TextView topRight, field;
    private ImageView topLeft, bottonLeft, bottonRight;
    private Game game;
    private PianPang waterSign;
    private PianPang woodSign;
    private PianPang fireSign;
    private PianPang shellSign;
    private PianPang goldSign;
    private PianPang[] pianPanglist;
    private BuShou adultMaleSign;
    private BuShou abilitySign;
    private ConstraintLayout gameField;
    private boolean isStarted;
    private Random random;
    private int number1;
    private int number2;



    @Override
     public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        topLeft =  findViewById(R.id.top_left);
        bottonLeft =  findViewById(R.id.botton_left);
        bottonRight =  findViewById(R.id.bottom_right);
        topRight =  findViewById(R.id.top_right);
        field =  findViewById(R.id.field);
        gameField = findViewById(R.id.game_field);
        this.waterSign = new PianPang(1, R.drawable.sandianshuileft, R.drawable.water, "WaterSign");
        this.woodSign = new PianPang( 2, R.drawable.muzhipiangleft, R.drawable.wood,"WoodSign");
        this.fireSign = new PianPang( 3, R.drawable.huozileft, R.drawable.fire,"FireSign");
        this.shellSign = new PianPang( 4, R.drawable.beizhileft, R.drawable.shell,"ShellSign");
        this.goldSign = new PianPang( 5, R.drawable.jinzibianleft, R.drawable.gold,"GoldSign");
        this.pianPanglist = new PianPang[]{waterSign,woodSign,fireSign,shellSign,goldSign};
        this.game = new Game();
        this.adultMaleSign = new BuShou(1, R.drawable.dingziright, "Adult Male Over 18",new int[]{1,2,3,5});
        this.abilitySign = new BuShou(2, R.drawable.cairight,"Ability", new int[]{2,4});

//        gameField.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//
//
//        })

        }

        public void onClick(View view) {

            random = new Random();
            number1 = random.nextInt(5);
            number2 = random.nextInt(2);

            bottonLeft.setImageResource(game.getPianPangIamgeByID(number1));
            topLeft.setImageResource(game.getPianPangSymbolByID(number1));
            bottonRight.setImageResource(game.getBuShouIamgeByID(number2));
            topRight.setText(game.getBuShouInformationByID(number2));

            if (game.match(game.getPianPangByID(number1),game.getBuShouByID(number2))){

            }


        }
//            if (isStarted) {
//                pianPang.stopWheel();
//                buShou.stopWheel();
//
//                if (game.match(pianPang,buShou)) {
//                    field.setText("Match ");
//                } else {
//                    field.setText("Not Match");
//                }
//
//
//                isStarted = false;
//
//            } else {
//                //pianPang = new PianPang( 1, R.drawable.sandianshuileft, R.drawable.water);
////                pianPang.newImage(pianPang.getImage());
//
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        bottonLeft.setImageResource(pianPang.getImage());
//                    }
//                });
//
//
//                pianPang.start();
//
////                buShou = new BuShou(1, R.drawable.dingziright, new int[]{1,2,3,5});
////                buShou.newImage(buShou.getImage());
//                    runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        bottonLeft.setImageResource(buShou.getImage());
//                    }
//                 });
//
//
//
//                buShou.start();
//
//
//                field.setText("");
//                isStarted = true;
//            }
//        }






}





