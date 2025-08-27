package com.calculatorapi.calculatorapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Calculator {

    private String firstValue;
    private String secondValue;
    private String result;
    private String operation;
}
