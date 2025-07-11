package co.com.calidad.carrito.carritocompras.tasks;

import co.com.calidad.carrito.carritocompras.userinterfaces.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CheckOut implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CartPage.CHECKOUT_BUTTON)
        );
    }

    public static CheckOut now() {
        return instrumented(CheckOut.class);
    }
}
