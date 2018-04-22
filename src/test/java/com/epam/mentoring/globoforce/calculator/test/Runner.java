package com.epam.mentoring.globoforce.calculator.test;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main (String[] args){
        TestListenerAdapter tla = new TestListenerAdapter();
        TestNG testng = new TestNG();
        testng.addListener(tla);

        XmlSuite suite = new XmlSuite();
        suite.setName("AllTests");
        List<String> files = new ArrayList<>();
        files.addAll(new ArrayList<String>() {{
            add("./src/test/resources/all_tests.xml");
        }});
        suite.setSuiteFiles(files);
        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);

        testng.setXmlSuites(suites);
        testng.run();
    }
}
