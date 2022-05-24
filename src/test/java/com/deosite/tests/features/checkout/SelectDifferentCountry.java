package com.deosite.tests.features.checkout;

import com.deosite.tests.actions.Open;
import com.deosite.tests.pages.*;
import com.deosite.tests.steps.SetupSteps;
import com.deosite.tests.tasks.Setup;
import com.deosite.tests.tasks.mainMenu.ClickCategory;
import com.deosite.tests.tasks.order.FillInBillingData;
import com.deosite.tests.tasks.order.SelectBillingCountry;
import com.deosite.tests.tasks.product.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Steps;

import static com.deosite.tests.pages.CheckoutPage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class SelectDifferentCountry {

    @Steps
    SetupSteps setupSteps;

    @Given("that {word} wants to select a billing country")
    public void that_actor_wants_to_select_a_billing_country(String actor) {
        theActorCalled(actor).wasAbleTo(
                Setup.site(),
                ClickCategory.byCategoryNumber(5),
                Open.productPageByPositionRandomly(),
                AddProduct.toCart(),
                Open.miniCart(),
                Open.checkoutPage(),
                WaitUntil.the(EMAIL_INPUT, isPresent()).forNoMoreThan(50).seconds()
        );
    }

    @When("she chooses Denmark as a {word}")
    public void actor_chooses_Denmark(String userType) {
        theActorInTheSpotlight().attemptsTo(
                FillInBillingData.type(userType),
                Click.on(COUNTRY_BILLING_INPUT),
                SelectBillingCountry.byCountry(3),
                WaitUntil.the(SUBMIT_BUTTON, isClickable())
        );
    }
    @When("she chooses Netherlands as a {word}")
    public void actor_chooses_Netherlands(String userType) {
        theActorInTheSpotlight().attemptsTo(
                FillInBillingData.type(userType),
                Click.on(COUNTRY_BILLING_INPUT),
                SelectBillingCountry.byCountry(4),
                WaitUntil.the(SUBMIT_BUTTON, isClickable())
        );
    }

    @And("clicks the payment page button")
    public void clicks_the_payment_page_button() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(SUBMIT_BUTTON),
                WaitUntil.the(DELIVERY_TYPE_COURIER, isNotPresent())

        );
    }

    @Then("she should be on payment page")
    public void actor_should_be_on_the_payment_page() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(PaymentPage.AGREEMENT_CHECKBOX, isPresent()),
                Ensure.that(PaymentPage.AGREEMENT_CHECKBOX).isDisplayed(),
                Ensure.that(PaymentPage.PLACE_ORDER_BUTTON).isEnabled()
        );
    }
}
