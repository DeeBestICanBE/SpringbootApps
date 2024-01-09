package com.example.workoutcalc.repository;

import com.example.workoutcalc.model.Wsession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<Wsession,Integer> {

}
