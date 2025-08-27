package com.calculatorapi.calculatorapi.service;

import com.calculatorapi.calculatorapi.model.Calculator;

public interface CalculatorService {

    public Calculator addition(Calculator calculator);
    public Calculator substraction(Calculator calculator);
    public Calculator multiplication(Calculator calculator);
    public Calculator division(Calculator calculator);
    public Calculator modulo(Calculator calculator);
    
}
