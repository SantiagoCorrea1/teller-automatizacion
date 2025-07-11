package co.com.calidad.carrito.carritocompras.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {

    public static final Target CHECKOUT_BUTTON = Target.the("Add backpack to the cart")
            .located(By.id("checkout"));

}
