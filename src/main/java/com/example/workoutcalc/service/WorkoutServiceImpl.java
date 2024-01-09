package com.example.workoutcalc.service;

import com.example.workoutcalc.dto.UserWorkoutdto;
import com.example.workoutcalc.model.UserWorkout;
import com.example.workoutcalc.repository.WorkoutRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class WorkoutServiceImpl implements Workoutservice {


 private WorkoutRepository workoutRepository;

@Autowired
    public WorkoutServiceImpl(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }

    @Override
    public List<UserWorkoutdto> saveWorkout() {
        List<UserWorkout> todayworkout = workoutRepository.findAll();
     return todayworkout.stream().map((tw1) -> maptoWorkDto(tw1)).collect(Collectors.toList());
    }


    private UserWorkoutdto maptoWorkDto(UserWorkout userWorkout) {
    // convert to dto for secure data
        UserWorkoutdto userWorkoutdto = UserWorkoutdto.builder()
                .id(userWorkout.getId())
                .calnumb(userWorkout.getCalnumb())
                .WorkoutDuration(userWorkout.getWorkoutDuration())
                .workoutSplit(userWorkout.getWorkoutSplit())
                .workoutStreak(userWorkout.getWorkoutStreak())
                .build();

        return userWorkoutdto;
    }


    @Override
    public String add(UserWorkout userWorkout) {
      return null;
    }

    @Override
    public List<UserWorkout> getAll() {
      return workoutRepository.findAll();
    }
}


