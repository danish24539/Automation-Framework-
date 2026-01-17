package stepsDef;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.steps.BaseClass;
import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class InitialisationstepDef extends BaseClass {
    @Before
    public void methpod1(){
        System.out.println("before method1");
//        demo();
        BrowserInitiation();


    }
    @Before
    public void ReadExcel(){

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
