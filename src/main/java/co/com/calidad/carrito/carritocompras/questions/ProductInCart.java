package co.com.calidad.carrito.carritocompras.questions;

import co.com.calidad.carrito.carritocompras.userinterfaces.ProductsPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ProductInCart {

    public static Question<Boolean> isVisible() {
        return Visibility.of(ProductsPage.CART_BADGE).asBoolean();
    }
}