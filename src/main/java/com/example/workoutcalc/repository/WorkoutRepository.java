package com.example.workoutcalc.repository;

import com.example.workoutcalc.model.UserWorkout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface WorkoutRepository extends JpaRepository<UserWorkout,Integer> {

}
