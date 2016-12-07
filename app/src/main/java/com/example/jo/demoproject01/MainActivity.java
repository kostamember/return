package com.example.jo.demoproject01;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    Button btn[] = new Button[5];
    ViewPager viewPager = null;
    Thread thread = null;
    Handler handler = null;
    int p=0;   //페이지번호
    int v=1;   //화면 전환 뱡향


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getSupportActionBar().setIcon(R.mipmap.ic_launcher);






                //viewPager
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        MyViewPagerAdapter adapter = new MyViewPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        btn[0] = (Button)findViewById(R.id.btn_a);
        btn[1] = (Button)findViewById(R.id.btn_b);
        btn[2] = (Button)findViewById(R.id.btn_c);
        btn[3] = (Button)findViewById(R.id.btn_d);
        btn[4] = (Button)findViewById(R.id.btn_e);

        for(int i=0;i<btn.length; i++){
            btn[i].setOnClickListener(this);
        }





            handler = new Handler() {

                public void handleMessage(android.os.Message msg) {
                    if (p == 0) {
                        viewPager.setCurrentItem(1);
                        p++;
                        v = 1;
                    }




                }



            };


                thread = new Thread(){
                    //run은 jvm이 쓰레드를 채택하면, 해당 쓰레드의 run메서드를 수행한다.
                    public void run() {
                        super.run();
                        while(true){
                            try {
                                Thread.sleep(2000);
                                handler.sendEmptyMessage(0);
                            } catch (InterruptedException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }


                        }
                    }
                };
                thread.start();

    }


    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.btn_a:

                Intent intent0 = new Intent(this,Recipe.class);
                intent0.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent0.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent0);


                //viewPager.setCurrentItem(0);
                //Toast.makeText(this,"추천메뉴", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_b:
                Intent intent = new Intent(this,Material.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);

                break;
            case R.id.btn_c:
                Intent intent1 = new Intent(this,Favorite.class);
                intent1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent1.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent1);


                break;
            case R.id.btn_d:
                Intent intent2 = new Intent(this,Web.class);
                intent2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent2.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent2);

                break;
            case R.id.btn_e:
                Intent lv = new Intent(this,Setting.class);
                lv.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                lv.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(lv);

                break;
            default:
                break;

        }

    }


}