package com.example.myflashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    boolean eyeSeen = true;
    boolean choiceSeen = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView flashcardChoice1 = findViewById(R.id.flashcard_choice1);
        TextView flashcardChoice2 = findViewById(R.id.flashcard_choice2);
        TextView flashcardChoice3 = findViewById(R.id.flashcard_choice3);

        ImageView toggleChoice = (ImageView) findViewById(R.id.toggle_choices_visibility);





        flashcardChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flashcardChoice1.setBackgroundColor(getResources().getColor(R.color.red));
                flashcardChoice3.setBackgroundColor(getResources().getColor(R.color.green));
            }
        });
        flashcardChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flashcardChoice2.setBackgroundColor(getResources().getColor(R.color.red));
                flashcardChoice3.setBackgroundColor(getResources().getColor(R.color.green));
            }
        });
        flashcardChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flashcardChoice3.setBackgroundColor(getResources().getColor(R.color.green));
            }
        });



        //Listener
        toggleChoice.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(eyeSeen && choiceSeen) {
                    toggleChoice.setImageResource(R.drawable.cancelledeye);
                    flashcardChoice1.setVisibility(View.VISIBLE);
                    flashcardChoice2.setVisibility(View.VISIBLE);
                    flashcardChoice3.setVisibility(View.VISIBLE);

                    eyeSeen = false;
                    choiceSeen = true;
                }
                else {
                    toggleChoice.setImageResource(R.drawable.eye);
                    flashcardChoice1.setVisibility(View.INVISIBLE);
                    flashcardChoice2.setVisibility(View.INVISIBLE);
                    flashcardChoice3.setVisibility(View.INVISIBLE);

                    eyeSeen = true;
                    choiceSeen = true;
                }


            }
        });



    }

    }

