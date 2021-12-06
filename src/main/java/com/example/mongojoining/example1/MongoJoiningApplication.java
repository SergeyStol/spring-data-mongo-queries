package com.example.mongojoining.example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class MongoJoiningApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoJoiningApplication.class, args);
    }

    @Autowired
    EmployeesRepository repo;

    @Bean
    CommandLineRunner run() {
        return (arg) -> {
            repo.deleteAll();
            repo.save(new EmployeeDao(1L, List.of("Str1", "Str2", "Str3"), "name1"));
            repo.save(new EmployeeDao(2L, List.of("Str11", "Str22", "Str33"), "name2"));
            repo.save(new EmployeeDao(3L, List.of("Str111", "Str222", "Str333"), "name3"));

            List<EmployeeDao> by = repo.findByStringsIn(List.of("Str1", "Str2", "Str22", "Str999"));
            List<EmployeeDao> by3 = repo.findByStringsContains(List.of("Str1", "Str2", "Str22", "Str999"));
            System.out.println("**********************************");
            System.out.println(by);
            System.out.println(by3);

            List<EmployeeDao> by2 = repo.findByStringsContaining(List.of("Str1", "Str2", "Str22", "Str999"));
            System.out.println("**********************************");
            System.out.println(by2);
        };
    }

}
