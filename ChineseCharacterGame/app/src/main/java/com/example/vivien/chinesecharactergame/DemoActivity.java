package com.example.vivien.chinesecharactergame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class DemoActivity extends AppCompatActivity {
    private ImageView left, right;
    private Button maingame;
    private TextView demo;
    private Game game;
    private PianPang waterSign;
    private PianPang woodSign;
    private PianPang fireSign;
    private PianPang shellSign;
    private PianPang goldSign;
    private Random random;
    private PianPang[] pianPanglist;
    private int number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        left = findViewById(R.id.left);
        right = findViewById(R.id.right);
        maingame = findViewById(R.id.maingame);
        demo = findViewById(R.id.demo_text);
        this.waterSign = new PianPang(1, R.drawable.sandianshuileft, R.drawable.water, "WaterSign");
        this.woodSign = new PianPang( 2, R.drawable.muzhipiangleft, R.drawable.wood,"WoodSign");
        this.fireSign = new PianPang( 3, R.drawable.huozileft, R.drawable.fire,"FireSign");
        this.shellSign = new PianPang( 4, R.drawable.beizhileft, R.drawable.shell,"ShellSign");
        this.goldSign = new PianPang( 5, R.drawable.jinzibianleft, R.drawable.gold,"GoldSign");
        this.pianPanglist = new PianPang[]{waterSign,woodSign,fireSign,shellSign,goldSign};
        this.game = new Game();

    }

    public void onClickListener(View view){
        random = new Random();
        number = random.nextInt(5);

        left.setImageResource(game.getPianPangIamgeByID(number));
        right.setImageResource(game.getPianPangSymbolByID(number));
        Toast.makeText(getApplicationContext(),game.getPianPangDemoText(number),Toast.LENGTH_SHORT).show();

    }

    public void onClickToNextPage(View view) {
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }
}
