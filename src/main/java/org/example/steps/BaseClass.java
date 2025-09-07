package org.example.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public static WebDriver driver;
    public static String a ;


    public void BrowserInitiation(){
        driver = new ChromeDriver();
        a = "danish";
        System.out.println("browsewr initiated successfully");
        demometh();

    }
    public void demometh(){
        System.out.println(a);
    }

    public void geturl(String url){
        driver.get(url);

    }
    public void click(WebElement element){
        element.click();
    }
}
