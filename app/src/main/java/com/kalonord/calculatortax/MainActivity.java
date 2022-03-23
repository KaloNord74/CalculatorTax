package com.kalonord.calculatortax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int numberField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cancelButton = (Button) findViewById(R.id.cancelButton);
        Button okButton = (Button) findViewById(R.id.okButton);
        EditText editIncome = (EditText) findViewById(R.id.editIncome);
        TextView ndfl = (TextView) findViewById(R.id.ndfl);
        TextView oms = (TextView) findViewById(R.id.oms);
        TextView pension = (TextView) findViewById(R.id.pension);
        TextView social = (TextView) findViewById(R.id.social);
        TextView zp = (TextView) findViewById(R.id.zp);

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editIncome.setText(null);
            }
        });

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField = Integer.parseInt(editIncome.getText().toString());
                ndfl.setText("Ваш подоходный налог: " + numberField / 100 * 13);
                oms.setText("Ваши отчисления на медицинское страхование: " + numberField / 100 * 5.1);
                pension.setText("Ваши отчисления на пенсионное страхование: " + numberField / 100 * 22);
                social.setText("Ваши отчисления на обязательное социальное страхование в случае временной нетрудоспособности и в связи с материнством: " + numberField / 100 * 2.9);
                zp.setText("Ваша заработная плата после всех вычетов: " + (numberField - ((numberField / 100 * 13) + (numberField / 100 * 5.1) + (numberField / 100 * 22))));
            }
        });


    }
}