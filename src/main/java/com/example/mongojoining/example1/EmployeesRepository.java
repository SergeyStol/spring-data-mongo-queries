package com.example.mongojoining.example1;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EmployeesRepository extends MongoRepository<EmployeeDao, Long> {
    List<EmployeeDao> findByStringsIn(List<String> str);
    List<EmployeeDao> findByStringsContains(List<String> str);
    List<EmployeeDao> findByStringsContaining(List<String> str);
}