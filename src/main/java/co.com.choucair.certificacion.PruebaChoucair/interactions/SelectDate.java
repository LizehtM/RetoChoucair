package co.com.choucair.certificacion.PruebaChoucair.interactions;

import co.com.choucair.certificacion.PruebaChoucair.tasks.RegisterUser;
import co.com.choucair.certificacion.PruebaChoucair.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class SelectDate implements Task {

    private String dateOfBirth;

    public SelectDate(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String month = dateOfBirth.substring(0,4);
        String day = dateOfBirth.substring(5,7);
        String year = dateOfBirth.substring(8,12);

    actor.attemptsTo(SelectFromOptions.byVisibleText(month).from(RegisterPage.LIST_MONTH));
    actor.attemptsTo(SelectFromOptions.byVisibleText(day).from(RegisterPage.LIST_DAY));
    actor.attemptsTo(SelectFromOptions.byVisibleText(year).from(RegisterPage.LIST_YEAR));
    }

    public static SelectDate selectDate(String dateOfBirth){

        return Tasks.instrumented(SelectDate.class, dateOfBirth );
    }
}
