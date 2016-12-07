package com.example.jo.demoproject01;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by ks-1228 on 16. 11. 28.
 */

public class Loading extends AppCompatActivity {
    public SharedPreferences setting;
    public SharedPreferences.Editor editor;
    Button yes, no, productBotton;
    EditText productKey;
    View view;
    private final static int countinit = 1;
    private final static int countYes = 2;
    private final static int countNo = 3;
    private final static int countProduct = 4;

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading);

        imageView = (ImageView)findViewById(R.id.imageView);
        productKey = (EditText)findViewById(R.id.editText2);
        productBotton = (Button)findViewById(R.id.productKeyEnter);
        yes = (Button) findViewById(R.id.yesButton);
        no = (Button) findViewById(R.id.noButton);

        setting = getSharedPreferences("pref", MODE_PRIVATE);
        int count = setting.getInt("count", countinit);
        if (count == countinit) {
            yes.setOnClickListener(yesClickListener);
            no.setOnClickListener(noClickListener);
            productBotton.setOnClickListener(productClickListener);

        } else {
            productKey.setVisibility(view.GONE);
            productBotton.setVisibility(view.GONE);
            yes.setVisibility(view.GONE);
            no.setVisibility(view.GONE);
            if(count == countYes){
                Thread welcomThread = new Thread() {
                    @Override
                    public void run() {
                        try {
                            super.run();
                            sleep(1300);

                        } catch (Exception e) {

                        } finally {
                            Intent i = new Intent(Loading.this, Recipe.class);
                            startActivity(i);

                            finish();
                        }
                    }
                };
                welcomThread.start();
            }else if(count == countNo){
                Thread welcomThread = new Thread() {
                    @Override
                    public void run() {
                        try {
                            super.run();
                            sleep(1300);

                        } catch (Exception e) {

                        } finally {
                            Intent i = new Intent(Loading.this, MainActivity.class);
                            startActivity(i);
                            finish();
                        }
                    }
                };
                welcomThread.start();
            }
        }

        editor = setting.edit();
        editor.putInt("count", count);
        editor.commit();

    }

    Button.OnClickListener yesClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            editor = setting.edit();
            editor.putInt("count", countYes);
            editor.commit();
            Intent intent = new Intent(Loading.this, Recipe.class);
            startActivity(intent);
        }
    };
    Button.OnClickListener noClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            editor = setting.edit();
            editor.putInt("count", countNo);
            editor.commit();
            Intent intent = new Intent(Loading.this, MainActivity.class);
            startActivity(intent);
        }
    };
    Button.OnClickListener productClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            String sh= productKey.getText().toString();
            editor = setting.edit();
            editor.putString("count", sh);
            editor.commit();
        }
    };



}
