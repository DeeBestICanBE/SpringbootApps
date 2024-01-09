package com.example.workoutcalc.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserWorkoutdto {
    private int id;

    private int calnumb = 0 ;
    private String workoutSplit = "";

    private int WorkoutDuration = 0;

    private String PostMeal;



    private int workoutStreak;

}
