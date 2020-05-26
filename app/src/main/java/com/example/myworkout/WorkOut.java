package com.example.myworkout;

import java.util.ArrayList;
import java.util.List;

public class WorkOut {

    List<String> getWorkouts (String workOutTypes)
    {
        List <String> workout = new ArrayList<>();

        if(workOutTypes.equals("chest")) {
            workout.add("Bench press");
            workout.add("cable fly's");
        }
        else if(workOutTypes.equals("back")){
            workout.add("Lat Pull Downs");
        }
        else if(workOutTypes.equals("biceps")){
            workout.add("Bicep curls");
        }
        else if(workOutTypes.equals("triceps")) {
            workout.add("TriCep Ext");
            workout.add("TriCep PushDowns");
        }
        else if(workOutTypes.equals("legs")){
            workout.add("leg press");
        }
        else if(workOutTypes.equals("abs")){
            workout.add("dragon fly's");
        }
        return workout;
    }
}
