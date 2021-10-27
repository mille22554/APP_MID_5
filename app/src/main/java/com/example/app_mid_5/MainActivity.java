package com.example.app_mid_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void but_click(View view){
        EditText edn=(EditText)findViewById(R.id.editTextNumber);
        EditText edn2=(EditText)findViewById(R.id.editTextNumber2);
        EditText edn3=(EditText)findViewById(R.id.editTextNumber3);
        EditText edn4=(EditText)findViewById(R.id.editTextNumber4);
        EditText edn5=(EditText)findViewById(R.id.editTextNumber5);
        EditText edn6=(EditText)findViewById(R.id.editTextNumber6);
        TextView tv=(TextView)findViewById(R.id.textView9);
        TextView tv2=(TextView)findViewById(R.id.textView10);
        tv.setText(""+edn.getText().toString()+"/"+edn2.getText().toString()+"/"+edn3.getText().toString()
                +"  "+edn4.getText().toString()+":"+edn5.getText().toString()+":"+edn6.getText().toString());
        if(Float.parseFloat(edn.getText().toString())%4==0){
            tv2.setText("是閏年");
        }
        else if(Float.parseFloat(edn.getText().toString())%4!=0){
            tv2.setText("不是閏年");
        }
    }
}