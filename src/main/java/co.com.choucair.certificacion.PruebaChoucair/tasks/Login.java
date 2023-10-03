package co.com.choucair.certificacion.PruebaChoucair.tasks;

import co.com.choucair.certificacion.PruebaChoucair.models.DatesLogin;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.choucair.certificacion.PruebaChoucair.userinterfaces.Login.*;
public class Login implements Task {

    private DatesLogin datesLogin;


    public Login(DatesLogin datesLogin) {
        this.datesLogin=datesLogin;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_LOG_IN));
        actor.attemptsTo(Enter.theValue(datesLogin.getEmail()).into(LABEL_USER));
        actor.attemptsTo(Enter.theValue(datesLogin.getPassword()).into(LABEL_PASSWORD));
        actor.attemptsTo(Click.on(BTN_SING_IN));
    }
    public static Login login(DatesLogin datesLogin){
        return Tasks.instrumented(Login.class, datesLogin);
    }
}
