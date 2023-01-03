package com.example.myfirstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView usernmae,password,emailid;
    Button btn,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernmae=findViewById(R.id.username);
        password=findViewById(R.id.password);
        emailid=findViewById(R.id.emailid);
        btn2=findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"welcome",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,regActivity.class);
                startActivity(intent);

            }
        });
    }
}