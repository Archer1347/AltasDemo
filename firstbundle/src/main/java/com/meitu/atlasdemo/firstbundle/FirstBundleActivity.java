package com.meitu.atlasdemo.firstbundle;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;
import android.widget.Toast;

/**
 * $desc$
 *
 * @author Ljq $date$
 */

public class FirstBundleActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstbundle);
        ((TextView)findViewById(R.id.tv)).setText("这是修复后的bundle这是修复后的bundle这是修复后的bundle这是修复后的bundle这是修复后的bundle这是修复后的bundle这是修复后的bundle这是修复后的bundle这是修复后的bundle这是修复后的bundle这是修复后的bundle这是修复后的bundle这是修复后的bundle这是修复后的bundle这是修复后的bundle这是修复后的bundle这是修复后的bundle这是修复后的bundle这是修复后的bundle这是修复后的bundle这是修复后的bundle这是修复后的bundle这是修复后的bundle");
    }
}
