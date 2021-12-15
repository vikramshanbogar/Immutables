package com.example.springboot;

import java.util.List;
import java.util.Set;
import org.immutables.value.Value;

@Value.Immutable
public interface Employee {
    String getName();
    List<String> getPhoneNos();
}