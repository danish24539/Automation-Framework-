package pageobjects;
import org.apache.commons.io.FileUtils;
import org.example.steps.BaseClass;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Set;
import java.io.File;


public class Loginpage extends BaseClass {
    WebDriver driver;

    String a;

    public Loginpage(WebDriver driver,String a) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        System.out.println("inside loginpageobjects constructor");
        System.out.println(a);

    }



    @FindBy(xpath="//textarea[@class='gLFyf']")
    public WebElement GoogleSearch;
    @FindBy(xpath="//h5[text()='Alerts, Frame & Windows']")
    public WebElement AlertsAndWindows;
    @FindBy(xpath="//span[text()='Browser Windows']")
    public WebElement BrowserWindows;
    @FindBy(xpath="//button[text()='New Tab']")
    public WebElement newTab;
    @FindBy(xpath="//label[@class='custom-control-label' and text()='Yes']")
    public WebElement YesRadioButton;
    @FindBy(xpath="//h5[text()='Elements']")
    public WebElement Elements;
    @FindBy(xpath="//div[text()='Elements']")
    public WebElement InnerElement;
    @FindBy(xpath="//span[text()='Radio Button']")
    public WebElement RadioButtonMenu;
    @FindBy(xpath="//span[text()='Alerts']")
    public WebElement Alerts;
    @FindBy(xpath="//button[@id='alertButton']")
    public WebElement AlertButton;
    @FindBy(xpath="//button[@id='timerAlertButton']")
    public WebElement TimeAlertButton;
    @FindBy(xpath="//select[@id='oldSelectMenu']")
    public WebElement oldselectdropdown;
    @FindBy(xpath="//div[text()='Widgets']")
    public WebElement Widgets;
    @FindBy(xpath="//span[text()='Select Menu']")
    public WebElement SelectMenu;
    @FindBy(xpath="(//div[@class=' css-tlfecz-indicatorContainer'])[1]")
    public WebElement newselectmenu;




    public void user_login_flow() throws Throwable {
        System.out.println("inside page object method");
        geturl("https://demoqa.com");
        Thread.sleep(5000);
//        AlertsAndWindows.click();
//        ((JavascriptExecutor)driver).executeScript("document.querySelector(\"h5[text()='Alerts, Frame & Windows']\").click();");
        //window handles practice
//        click(AlertsAndWindows);
//        click(BrowserWindows);
//        click(newTab);
//
//        String handles = driver.getWindowHandle();
//        System.out.println(handles);
//
//        Set<String> windows = driver.getWindowHandles();
//        windows.stream().forEach(System.out::println);
//        List<String> l1 = new ArrayList<>(windows);
//        driver.switchTo().window(l1.get(l1.size()-1));
//        Thread.sleep(2000);
//        String currentwindow = driver.getWindowHandle();
//        System.out.println(currentwindow);
        //---------------------------------------------
        //Alerts

//        click(Alerts);
//        Thread.sleep(2000);
////        AlertButton.click();
//        click(TimeAlertButton);
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());
//
//
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//        alert.dismiss();
//        alert.sendKeys("hello alert");

        //-----------------------------------------------------------------






//-----------------------dropdowns--------------------------------------
//        click(Widgets);
//        click(SelectMenu);
//        click(newselectmenu);
//        Thread.sleep(2000);
//        WebElement option2 = driver.findElement(By.xpath("//div[text()='Group 1, option 2']"));
//        option2.click();
        //        Select value = new Select(newselectmenu);
//        value.selectByVisibleText("Group 1, option 2");
//        List<WebElement> options =value.getOptions();
//        options.stream().forEach(ele->System.out.println(ele.getText()));
//------------------------------------------------------------------

        click(Elements);

        click(RadioButtonMenu);
        Thread.sleep(2000);
        click(YesRadioButton);

        File fl =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(fl,new File("C:\\Users\\DANISH\\IdeaProjects\\AutomationFramework\\target\\Screenshots\\testss.png"));
        click(Widgets);
        click(SelectMenu);
        click(newselectmenu);
//        File fl1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(fl1,new File("C:\\Users\\DANISH\\IdeaProjects\\AutomationFramework\\target\\Screenshots\\tests1.png"));
        takeScreenshot("newfile");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'css-11')]//div[contains(@class,'option')]")));
        List<WebElement> l6 = driver.findElements(By.xpath("//div[contains(@class,'css-11')]//div[contains(@class,'option')]"));;
        System.out.println(l6.size());
        for(int i=0;i<l6.size();i++){
            System.out.println(l6.get(i).getText());
        }

//        ((JavascriptExecutor) driver).executeScript("document.querySelector(\"label[for='yesRadio']\").click();");
//
//
//       click(YesRadioButton);
//        System.out.println(YesRadioButton.isSelected());











    }

}
