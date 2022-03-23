package com.kalonord.calculatortax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private int numberField;
    private int ndfl;
    private int oms;
    private int pension;
    private int social;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cancelButton = (Button) findViewById(R.id.cancelButton);
        Button okButton = (Button) findViewById(R.id.okButton);
        EditText editIncome = (EditText) findViewById(R.id.editIncome);

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editIncome.setText(null);
            }
        });

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}