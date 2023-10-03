package co.com.choucair.certificacion.PruebaChoucair.stepdefinitions;

import co.com.choucair.certificacion.PruebaChoucair.models.DatesUser;
import co.com.choucair.certificacion.PruebaChoucair.questions.ValidateMessage;
import co.com.choucair.certificacion.PruebaChoucair.tasks.RegisterUser;
import co.com.choucair.certificacion.PruebaChoucair.userinterfaces.RegisterPage;
import co.com.choucair.certificacion.PruebaChoucair.utils.constants.Urls;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class UserRegistrationStepDefinitions {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("actor");

    }

    @Given("The user is on the utest page in the user registration section")
    public void theUserIsOnTheUtestPageInTheUserRegistrationSection() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Urls.uTestUrl));

    }

    @When("enter registration information")
    public void enterRegistrationInformation(DataTable datesUser) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Click.on(RegisterPage.BTN_JOIN_TODAY));

        OnStage.theActorInTheSpotlight().attemptsTo(RegisterUser.registerUser(new DatesUser(datesUser)));

    }

    @Then("registration confirmation message is displayed {string}")
    public void registrationConfirmationMessageIsDisplayed(String message) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateMessage.validateMessage(message)));

    }

}
