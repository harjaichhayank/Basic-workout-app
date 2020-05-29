package com.example.myworkout;

import java.util.ArrayList;
import java.util.List;

class WorkOut {

    List<String> getWorkouts (String workOutTypes) {
        List <String> workout = new ArrayList<>();

        switch (workOutTypes) {
            case "chest":
                workout.add("Bench press");
                workout.add("cable fly's");
                break;
            case "back":
                workout.add("Lat Pull Downs");
                break;
            case "biceps":
                workout.add("Bicep curls");
                break;
            case "triceps":
                workout.add("TriCep Ext");
                workout.add("TriCep PushDowns");
                break;
            case "legs":
                workout.add("leg press");
                break;
            case "abs":
                workout.add("dragon fly's");
                break;
        }
        return workout;
    }
}
