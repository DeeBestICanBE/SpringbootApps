package com.example.workoutcalc.model;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.util.List;

@Entity
public class UserWorkout {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

    private int calnumb;
    private String workoutSplit;

    private int WorkoutDuration;

    private String PostMeal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCalnumb() {
        return calnumb;
    }

    public void setCalnumb(int calnumb) {
        this.calnumb = calnumb;
    }

    public String getWorkoutSplit() {
        return workoutSplit;
    }

    public void setWorkoutSplit(String workoutSplit) {
        this.workoutSplit = workoutSplit;
    }

    public int getWorkoutDuration() {
        return WorkoutDuration;
    }

    public void setWorkoutDuration(int workoutDuration) {
        WorkoutDuration = workoutDuration;
    }

    public String getPostMeal() {
        return PostMeal;
    }

    public void setPostMeal(String postMeal) {
        PostMeal = postMeal;
    }

    public int getWorkoutStreak() {
        return workoutStreak;
    }

    public void setWorkoutStreak(int workoutStreak) {
        this.workoutStreak = workoutStreak;
    }

    private int workoutStreak;

}
