package com.example.administrator.mobileguard.m2theftguard;

import android.os.Bundle;
import android.widget.RadioButton;

import android.widget.Toast;

import com.example.administrator.mobileguard.R;


public class SetUp1Activity extends BaseSetUpActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_up1);
        initView();
    }

    private void initView() {
        ((RadioButton)findViewById(R.id.rb_first)).setChecked(true);
    }
    @Override
    public void showNext(){
        startActivityAndFinishShelf(SetUp2Activity.class);
    }

    @Override
    public void showPre(){
        Toast.makeText(this,"当前页面已经是第一页", Toast.LENGTH_SHORT).show();
    }
}
