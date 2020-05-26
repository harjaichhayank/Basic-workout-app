package com.example.myworkout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class WorkOutActivity extends Activity {

    private WorkOut expert = new WorkOut();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.Button);

        btn.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView textView = findViewById(R.id.text);
                        Spinner textInSpinner = findViewById(R.id.Spinner);
                        //textView.setText(String.valueOf(textInSpinner.getSelectedItem()));

                        List <String> workoutList = expert.getWorkouts(String.valueOf(textInSpinner.getSelectedItem()));
                        StringBuilder sb = new StringBuilder();

                        for(String work : workoutList){
                            sb.append(work).append('\n');
                        }
                        textView.setText(sb);
                    }
                }
        );
    }
}
