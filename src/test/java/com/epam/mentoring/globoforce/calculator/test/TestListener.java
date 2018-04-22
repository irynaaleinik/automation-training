package com.epam.mentoring.globoforce.calculator.test;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class TestListener implements IInvokedMethodListener{

    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("method started: " + method.getTestMethod().getMethodName());
    }

    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("method finished [" + testResult.getStatus() + "]: " +
            method.getTestMethod().getMethodName() + "\n");
    }

}
