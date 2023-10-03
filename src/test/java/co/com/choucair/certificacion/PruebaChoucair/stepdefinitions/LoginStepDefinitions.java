package co.com.choucair.certificacion.PruebaChoucair.stepdefinitions;
import co.com.choucair.certificacion.PruebaChoucair.models.DatesLogin;
import co.com.choucair.certificacion.PruebaChoucair.questions.ValidateErrorMessage;
import co.com.choucair.certificacion.PruebaChoucair.questions.ValidateMessage;
import co.com.choucair.certificacion.PruebaChoucair.questions.ValidateMessageLogin;
import co.com.choucair.certificacion.PruebaChoucair.tasks.Login;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class LoginStepDefinitions {


    @When("The user is at the login screen and enters his or her credentials")
    public void theUserIsAtTheLoginScreenAndEntersHisOrHerCredentials(DataTable datesLogin) {

        OnStage.theActorInTheSpotlight().attemptsTo(Login.login(new DatesLogin(datesLogin)));

    }
    @Then("The user is logged and watch the message {string}")
    public void theUserIsLoggedAndWatchTheMessage(String message) {

        OnStage.theActorInTheSpotlight().should(seeThat(ValidateMessageLogin.validateMessageLogin(message)));

    }

    @Then("the user cannot log in and displays the message {string}")
    public void theUserCannotLogInAndDisplaysTheMessage(String message) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateErrorMessage.validateErrorMessage(message)));

    }


}
