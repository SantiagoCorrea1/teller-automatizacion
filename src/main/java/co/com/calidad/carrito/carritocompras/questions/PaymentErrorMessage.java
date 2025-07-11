package co.com.calidad.carrito.carritocompras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentErrorMessage implements Question<String> {

    private static final Target ERROR_MESSAGE = Target.the("payment error message")
            .located(By.cssSelector("h3[data-test='error']"));

    @Override
    public String answeredBy(Actor actor) {
        return ERROR_MESSAGE.resolveFor(actor).getText();
    }

    public static PaymentErrorMessage text() {
        return new PaymentErrorMessage();
    }
}
