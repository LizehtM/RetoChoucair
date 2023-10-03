package co.com.choucair.certificacion.PruebaChoucair.questions;

import co.com.choucair.certificacion.PruebaChoucair.tasks.RegisterUser;
import co.com.choucair.certificacion.PruebaChoucair.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateMessage implements Question {

      private String message;

        public ValidateMessage(String message) {
            this.message = message;
    }

        @Override
        public Object answeredBy(Actor actor) {

            String messageReceived = Text.of(RegisterPage.MESSAGE).answeredBy(actor);
            return messageReceived.contains(message);
        }

        public static ValidateMessage validateMessage(String message){
            return new ValidateMessage(message);
    }
}