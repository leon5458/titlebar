package com.hly.titlebar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hly.titlebar.titlebar.OnTitleBarListener;
import com.hly.titlebar.titlebar.TitleBar;

public class MainActivity extends AppCompatActivity {
    private TitleBar tb_main_title_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb_main_title_bar = findViewById(R.id.tb_main_title_bar);
        tb_main_title_bar.setOnTitleBarListener(new OnTitleBarListener() {

            @Override
            public void onLeftClick(View v) {
                Toast.makeText(MainActivity.this, "左项被点击", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTitleClick(View v) {
                Toast.makeText(MainActivity.this, "标题被点击", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onRightClick(View v) {
                Toast.makeText(MainActivity.this, "右项被点击", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
