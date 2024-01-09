package com.example.workoutcalc.controller;


import com.example.workoutcalc.model.UserWorkout;
import com.example.workoutcalc.model.*;

import com.example.workoutcalc.repository.SessionRepository;
import com.example.workoutcalc.service.SessService;
import com.example.workoutcalc.service.Workoutservice;


import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/workout")
@CrossOrigin
public class workoutController {


private Workoutservice workoutservice;

private SessionRepository sessionRepository;

private SessService sessService;

    public workoutController(SessionRepository sessionRepository,Workoutservice workoutservice,SessService sessService) {
        this.sessionRepository = sessionRepository;
        this.workoutservice = workoutservice;
        this.sessService = sessService;

    }

//    public workoutController(SessService sessService) {
//        this.sessService = sessService;
//    }

    @GetMapping("/sessions")
    public List<Wsession> listSessions(Wsession wsession) {
   List<Wsession> prevSes = sessService.PrevSession();
   wsession.addAttribute("Sess",prevSes);
   //make a prepared statment

        return prevSes;
    }
    @PostMapping(value = "/add")
    public String add(UserWorkout userWorkout ) {
        //create array for calorie output for daily workouts this is for adding
        List<UserWorkout> newentry = workoutservice.getAll();

        return workoutservice.saveWorkout().toString();
    }

@GetMapping("/getAll")
    public List<UserWorkout> getAll() {
      System.out.println("Get all run");
      return workoutservice.getAll();}

}

