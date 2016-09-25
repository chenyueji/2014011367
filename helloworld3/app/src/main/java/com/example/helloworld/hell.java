package com.example.helloworld;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class hell extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hell);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnOne = (Button) findViewById(R.id.buttonOk);
        Button btnOne1 = (Button) findViewById(R.id.buttonCancel);

        final EditText txtResult = (EditText) findViewById(R.id.editext);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText( "OK");
            }
        });
        final TextView txtResult1=(TextView)findViewById(R.id.textViewUserId);
        btnOne1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText("CANCEL" );
            }
        });
        }

    public void onCheckboxClicked(View view){
        final TextView txtResult = (TextView) findViewById(R.id.textViewUserId);
        boolean checked = ((CheckBox)view).isChecked();

        switch (view.getId()){
            case R.id.checkBoxC:
                if(checked){
                    txtResult.setText("你选择了C语言" );}
                else{Toast.makeText(this,"不选C语言",Toast.LENGTH_LONG).show();}
                break;
            case R.id.checkBoxJava:
                if(checked){
                txtResult.setText("你选择JAVA" );}
                else{Toast.makeText(this,"不选JAVA",Toast.LENGTH_LONG).show();}
                break;
        }
    }
     public void onRadioButtonClicked(View view){
         final TextView texResult = (TextView) findViewById(R.id.textViewUserId);
         boolean checked = ((RadioButton)view).isChecked();
         TextView text= (TextView)findViewById(R.id .textViewUserId);
         switch (view.getId()){
             case R.id.radioButtonMale:
                if(checked){
                    text.setText("男");
                }break;
             case R.id.radioButtonFemale:
                 if(checked){
                     text.setText("女");
                 }break;

         }
     }
}
