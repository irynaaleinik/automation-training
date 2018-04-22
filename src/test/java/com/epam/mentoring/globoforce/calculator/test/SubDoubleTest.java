package com.epam.mentoring.globoforce.calculator.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubDoubleTest extends SetUpTest {

    @Test(dataProvider = "dataProviderForSubDouble", groups = "Smoke")
    public void subDoubleTest(double a, double b, double result) {
        Assert.assertEquals(calculator.sub(a, b), result, "Result is incorrect");
    }

    @DataProvider(name = "dataProviderForSubDouble")
    public Object[][] dataProvider() {
        return new Object[][]{
                {3.5, 2.0, 1.5},
                {2.0, 3.5, -1.5},
                {15.0, 15.0, 0.0},
                {-30.0, -2.2, -27.8}};
    }

    @Test(groups = "Extended")
    @Parameters({"a", "b", "result"})
    public void subDoubleTestExtended(double a, double b, double result) {
        Assert.assertEquals(calculator.sub(a, b), result, "Result is incorrect");
    }
}
