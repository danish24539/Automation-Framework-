package org.example.steps;

import org.apache.commons.io.FileUtils;
import org.apache.poi.sl.draw.geom.Path;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.Duration;

public class BaseClass {

    public static WebDriver driver;
    public static String a ;


    public void BrowserInitiation(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        a = "danish";
        System.out.println("browsewr initiated successfully");
//        demometh();

    }
    public void demometh(){
        System.out.println(a);
    }

    public void geturl(String url){
        driver.get(url);

    }
    public void click(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        int count = 1;

        while(count<=3){
            try {
                wait.until(ExpectedConditions.elementToBeClickable(element));
                wait.until(ExpectedConditions.visibilityOf(element));


                element.click();
                return;
            } catch (ElementClickInterceptedException e) {
                // Fallback to JavaScript click if intercepted
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
                return;
            } catch (TimeoutException e) {
                System.out.println("Element not clickable after waiting: " + element);
                throw e;
            }catch(StaleElementReferenceException e){
                System.out.println("element is not in dom currently"+element);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            count++;


        }


    }

    public void enterText(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys();
    }

    public void takeScreenshot(String filename) throws IOException {
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("C:\\Users\\DANISH\\IdeaProjects\\AutomationFramework\\target\\Screenshots\\"+filename+".png"));
    }



}
