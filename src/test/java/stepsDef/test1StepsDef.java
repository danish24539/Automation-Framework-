package stepsDef;
import io.cucumber.java.en.Given;
import org.example.PageObjects.LoginPageObjects;
import org.example.steps.BaseClass;
import org.openqa.selenium.WebDriver;
import pageobjects.Loginpage;

public class test1StepsDef extends BaseClass {
    public test1StepsDef(){
        System.out.println("inside loginstepdef constructor");
        System.out.println(a);
    }


    Loginpage lp = new Loginpage(driver,a);

    @Given("user is on login pages")
    public void user_is_on_login_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("working");

        lp.user_login_flow();
//        search_element();

    }
    public void search_element(){
//        LoginPageObjects lp = new LoginPageObjects(driver);
        lp.GoogleSearch.sendKeys("hello");
        click(lp.GoogleSearch);


    }
}
