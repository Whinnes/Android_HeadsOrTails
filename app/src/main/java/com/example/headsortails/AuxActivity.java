package com.example.headsortails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AuxActivity extends AppCompatActivity {

    private Button buttonBack;
    private ImageView imageResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aux);

        buttonBack = findViewById(R.id.buttonBack);
        imageResult = findViewById(R.id.imageResult);


        Bundle data = getIntent().getExtras();
        int number = data.getInt("number");

        if (number == 0){
            imageResult.setImageResource(R.drawable.head_coin);
        }else{
            imageResult.setImageResource(R.drawable.tail_coin);
        }

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
