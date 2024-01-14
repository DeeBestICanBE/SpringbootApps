package com.example.workoutcalc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import java.sql.SQLException;

@SpringBootApplication

public class WorkoutCalcApplication {
    public static void main(String[] args) throws SQLException {

//        Connection con = DBUtil.getConnection();
//
//        if (con != null) {
//            System.out.println("Database connected");
//        }

        SpringApplication.run(WorkoutCalcApplication.class, args);
    }

}
