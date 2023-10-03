package co.com.choucair.certificacion.PruebaChoucair.questions;

import co.com.choucair.certificacion.PruebaChoucair.userinterfaces.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateMessageLogin implements Question {

    private  String message;
    public ValidateMessageLogin(String message) {
        this.message = message;
    }

    @Override
    public Object answeredBy(Actor actor) {

        String validateMessage = Text.of(Login.MESSAGE).answeredBy(actor);
        System.out.println(validateMessage +" "+ message);
        return validateMessage.contains(message);

    }
    public static ValidateMessageLogin validateMessageLogin(String message){
        return new ValidateMessageLogin(message);
    }
}
