package com.example.workoutcalc.controller;


import com.example.workoutcalc.model.UserWorkout;

import com.example.workoutcalc.service.Workoutservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/workout")
@CrossOrigin
public class workoutController {


private final Workoutservice workoutservice;


    public workoutController(Workoutservice workoutservice) {
        this.workoutservice = workoutservice;
    }

    @PostMapping(value = "/add")
    public String add(UserWorkout userWorkout ) {
        //create array for calorie output for daily workouts
        return workoutservice.saveWorkout().toString();


    }

@GetMapping("/getAll")
    public List<UserWorkout> getAll() {
  System.out.println("Get all run");
      return workoutservice.getAll();}

}

