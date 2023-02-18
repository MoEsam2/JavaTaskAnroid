package com.example.javatask1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    Button startButtonView;
    ImageView imageView;
    TextView firstTextView;
    EditText editTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startButtonView =(Button) findViewById(R.id.startButtonView);
        imageView=(ImageView)findViewById(R.id.imageView);
        firstTextView=(TextView) findViewById(R.id.firstTextView);
        editTextView=(EditText) findViewById(R.id.editTextView);
        startButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstTextView.setText(editTextView.getText().toString());
                if(Character.isUpperCase((editTextView.getText().toString().charAt(0))))
                {

                  imageView.setImageDrawable(getDrawable(R.drawable.unnamed));
                }
                else
                {

                  imageView.setImageDrawable(getDrawable(R.drawable.sky));
                }
            }
        });

    }
}