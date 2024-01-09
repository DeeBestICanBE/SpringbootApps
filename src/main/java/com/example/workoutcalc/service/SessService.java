package com.example.workoutcalc.service;


import com.example.workoutcalc.model.Wsession;

import java.util.List;

public interface SessService {

     double returntime();

    String workoutsDid();

    List<Wsession> PrevSession();

}
