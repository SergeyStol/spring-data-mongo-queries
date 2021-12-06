package com.example.mongojoining.example1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeDao {
    @Id
    Long id;
    List<String> strings;
    String name;
}