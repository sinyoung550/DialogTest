package com.example.parksinyoung.dalogtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butDialog = (Button)findViewById(R.id.but_dialog);
        butDialog.setOnClickListener(this);  //감시자  / 현재클래스의 객체 --> this
    }

    @Override
    public void onClick(View v) { //메소드 구현

    }
}
