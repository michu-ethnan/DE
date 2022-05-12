package com.deosite.tests.tasks.product;

import com.deosite.tests.questions.product.ProductName;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddToCart implements Task {
    String productName;

    @Override
    @Step("{0} adds product to cart")
    public <T extends Actor> void performAs(T actor) {
        productName = ProductName.productName().answeredBy(theActorInTheSpotlight());
        actor.attemptsTo(
                Check.whether(productName.contains(productName)).andIfSo(AddToCartFromPdp.toCart()).otherwise(AddToCartFromCollectionPage.toCart())
               /* WaitUntil.the(ADD_TO_CART_BUTTON, isPresent()).forNoMoreThan(100).seconds(),
                WaitUntil.the(ADD_TO_CART_BUTTON, isClickable()).forNoMoreThan(100).seconds(),
                Click.on(ADD_TO_CART_BUTTON),
                WaitUntil.the(ALERT_BOX, isPresent()).forNoMoreThan(100).seconds()*/
        );
    }
}
