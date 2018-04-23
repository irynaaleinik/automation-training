package com.epam.mentoring.globoforce.calculator.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DivLongTest extends SetUpTest{

    @Test(dataProvider = "dataProviderForDivLong", groups = "Smoke")
    public void divLongTest(long a, long b, long result) {
        Assert.assertEquals(calculator.div(a, b), result, "Result is incorrect");
    }

    @DataProvider(name = "dataProviderForDivLong")
    public Object[][] dataProvider() {
        return new Object[][]{
                {550, 5, 110},
                {-550, 2, -275},
                {150, 150, 1},
                {-648, -4, 162}};
    }

    @Test(expectedExceptions = NumberFormatException.class)
    @Parameters({"a", "b"})
    public void divLongTestException (long a, long b) {
        calculator.div(a, b);
    }

}
