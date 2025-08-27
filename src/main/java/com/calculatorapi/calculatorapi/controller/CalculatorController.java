package com.calculatorapi.calculatorapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calculatorapi.calculatorapi.model.Calculator;
import com.calculatorapi.calculatorapi.service.CalculatorService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/calculator/api")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("/addition")
    public ResponseEntity<Calculator> addition(@RequestBody Calculator calculator) {

        return new ResponseEntity<Calculator>(calculatorService.addition(calculator), HttpStatus.CREATED);
    }

    @PostMapping("/substraction")
    public ResponseEntity<Calculator> subbstraction(@RequestBody Calculator calculator) {

        return new ResponseEntity<Calculator>(calculatorService.substraction(calculator), HttpStatus.CREATED);
    }

    @PostMapping("/multiplication")
    public ResponseEntity<Calculator> multiplication(@RequestBody Calculator calculator) {

        return new ResponseEntity<Calculator>(calculatorService.multiplication(calculator), HttpStatus.CREATED);
    }

    @PostMapping("/division")
    public ResponseEntity<Calculator> division(@RequestBody Calculator calculator) {

        return new ResponseEntity<Calculator>(calculatorService.division(calculator), HttpStatus.CREATED);
    }

    @PostMapping("/modulo")
    public ResponseEntity<Calculator> modulo(@RequestBody Calculator calculator) {

        return new ResponseEntity<Calculator>(calculatorService.modulo(calculator), HttpStatus.CREATED);
    }

}
