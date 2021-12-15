package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/")
    public Employee index() {
        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("123123123");
        Employee employee = ImmutableEmployee.builder().name("Vikram").phoneNos(phoneNumbers).build();
        System.out.println(employee);
        return employee;
    }

}
