package com.example.text8;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.text8.R;

public class MainActivity extends AppCompatActivity {


    private static final String TAG="MainActivity";
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate()");

        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                // Get the layout inflater
                LayoutInflater inflater = getLayoutInflater();//LayoutInflater是用来找layout文件夹下的xml布局文件，并且实例化
                final View longinDialogView = inflater.inflate(R.layout.login_dialog, null);//把login_dialog中的控件定义在View中 

                builder.setView(inflater.inflate(R.layout.login_dialog, null))
                        .setTitle("Login")
                        // Add action buttons
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // login
                                final EditText etUserName = (EditText)longinDialogView.findViewById(R.id.editTextUserId);
                                final EditText etPassword = (EditText)longinDialogView.findViewById(R.id.editTextPwd);
                                String userName = etUserName.getText().toString().trim();
                                String password = etPassword.getText().toString().trim();
                                if(userName.equals("a") && password.equals("a")){
                                    Toast.makeText(MainActivity.this, "登陆成功", Toast.LENGTH_SHORT).show();

                                }else{
                                    Toast.makeText(MainActivity.this, "错误", Toast.LENGTH_SHORT).show();
                                }
                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                //cancel
                            }
                        });
                builder.show();
            }
        });



        Button b1 = (Button)this.findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("你点击了BUTTON1");
                builder.setTitle("提示");
                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int which){
                        Toast.makeText(MainActivity.this,"点击确定",Toast.LENGTH_LONG).show();
                    }
                });
                builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int which){
                        Toast.makeText(MainActivity.this,"点击取消",Toast.LENGTH_LONG).show();
                    }
                });
                builder.setNeutralButton("忽略", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int which){
                        Toast.makeText(MainActivity.this,"点击忽略",Toast.LENGTH_LONG).show();
                    }
                });
                builder.show();
            }

        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onDestroy()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onDestroy()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onDestroy()");
    }
}
