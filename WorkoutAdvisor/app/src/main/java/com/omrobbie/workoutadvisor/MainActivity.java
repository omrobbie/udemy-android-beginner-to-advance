package com.omrobbie.workoutadvisor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {

    private WorkoutExpert expert = new WorkoutExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindWorkout(View view) {
        TextView workouts = (TextView) findViewById(R.id.textView);
        Spinner workoutType = (Spinner) findViewById(R.id.workoutType);

        String workout = String.valueOf(workoutType.getSelectedItem());
        // workouts.setText(workout);

        List<String> workoutList = expert.getWorkouts(workout);
        StringBuilder workoutFormatted = new StringBuilder();

        for (String work : workoutList) {
            workoutFormatted
                    .append(work)
                    .append("\n");
        }
        workouts.setText(workoutFormatted);
    }
}
