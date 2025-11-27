package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

/*
    In this class we will be able to create "pre" and "post" condition for ALL
    of the scenarios and steps as well

     */

public class Hooks {

    //import the @Before coming from io.cucumber.java
    @Before("@login")
    public void setupMethod(){
        System.out.println("---->@Before : RUNNING BEFORE EACH SCENARIO");

    }

    @After
    public void tearDownMethod(){
        System.out.println("--->@After: RUNNING AFTER EACH SCENARIO");
        Driver.closeDriver();

    }

    @BeforeStep
    public void setupStep(){
        System.out.println("-----@BeforeStep : Running before each step");
    }

    @AfterStep
    public void tearDownStep(){
        System.out.println("-----@AfterStep : Running after each step");
    }
}
