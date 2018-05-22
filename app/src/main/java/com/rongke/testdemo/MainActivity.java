package com.rongke.testdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.rongke.basemodule.BaseActivity;

/**
 * Created by jh352160 on 2018/5/21.
 */
public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().
                add(R.id.frame_layout, UIHelper.getNeedLoadFragment()).commit();
    }

    @Override
    public void jumpToActivity(String url) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("str",url);
        startActivity(intent);
    }

    @Override
    public void initUIHelper() {
        if (uiHelper == null){
            uiHelper = new UIHelper();
        }
    }
}
