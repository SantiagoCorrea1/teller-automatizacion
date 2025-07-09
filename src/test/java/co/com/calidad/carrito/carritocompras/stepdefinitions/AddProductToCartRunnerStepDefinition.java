package co.com.calidad.carrito.carritocompras.stepdefinitions;

import co.com.calidad.carrito.carritocompras.questions.ProductInCart;
import co.com.calidad.carrito.carritocompras.tasks.Login;
import co.com.calidad.carrito.carritocompras.tasks.SelectProduct;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import static org.hamcrest.Matchers.is;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AddProductToCartRunnerStepDefinition {

    @Managed(driver = "chrome")
    public WebDriver driver;

    private Actor client = Actor.named("standard_user");

    @Before
    public void config() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que estoy autenticado en la tienda virtual")
    public void iAmAuthenticatedInTheVirtualStore() {
        OnStage.theActorCalled("standard_user").wasAbleTo(
                Open.url("https://www.saucedemo.com"),
                Login.witCredentials("standard_user", "secret_sauce")
        );
    }

    @When("selecciono un producto de la tienda")
    public void iSelectAProductFromTheStore() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SelectProduct.onTheStore()
        );
    }

    @Then("el producto se agrega a mi carrito de compras")
    public void theProductIsAddedToMyShoppingCart() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ProductInCart.isVisible(), is(true))
        );
    }

}
