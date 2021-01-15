package com.example.multlipages;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.provider.CalendarContract;
import android.view.View;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numbers = (TextView)findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view)
            {
                Intent numbersIntent = new Intent(MainActivity.this,Numbers.class);
                startActivity(numbersIntent);
            }
        });
        TextView family = (TextView)findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view)
            {
                Intent numbersIntent = new Intent(MainActivity.this,Family_Members.class);
                startActivity(numbersIntent);
            }
        });
        TextView phrase = (TextView)findViewById(R.id.phrases);
        phrase.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view)
            {
                Intent numbersIntent = new Intent(MainActivity.this,Phrases.class);
                startActivity(numbersIntent);
            }
        });
        TextView color = (TextView)findViewById(R.id.colors);
        color.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view)
            {
                Intent numbersIntent = new Intent(MainActivity.this,colors.class);
                startActivity(numbersIntent);
            }
        });
        TextView fruits = (TextView)findViewById(R.id.fruits);
        fruits.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view)
            {
                Intent numbersIntent = new Intent(MainActivity.this,Fruits.class);
                startActivity(numbersIntent);
            }
        });
        TextView months = (TextView)findViewById(R.id.months);
        months.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view)
            {
                Intent numbersIntent = new Intent(MainActivity.this,Months.class);
                startActivity(numbersIntent);
            }
        });
    }

} 