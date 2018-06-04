package com.example.vivien.chinesecharactergame;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class GameActivity extends AppCompatActivity {

    private TextView topRight, field;
    private ImageView topLeft, bottonLeft, bottonRight;
    private PianPang pianPang;
    private BuShou buShou;
    private ConstraintLayout gamefield;
    private boolean isStarted;
}

//    public static final Random RANDOM = new Random();

//    public static long randomLong(long lower, long upper) {
//        return lower + (long) (RANDOM.nextDouble() * (upper - lower));
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_game);
//        topLeft =  findViewById(R.id.top_left);
//        bottonLeft =  findViewById(R.id.botton_left);
//        bottonRight =  findViewById(R.id.bottom_right);
//        topRight =  findViewById(R.id.top_right);
//        field =  findViewById(R.id.field);
//        gamefield = findViewById(R.id.game_field);
//
//    }
//
//        public void onClickListener(new View.OnClickListener()) {
//        @Override
//        public void onClick(View view) {
//            if (isStarted) {
//                pianPang.stopWheel();
//                buShou.stopWheel();
//
//                        if (wheel1.currentIndex == wheel2.currentIndex && wheel2.currentIndex == wheel3.currentIndex) {
//                            msg.setText("You win the big prize");
//                        } else if (wheel1.currentIndex == wheel2.currentIndex || wheel2.currentIndex == wheel3.currentIndex
//                                || wheel1.currentIndex == wheel3.currentIndex) {
//                            msg.setText("Little Prize");
//                        } else {
//                            msg.setText("You lose");
//                        }
//
//                        btn.setText("Start");
//                        isStarted = false;
//
//            } else {
//
//                        wheel1 = new Wheel(new Wheel.WheelListener() {
//                            @Override
//                            public void newImage(final int img) {
//                                runOnUiThread(new Runnable() {
//                                    @Override
//                                    public void run() {
//                                        img1.setImageResource(img);
//                                    }
//                                });
//                            }
//                        }, 200, randomLong(0, 200));
//
//                        wheel1.start();
//
//                        wheel2 = new Wheel(new Wheel.WheelListener() {
//                            @Override
//                            public void newImage(final int img) {
//                                runOnUiThread(new Runnable() {
//                                    @Override
//                                    public void run() {
//                                        img2.setImageResource(img);
//                                    }
//                                });
//                            }
//                        }, 200, randomLong(150, 400));
//
//                        wheel2.start();
//
//                        wheel3 = new Wheel(new Wheel.WheelListener() {
//                            @Override
//                            public void newImage(final int img) {
//                                runOnUiThread(new Runnable() {
//                                    @Override
//                                    public void run() {
//                                        img3.setImageResource(img);
//                                    }
//                                });
//                            }
//                        }, 200, randomLong(150, 400));
//
//                        wheel3.start();
//
//                        btn.setText("Stop");
//                        msg.setText("");
//                        isStarted = true;
//                    }
//                }
//            });
//        }
//    }
//
//
//
//
//}
