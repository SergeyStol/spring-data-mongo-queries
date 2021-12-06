package com.example.mongojoining.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Example1 {

    public static void main(String[] args) {
        SpringApplication.run(Example1.class, args);
    }

    @Autowired
    EmployeesRepository repo;

    @Bean
    CommandLineRunner run() {
        return (arg) -> {
            repo.save(new EmployeeDao(1L,
                    List.of(new AddressesDao(1L, "city1", 1),
                            new AddressesDao(11L, "city11", 11)),
                    "name1"));
            repo.save(new EmployeeDao(2L,
                    List.of(new AddressesDao(2L, "city2", 2),
                            new AddressesDao(22L, "city22", 22)),
                    "name2"));
            repo.save(new EmployeeDao(3L,
                    List.of(new AddressesDao(3L, "city3", 3)),
                    "name1"));

            List<EmployeeDao> by = repo.findByStringsHouseNumberIn(List.of(1, 11, 2, 99));
            System.out.println("**********************************");
            System.out.println(by);
//
//            List<EmployeeDao> by2 = repo.findByStringsContaining(List.of("Str1", "Str2", "Str22", "Str999"));
//            System.out.println("**********************************");
//            System.out.println(by2);
        };
    }

}
