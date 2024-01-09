package com.example.workoutcalc.service;


import com.example.workoutcalc.dto.UserWorkoutdto;
import com.example.workoutcalc.model.UserWorkout;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface Workoutservice   {


public List<UserWorkoutdto> saveWorkout();

String add(UserWorkout userWorkout);

List<UserWorkout> getAll();


}
