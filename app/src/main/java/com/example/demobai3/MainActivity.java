package com.example.demobai3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Khai báo các control
        textView = findViewById(R.id.textView);
        Button buttonHello = findViewById(R.id.buttonHello);
        Button buttonGoodbye = findViewById(R.id.buttonGoodbye);
        Button buttonReset = findViewById(R.id.buttonReset);

        // Sự kiện nút "Chào"
        buttonHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Xin chào!");
            }
        });

        // Sự kiện nút "Tạm biệt"
        buttonGoodbye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Hẹn gặp lại!");
            }
        });

        // Sự kiện nút "Reset"
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
            }
        });
    }
}
