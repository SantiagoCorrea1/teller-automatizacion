package co.com.calidad.carrito.carritocompras.tasks;

import co.com.calidad.carrito.carritocompras.userinterfaces.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnCartIcon implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductsPage.CART_ICON)
        );
    }

    public static ClickOnCartIcon now() {
        return instrumented(ClickOnCartIcon.class);
    }
}
