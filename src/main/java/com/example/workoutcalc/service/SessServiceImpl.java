package com.example.workoutcalc.service;

import com.example.workoutcalc.model.Wsession;
import com.example.workoutcalc.repository.SessionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessServiceImpl implements SessService{
    private SessionRepository sessionRepository;


    @Override
    public double returntime() {
        return 0;
    }

    @Override
    public String workoutsDid() {
        return null;
    }

    @Override
    public List<Wsession> PrevSession() {
        return null;
    }
}
