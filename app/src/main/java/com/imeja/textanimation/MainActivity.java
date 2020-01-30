package com.imeja.textanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.kiprotich.japheth.TextAnim;

public class MainActivity extends AppCompatActivity {

    TextAnim textWriter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textWriter = findViewById(R.id.tw);
        textWriter.setColor(Color.BLACK)
                .setWidth(2)
                .setDelay(40)
                .setSizeFactor(20f)
                .setLetterSpacing(20f)
                .setConfig(TextAnim.Configuration.INTERMEDIATE)
                .setText("KIPROTICH")
                .setListener(new TextAnim.Listener() {
                    @Override
                    public void WritingFinished() {

                        textWriter.setColor(Color.CYAN);
                        textWriter.setWidth(8);
                        //Toast.makeText(MainActivity.this, "boom", Toast.LENGTH_SHORT).show();


                        /*second*/

                    }
                })
                .startAnimation();

    }
}
