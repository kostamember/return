package com.example.jo.demoproject01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by jo on 16. 11. 28.
 */

public class Recipe extends AppCompatActivity {


    Button btn[] = new Button[5];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe);




        btn[0] = (Button)findViewById(R.id.btn_a);
        btn[1] = (Button)findViewById(R.id.btn_b);
        btn[2] = (Button)findViewById(R.id.btn_c);
        btn[3] = (Button)findViewById(R.id.btn_d);
        btn[4] = (Button)findViewById(R.id.btn_e);



    }


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

