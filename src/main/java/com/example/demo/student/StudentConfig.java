//package com.example.demo.student;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.List;
//
//@Configuration
//public class StudentConfig {
//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository repository) {
//        return args -> {
//            Student Peter = new Student(
//                    "peter",
//                    LocalDate.of(1997, Month.FEBRUARY,9),
//                    "wang5959@umn.edu"
//            );
//
//            Student Skye = new Student(
//                    "skye",
//                    LocalDate.of(1996, Month.DECEMBER,8),
//                    "gagno080@umn.edu"
//            );
//
//            repository.saveAll(
//                    List.of(Peter, Skye)
//            );
//        };
//    }
//}
