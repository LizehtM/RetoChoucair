package co.com.choucair.certificacion.PruebaChoucair.questions;

import co.com.choucair.certificacion.PruebaChoucair.userinterfaces.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateErrorMessage implements Question {

    private  String message;
    public ValidateErrorMessage(String message) {
        this.message = message;
    }

    @Override
    public Object answeredBy(Actor actor) {

        String validateMessage = Text.of(Login.MESSAGE_EMAIL).answeredBy(actor);
        System.out.println(validateMessage +" "+ message);
        return validateMessage.contains(message);

    }
    public static ValidateErrorMessage validateErrorMessage(String message){
        return new ValidateErrorMessage (message);
    }
}


