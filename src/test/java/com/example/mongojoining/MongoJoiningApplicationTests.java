package com.example.mongojoining;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MongoJoiningApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void foo() {
        // <- Str1, Str2, Str22, Str999
        // EmployeeDao employee
        // -> [employee1, employee2]

        // find EmployeeDao where employeeDao.strings.containsOneOf([Str1, Str2, Str22, Str999])
    }
}
