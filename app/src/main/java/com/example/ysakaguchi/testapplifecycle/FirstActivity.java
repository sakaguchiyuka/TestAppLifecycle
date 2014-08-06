package com.example.ysakaguchi.testapplifecycle;

import android.content.Intent;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class FirstActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        ButterKnife.inject(this);
    }

    @OnClick(R.id.start_second_btn)
    protected void onClickStartSecondBtn() {
        startActivity(new Intent(getApplicationContext(), SecondActivity.class));
    }

}
