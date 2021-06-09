package com.sevak;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    String surName;
    List<String> PhoneNumbers;
    Car car;
}
