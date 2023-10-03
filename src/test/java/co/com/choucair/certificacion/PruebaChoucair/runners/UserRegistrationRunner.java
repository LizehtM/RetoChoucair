package co.com.choucair.certificacion.PruebaChoucair.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/user_registration.feature",
        glue = "co.com.choucair.certificacion.PruebaChoucair.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = ""
)

public class UserRegistrationRunner {
}
