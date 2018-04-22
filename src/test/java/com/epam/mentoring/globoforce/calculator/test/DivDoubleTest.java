package com.epam.mentoring.globoforce.calculator.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivDoubleTest extends SetUpTest {

    @Test(dataProvider = "dataProviderForDivDouble", groups = "Smoke")
    public void divLongTest(double a, double b, double result) {
        Assert.assertEquals(calculator.div(a, b), result, "Result is incorrect");
    }

    @DataProvider(name = "dataProviderForDivDouble")
    public Object[][] dataProvider() {
        return new Object[][]{
                {550, 4, 137.5},
                {-550, 2, -275},
                {150, 150, 1},
                {-650, -4, 162.5}};
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void divDoubleTestException (){
        calculator.div(150, 0);
    }
}
