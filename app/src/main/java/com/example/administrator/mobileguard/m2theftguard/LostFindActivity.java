package com.example.administrator.mobileguard.m2theftguard;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.mobileguard.R;

/**
 * Created by Administrator on 2017/10/16 0016.
 */

public class LostFindActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost_find);
        startSetup1Activity();
    }

    private void startSetup1Activity() {
        Intent intent = new Intent(LostFindActivity.this, SetUp1Activity.class);
        startActivity(intent);
        finish();
    }
}
