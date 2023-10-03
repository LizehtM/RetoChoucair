package co.com.choucair.certificacion.PruebaChoucair.tasks;

import co.com.choucair.certificacion.PruebaChoucair.interactions.SelectDate;
import co.com.choucair.certificacion.PruebaChoucair.models.DatesUser;
import co.com.choucair.certificacion.PruebaChoucair.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.choucair.certificacion.PruebaChoucair.userinterfaces.RegisterPage.*;

public class RegisterUser implements Task {

    private DatesUser datesUser;

    public RegisterUser(DatesUser datesUser) {
        this.datesUser = datesUser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(datesUser.getFirstName()).into(INPUT_FIRST_NAME));
        actor.attemptsTo(Enter.theValue(datesUser.getLastName()).into(INPUT_LAST_NAME));
        actor.attemptsTo(Enter.theValue(datesUser.getEmail()).into(INPUT_EMAIL));
        actor.attemptsTo(Click.on(INPUT_lANGUAGE),
                Enter.theValue(datesUser.getLanguage()).into(INPUT_lANGUAGE),
                Hit.the(Keys.ENTER).into(INPUT_lANGUAGE));
        actor.attemptsTo(SelectDate.selectDate(datesUser.getDateOfBirth()));
        actor.attemptsTo(Click.on(BTN_LOCATION));
        actor.attemptsTo(WaitUntil.the(AUTODETECTED_ADDRESS, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds());
        actor.attemptsTo(Click.on(BTN_DEVICES));
        actor.attemptsTo(WaitUntil.the(AUTODETECTED_DEVICES, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds());
        actor.attemptsTo(Click.on(BTN_LAST_STEP));
        actor.attemptsTo(Enter.theValue(datesUser.getPassword()).into(PASSWORD));
        actor.attemptsTo(Enter.theValue(datesUser.getPassword()).into(CONFIRM_PASSWORD));
        actor.attemptsTo(Click.on(CHK_TERM_OF_USE));
        actor.attemptsTo(Click.on(CHK_PRIVACY));
        actor.attemptsTo((Click.on(BTN_COMPLETE_SETUP)));

    }

    public static RegisterUser registerUser(DatesUser datesUser) {
        return Tasks.instrumented(RegisterUser.class, datesUser);
    }
}
