package com.epam.mentoring.globoforce.calculator.test;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;

public class SetUpTest {
    Calculator calculator;

    @BeforeClass
    public void createCalculator(){
        calculator = new Calculator();
        //return calculator;
    }
}
