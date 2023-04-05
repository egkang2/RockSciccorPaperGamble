package com.example.rocksissorpaperimage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class rocky extends AppCompatActivity {
    Random random;
    String[] array;
    float winrate;
    int tryrate;
    float triedrate;
    float winpercent;
    float hunwinpercent;

    float secondnum;
    String winzeropercent;
    String strResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rockscissorpapergamemode);
        ImageView player1 = findViewById(R.id.imageView10);
        ImageView computer = findViewById(R.id.imageView11);
        TextView resultarea = findViewById(R.id.textView);
        TextView textView = findViewById(R.id.textView2);
        winrate = 0;
        tryrate = 10;
        triedrate = 0;


        random = new Random();
        String[] array = {"가위", "바위", "보"};
        System.out.println((array[0]));


        ImageButton sciccor = findViewById(R.id.imageButton);
        sciccor.setImageResource(R.drawable.sciccor);
        sciccor.setOnClickListener(new View.OnClickListener() {

                                       @Override
                                       public void onClick(View v) {
                                           if (4 <= triedrate && triedrate <= 10&&hunwinpercent <= 60) {

                                                   computer.setImageResource((R.drawable.paper));
                                                   winrate = winrate + 1;
                                                   tryrate = tryrate - 1;
                                                   triedrate = triedrate + 1;
                                                   secondnum = winrate / triedrate;
                                                   winzeropercent = String.format("%.2f", secondnum);

                                                   winpercent = Float.parseFloat(winzeropercent);


                                                   hunwinpercent = winpercent * 100;
                                                   strResult = Float.toString(hunwinpercent);

                                                   resultarea.setText("승리했습니다. 현재 승리 횟수는" + winrate + "회입니다\n현재 남은 횟수는" + tryrate + "회입니다\n현재 승률은" + strResult + "%입니다.");
                                                   if (tryrate == 0) {
                                                       resultarea.setText("게임이 종료되었습니다. 현재 승리 횟수는" + winrate + "회입니다\n최종 승률은" + strResult + "%입니다.");
                                                       tryrate = 10;
                                                       winrate = 0;
                                                       triedrate = 0;
                                                       hunwinpercent = 0;

                                                   }



                                           } else {
                                               int num1 = random.nextInt(3);
                                               player1.setImageResource((R.drawable.sciccor));
                                               if (num1 == 0) {
                                                   computer.setImageResource((R.drawable.sciccor));
                                                   resultarea.setText("무승부입니다. 카운트되지 않습니다.");


                                               } else if (num1 == 1) {
                                                   computer.setImageResource((R.drawable.realrock));

                                                   tryrate = tryrate - 1;
                                                   triedrate = triedrate + 1;
                                                   secondnum = winrate / triedrate;

                                                   winzeropercent = String.format("%.2f", secondnum);

                                                   winpercent = Float.parseFloat(winzeropercent);
                                                   hunwinpercent = winpercent * 100;
                                                   strResult = Float.toString(hunwinpercent);


                                                   resultarea.setText("패배했습니다. 현재 승리 횟수는" + winrate + "회입니다\n현재 남은 횟수는" + tryrate + "회입니다\n현재 승률은" + strResult + "%입니다.");
                                                   if (tryrate == 0) {
                                                       resultarea.setText("게임이 종료되었습니다. 현재 승리 횟수는" + winrate + "회입니다\n최종 승률은" + strResult + "%입니다.");
                                                       tryrate = 10;
                                                       winrate = 0;
                                                       triedrate = 0;
                                                       hunwinpercent = 0;

                                                   }


                                               } else {
                                                   computer.setImageResource((R.drawable.paper));
                                                   winrate = winrate + 1;//승리 횟수
                                                   tryrate = tryrate - 1;//남은 시행 횟수
                                                   triedrate = triedrate + 1;//시행 한 횟수
                                                   secondnum = winrate / triedrate;//승률
                                                   winzeropercent = String.format("%.2f", secondnum);

                                                   winpercent = Float.parseFloat(winzeropercent);


                                                   hunwinpercent = winpercent * 100;
                                                   strResult = Float.toString(hunwinpercent);

                                                   resultarea.setText("승리했습니다. 현재 승리 횟수는" + winrate + "회입니다\n현재 남은 횟수는" + tryrate + "회입니다\n현재 승률은" + strResult + "%입니다.");
                                                   if (tryrate == 0) {
                                                       resultarea.setText("게임이 종료되었습니다. 현재 승리 횟수는" + winrate + "회입니다\n최종 승률은" + strResult + "%입니다.");
                                                       tryrate = 10;
                                                       winrate = 0;
                                                       triedrate = 0;

                                                   }

                                               }

                                           }
                                       }
                                   });
        ImageButton rock = findViewById(R.id.imageButton2);
        rock.setImageResource(R.drawable.realrock);
        rock.setOnClickListener(new View.OnClickListener() {


                                    @Override
                                    public void onClick(View v) {
                                        if (4 <= triedrate && triedrate <= 10&&hunwinpercent <= 60) {

                                            computer.setImageResource((R.drawable.sciccor));
                                            winrate = winrate + 1;
                                            tryrate = tryrate - 1;
                                            triedrate = triedrate + 1;
                                            secondnum = winrate / triedrate;
                                            winzeropercent = String.format("%.2f", secondnum);

                                            winpercent = Float.parseFloat(winzeropercent);


                                            hunwinpercent = winpercent * 100;
                                            strResult = Float.toString(hunwinpercent);

                                            resultarea.setText("승리했습니다. 현재 승리 횟수는" + winrate + "회입니다\n현재 남은 횟수는" + tryrate + "회입니다\n현재 승률은" + strResult + "%입니다.");
                                            if (tryrate == 0) {
                                                resultarea.setText("게임이 종료되었습니다. 현재 승리 횟수는" + winrate + "회입니다\n최종 승률은" + strResult + "%입니다.");
                                                tryrate = 10;
                                                winrate = 0;
                                                triedrate = 0;
                                                hunwinpercent = 0;

                                            }



                                        } else {
                                            int num1 = random.nextInt(3);
                                            player1.setImageResource((R.drawable.realrock));
                                            if (num1 == 0) {
                                                computer.setImageResource((R.drawable.realrock));
                                                resultarea.setText("무승부입니다. 카운트되지 않습니다.");


                                            } else if (num1 == 1) {
                                                computer.setImageResource((R.drawable.paper));

                                                tryrate = tryrate - 1;
                                                triedrate = triedrate + 1;
                                                secondnum = winrate / triedrate;

                                                winzeropercent = String.format("%.2f", secondnum);

                                                winpercent = Float.parseFloat(winzeropercent);
                                                hunwinpercent = winpercent * 100;
                                                strResult = Float.toString(hunwinpercent);


                                                resultarea.setText("패배했습니다. 현재 승리 횟수는" + winrate + "회입니다\n현재 남은 횟수는" + tryrate + "회입니다\n현재 승률은" + strResult + "%입니다.");
                                                if (tryrate == 0) {
                                                    resultarea.setText("게임이 종료되었습니다. 현재 승리 횟수는" + winrate + "회입니다\n최종 승률은" + strResult + "%입니다.");
                                                    tryrate = 10;
                                                    winrate = 0;
                                                    triedrate = 0;
                                                    hunwinpercent = 0;

                                                }


                                            } else {
                                                computer.setImageResource((R.drawable.sciccor));
                                                winrate = winrate + 1;//승리 횟수
                                                tryrate = tryrate - 1;//남은 시행 횟수
                                                triedrate = triedrate + 1;//시행 한 횟수
                                                secondnum = winrate / triedrate;//승률
                                                winzeropercent = String.format("%.2f", secondnum);

                                                winpercent = Float.parseFloat(winzeropercent);


                                                hunwinpercent = winpercent * 100;
                                                strResult = Float.toString(hunwinpercent);

                                                resultarea.setText("승리했습니다. 현재 승리 횟수는" + winrate + "회입니다\n현재 남은 횟수는" + tryrate + "회입니다\n현재 승률은" + strResult + "%입니다.");
                                                if (tryrate == 0) {
                                                    resultarea.setText("게임이 종료되었습니다. 현재 승리 횟수는" + winrate + "회입니다\n최종 승률은" + strResult + "%입니다.");
                                                    tryrate = 10;
                                                    winrate = 0;
                                                    triedrate = 0;

                                                }

                                            }

                                        }
                                    }

                                    });
        ImageButton paper = findViewById(R.id.imageButton3);
        paper.setImageResource(R.drawable.paper);
        paper.setOnClickListener(new View.OnClickListener() {

                                     @Override
                                     public void onClick(View v) {
                                         if (4 <= triedrate && triedrate <= 10&&hunwinpercent <= 60) {

                                             computer.setImageResource((R.drawable.realrock));
                                             winrate = winrate + 1;
                                             tryrate = tryrate - 1;
                                             triedrate = triedrate + 1;
                                             secondnum = winrate / triedrate;
                                             winzeropercent = String.format("%.2f", secondnum);

                                             winpercent = Float.parseFloat(winzeropercent);


                                             hunwinpercent = winpercent * 100;
                                             strResult = Float.toString(hunwinpercent);

                                             resultarea.setText("승리했습니다. 현재 승리 횟수는" + winrate + "회입니다\n현재 남은 횟수는" + tryrate + "회입니다\n현재 승률은" + strResult + "%입니다.");
                                             if (tryrate == 0) {
                                                 resultarea.setText("게임이 종료되었습니다. 현재 승리 횟수는" + winrate + "회입니다\n최종 승률은" + strResult + "%입니다.");
                                                 tryrate = 10;
                                                 winrate = 0;
                                                 triedrate = 0;
                                                 hunwinpercent = 0;

                                             }



                                         } else {
                                             int num1 = random.nextInt(3);
                                             player1.setImageResource((R.drawable.paper));
                                             if (num1 == 0) {
                                                 computer.setImageResource((R.drawable.paper));
                                                 resultarea.setText("무승부입니다. 카운트되지 않습니다.");


                                             } else if (num1 == 1) {
                                                 computer.setImageResource((R.drawable.sciccor));

                                                 tryrate = tryrate - 1;
                                                 triedrate = triedrate + 1;
                                                 secondnum = winrate / triedrate;

                                                 winzeropercent = String.format("%.2f", secondnum);

                                                 winpercent = Float.parseFloat(winzeropercent);
                                                 hunwinpercent = winpercent * 100;
                                                 strResult = Float.toString(hunwinpercent);


                                                 resultarea.setText("패배했습니다. 현재 승리 횟수는" + winrate + "회입니다\n현재 남은 횟수는" + tryrate + "회입니다\n현재 승률은" + strResult + "%입니다.");
                                                 if (tryrate == 0) {
                                                     resultarea.setText("게임이 종료되었습니다. 현재 승리 횟수는" + winrate + "회입니다\n최종 승률은" + strResult + "%입니다.");
                                                     tryrate = 10;
                                                     winrate = 0;
                                                     triedrate = 0;
                                                     hunwinpercent = 0;

                                                 }


                                             } else {
                                                 computer.setImageResource((R.drawable.realrock));
                                                 winrate = winrate + 1;//승리 횟수
                                                 tryrate = tryrate - 1;//남은 시행 횟수
                                                 triedrate = triedrate + 1;//시행 한 횟수
                                                 secondnum = winrate / triedrate;//승률
                                                 winzeropercent = String.format("%.2f", secondnum);

                                                 winpercent = Float.parseFloat(winzeropercent);


                                                 hunwinpercent = winpercent * 100;
                                                 strResult = Float.toString(hunwinpercent);

                                                 resultarea.setText("승리했습니다. 현재 승리 횟수는" + winrate + "회입니다\n현재 남은 횟수는" + tryrate + "회입니다\n현재 승률은" + strResult + "%입니다.");
                                                 if (tryrate == 0) {
                                                     resultarea.setText("게임이 종료되었습니다. 현재 승리 횟수는" + winrate + "회입니다\n최종 승률은" + strResult + "%입니다.");
                                                     tryrate = 10;
                                                     winrate = 0;
                                                     triedrate = 0;

                                                 }

                                             }

                                         }
                                     }

                                     });


    };
}







