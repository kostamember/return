package com.example.jo.demoproject01;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by jo on 16. 11. 28.
 */

public class Material extends AppCompatActivity {

    EditText editText;
    Button btn[] = new Button[5];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.material);

        editText = (EditText)findViewById(R.id.editText);

        btn[0] = (Button)findViewById(R.id.btn_a);
        btn[1] = (Button)findViewById(R.id.btn_b);
        btn[2] = (Button)findViewById(R.id.btn_c);
        btn[3] = (Button)findViewById(R.id.btn_d);
        btn[4] = (Button)findViewById(R.id.btn_e);

        //Button button = (Button) findViewById(R.id.button);
        //button.setOnClickListener(new View.OnClickListener() {
          //  @Override
           // public void onClick(View view) {
                /*editText.getText().toString();
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, editText.getText().toString()); // query contains search string
                startActivity(intent);*/

            //}
        //});
        ImageView img = (ImageView)findViewById(R.id.vegetable);
        Bitmap jayPic = BitmapFactory.decodeResource(getResources(),R.drawable.special);
        Bitmap resized = Bitmap.createScaledBitmap(jayPic,200,200,true);
        img.setImageBitmap(resized);
        img.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        img.setPadding(3,3,3,3);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Material.this, MaterialSub.class);
                startActivity(intent2);
                intent2.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

            }
        });

        ImageView img2 = (ImageView)findViewById(R.id.milk);
        Bitmap jayPic2 = BitmapFactory.decodeResource(getResources(),R.drawable.special02);
        Bitmap resized2 = Bitmap.createScaledBitmap(jayPic2,200,200,true);
        img2.setImageBitmap(resized2);
        img2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        img2.setPadding(3,3,3,3);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Material.this, MaterialSub.class);
                startActivity(intent2);
                intent2.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

            }
        });

        ImageView img3 = (ImageView)findViewById(R.id.meat);
        Bitmap jayPic3 = BitmapFactory.decodeResource(getResources(),R.drawable.special04);
        Bitmap resized3 = Bitmap.createScaledBitmap(jayPic3,200,200,true);
        img3.setImageBitmap(resized3);
        img3.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        img3.setPadding(3,3,3,3);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Material.this, MaterialSub.class);
                startActivity(intent2);
                intent2.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

            }
        });

        ImageView img4 = (ImageView)findViewById(R.id.fruit);
        Bitmap jayPic4 = BitmapFactory.decodeResource(getResources(),R.drawable.special03);
        Bitmap resized4 = Bitmap.createScaledBitmap(jayPic4,200,200,true);
        img4.setImageBitmap(resized4);
        img4.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        img4.setPadding(3,3,3,3);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Material.this, MaterialSub.class);
                startActivity(intent2);
                intent2.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            }
        });









        Button button = (Button) findViewById(R.id.button);

        //EditText editText = (EditText) findViewById(R.id.editText);

    }
    public void onClick(View view){


        switch(view.getId()){
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

