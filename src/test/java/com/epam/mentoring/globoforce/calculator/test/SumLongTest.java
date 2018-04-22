package com.epam.mentoring.globoforce.calculator.test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumLongTest extends SetUpTest {

    @Test(groups = "Smoke")
    @Parameters({"a","b","result"})
    public void sumParamDoubleTest(long a, long b, long result){
        Assert.assertEquals(super.calculator.sum(a, b), result, "Sum is incorrect");
    }
}
