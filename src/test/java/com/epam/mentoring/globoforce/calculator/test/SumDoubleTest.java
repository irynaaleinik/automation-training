package com.epam.mentoring.globoforce.calculator.test;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
All tests in the class contains hardcoded value and verify sum of two double variables
 */
public class SumDoubleTest extends SetUpTest {

    @Test(groups = "Smoke")
    public void sumPositiveDouble(){
        Assert.assertEquals(super.calculator.sum(2.09, 0.15), 2.24, 0.01, "Sum of 2.09 and 0.15 with delta=0.01 is incorrect");
    }

    @Test(groups = "Smoke")
    public void sumNegativeDouble(){
        Assert.assertEquals(super.calculator.sum(-12.09, -0.15), -12.24, 0.01, "Sum of -12.09 and -0.15 with delta=0.01 is incorrect");
    }

    @Test(groups = "Smoke")
    public void sumPositiveDoubleWithInt(){
        Assert.assertEquals(super.calculator.sum(2, 15), 17, "Sum of 2 and 15 is incorrect");
    }

    @Test(groups = "Extended")
    public void sumPositiveDoubleWithBigNumber(){
        Assert.assertEquals(super.calculator.sum(212354687987.0999, 1545678987854.4568), 1758033675841.556, 0.01,"Sum of 212354687987.0999 and 1545678987854.4568 is incorrect");
    }




}
