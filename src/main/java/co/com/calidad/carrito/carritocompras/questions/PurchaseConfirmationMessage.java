package co.com.calidad.carrito.carritocompras.questions;

import co.com.calidad.carrito.carritocompras.userinterfaces.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class PurchaseConfirmationMessage {

    public static Question<String> text() {
        return new Question<>() {
            @Override
            public String answeredBy(Actor actor) {
                return Text.of(CheckoutPage.SUCCESS_MESSAGE).answeredBy(actor);
            }
        };
    }
}
