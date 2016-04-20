package com.example.vincent.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by vincent on 16/4/19.
 */
public class SecondView extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        Intent intent = getIntent();
        UserBean bean = (UserBean) intent.getSerializableExtra("user");
        textView.setText(bean.getPassword()+bean.getUsername());
        setContentView(textView);
//        setResult();
//        finish();
//        ArrayAdapter<String>

//                ListView   列表页面进入详情页查看
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
