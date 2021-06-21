package com.example.expensetracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class People_name extends AppCompatActivity {

    int childcount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people_name);

        Intent intent = getIntent();

        int people_count = intent.getIntExtra("number_of_people",0);

        LinearLayout linearLayout = findViewById(R.id.linear);

        //Toast.makeText(People_name.this,people_count,Toast.LENGTH_LONG).show();

        //Log.i("CountP", String.valueOf(people_count));


        for(int i = 0; i < people_count; i++)
        {

            /*if(i==2){

                Log.i("hhhh", String.valueOf(i));

                final View view1 = getLayoutInflater().inflate(R.layout.button_runtime,null,false);
                linearLayout.addView(view1);

            }*/
            Log.i("gggg", String.valueOf(people_count));
            final View view = getLayoutInflater().inflate(R.layout.people_edittext,null,false);
            EditText editText = view.findViewById(R.id.edit_text_people);
            linearLayout.addView(view);


        }

    }
}