package com.example.thefivetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int age = intent.getIntExtra("age",0);
        TextView textView = findViewById(R.id.content);
        textView.setText(name+age);

        Button turnTo = findViewById(R.id.turnTo);
        turnTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(secondActivity.this,MainActivity.class);
                intent1.putExtra("ok","ok");
                setResult(1001,intent1);
//                startActivity(intent1);
                finish();
            }
        });

    }
}
