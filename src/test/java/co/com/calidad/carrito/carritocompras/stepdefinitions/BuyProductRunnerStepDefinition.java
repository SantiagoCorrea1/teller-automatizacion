package co.com.calidad.carrito.carritocompras.stepdefinitions;

import co.com.calidad.carrito.carritocompras.questions.PurchaseConfirmationMessage;
import co.com.calidad.carrito.carritocompras.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class BuyProductRunnerStepDefinition {

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

    @And("hago clic en el icono del carrito")
    public void iClickOnTheCartIcon() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ClickOnCartIcon.now()
        );
    }

    @And("hago clic en el boton de checkout")
    public void iClickOnTheCheckoutButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CheckOut.now()
        );
    }

    @And("lleno el formulario de pago con datos validos")
    public void iFillThePaymentForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                FillOutPaymentForm.withData("pepito", "perez", "110111")
        );
    }

    @And("confirmo la compra")
    public void iConfirmThePurchase() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ConfirmPurchase.now()
        );
    }
    @Then("veo el mensaje de confirmaciode compra exitosa")
    public void iSeeThePurchaseConfirmationMessage() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(PurchaseConfirmationMessage.text(), containsString("Thank you for your order"))
        );
    }
}
