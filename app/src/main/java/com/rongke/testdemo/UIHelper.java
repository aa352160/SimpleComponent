package com.rongke.testdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.rongke.basemodule.BaseUIHelper;
import com.rongke.module1.TestFragment;
import com.rongke.module2.Test2Fragment;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by jh352160 on 2018/5/21.
 */
public class UIHelper implements BaseUIHelper{
    private static Queue<Fragment> fragmentQueue = new LinkedList<>();

    @Override
    public void gotoModule2(Context context,String msg) {
        Intent intent = new Intent(context,MainActivity.class);
        Bundle bundle=new Bundle();
        bundle.putString("msg",msg);
        setNeedLoadFragment(Test2Fragment.newInstance(bundle));
        context.startActivity(intent);
    }

    @Override
    public void gotoModule1(Context context) {
        Intent intent = new Intent(context,MainActivity.class);
        Bundle bundle=new Bundle();
        setNeedLoadFragment(TestFragment.newInstance(bundle));
        context.startActivity(intent);
    }

    public synchronized static void setNeedLoadFragment(Fragment needLoadFragment) {
        fragmentQueue.offer(needLoadFragment);
    }

    public synchronized static Fragment getNeedLoadFragment() {
        return fragmentQueue.poll();
    }
}
