package org.example.steps;

import io.cucumber.java.en.Given;
import org.example.PageObjects.LoginPageObjects;
import org.openqa.selenium.WebDriver;

public class LoginSteps extends BaseClass {
    public LoginSteps(){
        System.out.println("inside loginstepdef constructor");
        System.out.println(a);
    }


    LoginPageObjects lp = new LoginPageObjects(driver,a);



//    LoginPageObjects lp;
    @Given("user is on login page")
    public void user_is_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("working");
        geturl("https://www.google.com/");

        search_element();
    }

    public void search_element(){
//        LoginPageObjects lp = new LoginPageObjects(driver);
        lp.GoogleSearch.sendKeys("hello");
        click(lp.GoogleSearch);

    }

}
