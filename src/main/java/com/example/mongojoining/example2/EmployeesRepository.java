package com.example.mongojoining.example2;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EmployeesRepository extends MongoRepository<EmployeeDao, Long> {
    List<EmployeeDao> findByStringsHouseNumberIn(List<Integer> i);
}
