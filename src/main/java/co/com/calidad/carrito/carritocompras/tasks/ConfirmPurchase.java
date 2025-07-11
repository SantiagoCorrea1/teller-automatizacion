package co.com.calidad.carrito.carritocompras.tasks;

import co.com.calidad.carrito.carritocompras.userinterfaces.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ConfirmPurchase implements Task {
    public static ConfirmPurchase now() {
        return Tasks.instrumented(ConfirmPurchase.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CheckoutPage.FINISH_BUTTON)
        );
    }
}
