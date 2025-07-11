package co.com.calidad.carrito.carritocompras.stepdefinitions;

import co.com.calidad.carrito.carritocompras.questions.PaymentErrorMessage;
import co.com.calidad.carrito.carritocompras.tasks.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class BuyProductFailRunnerStepDefinition {

    @When("lleno el formulario de pago sin el codigo postal")
    public void fillFormWithEmptyPostalCode() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                FillOutPaymentForm.withData("pepito", "perez", "")
        );
    }

    @Then("veo un mensaje de error indicando que el codigo postal es requerido")
    public void iSeeZipCodeRequiredError() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(PaymentErrorMessage.text(), containsString("Error: Postal Code is required"))
        );
    }
}
