package com.epam.mentoring.globoforce.calculator.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubLongTest extends SetUpTest {

    @Test(dataProvider = "dataProviderForSubLong", groups = "Smoke")
    public void subLongTest(long a, long b, long result) {
        Assert.assertEquals(calculator.sub(a, b), result, "Result is incorrect");
    }

    @DataProvider(name = "dataProviderForSubLong")
    public Object[][] dataProvider() {
        return new Object[][]{
                {523, 456, 67},
                {125, 350, -225},
                {150, 150, 0},
                {-30, -2, -28}};
    }

    @Test(groups = "Extended")
    @Parameters({"a", "b", "result"})
    public void subLongTestExtended(long a, long b, long result) {
        Assert.assertEquals(calculator.sub(a, b), result, "Result is incorrect");
    }


}
