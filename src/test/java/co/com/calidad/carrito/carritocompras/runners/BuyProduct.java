package co.com.calidad.carrito.carritocompras.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/buy_product.feature",
        glue = "co.com.calidad.carrito.carritocompras.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class BuyProduct {}