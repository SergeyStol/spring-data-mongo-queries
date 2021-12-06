package com.example.mongojoining.example2;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AddressesDao {
    @Id
    Long id;
    String city;
    int houseNumber;
}
