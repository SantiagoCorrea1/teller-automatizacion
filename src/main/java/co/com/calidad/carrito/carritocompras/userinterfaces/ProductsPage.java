package co.com.calidad.carrito.carritocompras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsPage {
    public static final Target ADD_BACKPACK_BUTTON = Target.the("Add backpack to the cart")
            .located(By.id("add-to-cart-sauce-labs-backpack"));

    public static final Target CART_BADGE = Target.the("Icon cart with products")
            .located(By.className("shopping_cart_badge"));

    public static final Target CART_ICON = Target.the("Shopping cart icon")
            .located(By.cssSelector("a.shopping_cart_link"));
    }


