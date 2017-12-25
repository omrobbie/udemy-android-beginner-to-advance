package com.omrobbie.workoutadvisor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by omrobbie on 25/12/2017.
 */

public class WorkoutExpert {

    List<String> getWorkouts(String workoutTypes) {
        List<String> workouts = new ArrayList<>();

        switch (workoutTypes) {
            case "Chest":
                workouts.add("Bench Press");
                workouts.add("Cable Flies");
                break;

            case "Triceps":
                workouts.add("Tricep Ext");
                workouts.add("Tricep Push Downs");
                break;

            case "Shoulder":
                workouts.add("Shoulder Press");
                break;

            case "Biceps":
                workouts.add("Bicep Curls");
                break;
        }

        return workouts;
    }
}
