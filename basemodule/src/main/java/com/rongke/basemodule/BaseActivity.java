package com.rongke.basemodule;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by jh352160 on 2018/5/21.
 */
public abstract class BaseActivity extends AppCompatActivity {
    protected static BaseUIHelper uiHelper;

    public abstract void jumpToActivity(String url);
    public abstract void initUIHelper();

    public BaseUIHelper getUiHelper() { return uiHelper; }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initUIHelper();
    }
}
