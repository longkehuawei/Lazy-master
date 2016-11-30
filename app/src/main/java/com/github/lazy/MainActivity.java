package com.github.lazy;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.lazylibrary.util.DialogUtils;
import com.github.lazylibrary.util.FastBlur;

public class MainActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView helloText= (TextView) findViewById(R.id.helloText);
        final ImageView img= (ImageView) findViewById(R.id.img);
        Bitmap bm=BitmapFactory.decodeResource(getResources(),R.mipmap.ganai_icon);
        img.setImageBitmap(bm);
        helloText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogUtils.showPrompt(MainActivity.this,"nihaoma...","确定");
                Bitmap bm=BitmapFactory.decodeResource(getResources(),R.mipmap.ganai_icon);
                img.setImageBitmap(FastBlur.doBlur(bm,5,false));
            }
        });

    }
}
