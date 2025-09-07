package org.example;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\test1.feature",
//                    tags = "@smoke",
//        glue = "org.example.steps"
        glue = "stepsDef"
                        )
public class ExecuteTest {
//    C:\\Users\\DANISH\\IdeaProjects\\AutomationFramework\\src\\main\\java\\org\\example\\features\\feature2.feature"
}
