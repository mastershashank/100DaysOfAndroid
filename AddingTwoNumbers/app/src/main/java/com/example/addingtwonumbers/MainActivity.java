package com.example.addingtwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     EditText mEditText1;
     EditText mEditText2;
     TextView mAddResult;
     Button mButtonAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText1 = findViewById(R.id.edittext1);
        mEditText2 = findViewById(R.id.edittext2);
        mAddResult = findViewById(R.id.result);
        mButtonAdd = findViewById(R.id.btn);

        mButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mEditText1.getText().toString().length() == 0) {
                    mEditText1.setText("0");
                }
                if(mEditText2.getText().toString().length() == 0) {
                    mEditText2.setText("0");
                }
                double num1 = Double.parseDouble(mEditText1.getText().toString());
                double num2 = Double.parseDouble(mEditText2.getText().toString());

                double sum = num1 + num2;

                mAddResult.setText(String.valueOf(sum));

            }
        });





    }
}