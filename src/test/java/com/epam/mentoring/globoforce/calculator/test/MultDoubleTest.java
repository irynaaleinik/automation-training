package com.epam.mentoring.globoforce.calculator.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultDoubleTest extends SetUpTest{

    @Test(dataProvider = "dataProviderForMultDouble", groups = "Smoke")
    public void multDoubleTest(double a, double b, double result) {
        Assert.assertEquals(calculator.mult(a, b), result, "Result is incorrect");
    }

    @DataProvider(name = "dataProviderForMultDouble")
    public Object[][] dataProvider() {
        return new Object[][]{
                {444, 222, 98568},
                {125, -350, -43750},
                {150, 0, 0},
                {-30, -2, 60}};
    }

    @Test(groups = "Extended")
    @Parameters({"a", "b", "result"})
    public void multDoubleTestExtended(double a, double b, double result) {
        Assert.assertEquals(calculator.mult(a, b), result, "Result is incorrect");
    }
}
