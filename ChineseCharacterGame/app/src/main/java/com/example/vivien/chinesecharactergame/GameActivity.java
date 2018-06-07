package com.example.vivien.chinesecharactergame;

import android.media.MediaPlayer;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class GameActivity extends AppCompatActivity {

    private TextView  field;
    private ImageView topLeft, bottonLeft, bottonRight,topRight, topCenter;
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
    private Zi shallowland;
    private Zi stick;
    private Zi light;
    private Zi nail;
    private Zi timber;
    private Zi wealth;
    private Zi wrong;
    private Zi newZi;





    @Override
     public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        topLeft =  findViewById(R.id.top_left);
        bottonLeft =  findViewById(R.id.botton_left);
        bottonRight =  findViewById(R.id.bottom_right);
        topRight =  findViewById(R.id.top_right);
        topCenter = findViewById(R.id.top_center);
        field =  findViewById(R.id.field);
        gameField = findViewById(R.id.game_field);
        this.waterSign = new PianPang(1, R.drawable.sandianshuileft, R.drawable.water, "WaterSign");
        this.woodSign = new PianPang( 2, R.drawable.muzhipiangleft, R.drawable.wood,"WoodSign");
        this.fireSign = new PianPang( 3, R.drawable.huozileft, R.drawable.fire,"FireSign");
        this.shellSign = new PianPang( 4, R.drawable.beizhileft, R.drawable.shell,"ShellSign");
        this.goldSign = new PianPang( 5, R.drawable.jinzibianleft, R.drawable.gold,"GoldSign");
        this.pianPanglist = new PianPang[]{waterSign,woodSign,fireSign,shellSign,goldSign};
        this.game = new Game();
        this.adultMaleSign = new BuShou(1, R.drawable.dingziright, R.drawable.adultmale,"Adult Male Over 18",new int[]{1,2,3,5});
        this.abilitySign = new BuShou(2, R.drawable.cairight, R.drawable.ability,"Ability", new int[]{2,4});
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

        public void onClick(View view) {

            random = new Random();
            number1 = random.nextInt(5);
            number2 = random.nextInt(2);

            bottonLeft.setImageResource(game.getPianPangIamgeByID(number1));
            topLeft.setImageResource(game.getPianPangSymbolByID(number1));
            bottonRight.setImageResource(game.getBuShouIamgeByID(number2));
            topRight.setImageResource(game.getBuShouSymbolByID(number2));

            final MediaPlayer bleatSound = MediaPlayer.create(this, R.raw.bleat);
            final MediaPlayer pcaiSound = MediaPlayer.create(this, R.raw.pcai);
            final MediaPlayer pchengSound = MediaPlayer.create(this, R.raw.pcheng);
            final MediaPlayer pdengSound = MediaPlayer.create(this, R.raw.pdeng);
            final MediaPlayer pdingSound = MediaPlayer.create(this, R.raw.pding);
            final MediaPlayer ptingSound = MediaPlayer.create(this, R.raw.pting);

            if (game.match(game.getPianPangByID(number1),game.getBuShouByID(number2))){

                newZi = game.findTheRightZi(game.getPianPangByID(number1),game.getBuShouByID(number2));
                topCenter.setImageResource(newZi.getImage());
                field.setText(newZi.getDefinition());

                if (newZi.getId() == 1){
                    ptingSound.start();
                }else if (newZi.getId() == 2){
                    pchengSound.start();
                }else if (newZi.getId() == 3){
                    pdengSound.start();
                }else if (newZi.getId() == 4){
                    pdingSound.start();
                }else {
                    pcaiSound.start();
                }


            }
            else{

                topCenter.setImageResource(this.wrong.getImage());
                field.setText(this.wrong.getDefinition());
                bleatSound.start();
            }
        }
     }















