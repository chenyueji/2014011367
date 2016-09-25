package com.example.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class hello extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);


        Button btnOne=(Button)findViewById(R.id.buttonOk);
        Button btnOne1=(Button)findViewById(R.id.buttonCancel);
            final TextView txtResult=(TextView)findViewById(R.id.textViewUserId);
            btnOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txtResult.setText(txtResult.getText() + "1");
                }
            });

        btnOne1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText() + "2");
            }
        });
    }
    }

