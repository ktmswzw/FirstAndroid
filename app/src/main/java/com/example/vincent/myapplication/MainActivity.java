package com.example.vincent.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText name,password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.name);
        password = (EditText) findViewById(R.id.passwords);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login://
                String username = name.getText().toString();
                System.out.println("name = " + username);
                String pass = password.getText().toString();
                Toast.makeText(this,username+"---"+pass,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this,SecondView.class);
                UserBean userBean = new UserBean();
                userBean.setUsername(username);
                userBean.setPassword(pass);
                intent.putExtra("user", userBean);
//                Bundle bundle = new Bundle();
//                bundle.putSerializable("user",userBean);
                startActivity(intent);
                break;
            case R.id.register:
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
