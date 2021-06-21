package com.example.expensetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.edit_text);
        Button button = findViewById(R.id.submit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int number_of_people = Integer.parseInt(editText.getText().toString());

                Log.i("Count", String.valueOf(number_of_people));

                Intent intent = new Intent(MainActivity.this,People_name.class);
                intent.putExtra("number_of_people", number_of_people);
                startActivity(intent);


            }
        });
    }


}