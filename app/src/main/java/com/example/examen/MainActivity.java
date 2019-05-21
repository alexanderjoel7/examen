package com.example.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btncelfa,btncelke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btncelfa=(Button)findViewById(R.id.btncelfa);


        btncelfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncelfa =new Intent(MainActivity.this,Main2Activity.class);
                startActivity(btncelfa);

            }
        });
    }
}
