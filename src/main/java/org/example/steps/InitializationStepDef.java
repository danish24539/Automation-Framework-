package org.example.steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class InitializationStepDef extends BaseClass{

    @Before
    public void methpod1(){
        System.out.println("before method1");
//        demo();
        BrowserInitiation();


    }

//    @Test
//    public void demo(){
//
//        System.out.println("inside test method");
//
//    }

//    @BeforeStep
//    public void Beforestep(){
//        System.out.println("before step ");
//    }

    @After
    public void method2(){
//        driver.close();
        System.out.println("After method");

    }


}
