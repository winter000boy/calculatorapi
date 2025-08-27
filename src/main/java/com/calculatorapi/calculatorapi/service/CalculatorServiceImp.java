package com.calculatorapi.calculatorapi.service;

import org.springframework.stereotype.Service;

import com.calculatorapi.calculatorapi.model.Calculator;
import com.calculatorapi.calculatorapi.model.Constants;

@Service
public class CalculatorServiceImp implements CalculatorService {

    @Override
    public Calculator addition(Calculator calculator) {
        int fv = Integer.parseInt(calculator.getFirstValue());
        int sv = Integer.parseInt(calculator.getSecondValue());
        int result = fv + sv;
        return new Calculator(calculator.getFirstValue(), calculator.getSecondValue(), String.valueOf(result),
                Constants.ADD);

    }

    @Override
    public Calculator substraction(Calculator calculator) {
        int fv = Integer.parseInt(calculator.getFirstValue());
        int sv = Integer.parseInt(calculator.getSecondValue());
        int result = fv - sv;
        return new Calculator(calculator.getFirstValue(), calculator.getSecondValue(), String.valueOf(result),
                Constants.SUB);
    }

    @Override
    public Calculator multiplication(Calculator calculator) {
        int fv = Integer.parseInt(calculator.getFirstValue());
        int sv = Integer.parseInt(calculator.getSecondValue());
        int result = fv * sv;
        return new Calculator(calculator.getFirstValue(), calculator.getSecondValue(), String.valueOf(result),
                Constants.MUL);
    }

    @Override
    public Calculator division(Calculator calculator) {
        int fv = Integer.parseInt(calculator.getFirstValue());
        int sv = Integer.parseInt(calculator.getSecondValue());
        int result = sv != 0 ? fv / sv : 0;
        return new Calculator(calculator.getFirstValue(), calculator.getSecondValue(), String.valueOf(result),
                Constants.DIV);
    }

    @Override
    public Calculator modulo(Calculator calculator) {
        int fv = Integer.parseInt(calculator.getFirstValue());
        int sv = Integer.parseInt(calculator.getSecondValue());
        int result = fv % sv;
        return new Calculator(calculator.getFirstValue(), calculator.getSecondValue(), String.valueOf(result),Constants.MOD);
    }

}
