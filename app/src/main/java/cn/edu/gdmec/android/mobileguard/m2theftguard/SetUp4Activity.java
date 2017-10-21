package cn.edu.gdmec.android.mobileguard.m2theftguard;

import android.os.Bundle;
import android.widget.RadioButton;

import cn.edu.gdmec.android.mobileguard.R;


public class SetUp4Activity extends BaseSetUpActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_up4);
        ((RadioButton) findViewById(R.id.rb_four)).setChecked(true);

    }

    @Override
    public void showNext() {
        startActivityAndFinishShelf(LostFindActivity.class);
    }

    @Override

    public void showPre() {
        startActivityAndFinishShelf(SetUp3Activity.class);
    }
}