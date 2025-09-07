package stepsDef;
import io.cucumber.java.en.Given;
import org.example.PageObjects.LoginPageObjects;
import org.openqa.selenium.WebDriver;

public class test1StepsDef {
    @Given("user is on login page")
    public void user_is_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("working");
    }

}
