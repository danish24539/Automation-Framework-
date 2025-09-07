package org.example.PageObjects;

import org.example.steps.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Base64;

public class LoginPageObjects extends BaseClass {
    WebDriver driver;

    String a;

    public LoginPageObjects(WebDriver driver,String a) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        System.out.println("inside loginpageobjects constructor");
        System.out.println(a);

    }



    @FindBy(xpath="//textarea[@class='gLFyf']")
    public WebElement GoogleSearch;





}
