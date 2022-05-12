package com.deosite.tests.tasks.product;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;

import static com.deosite.tests.pages.ProductPage.ADD_TO_CART_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProductToCart implements Task {
    //String collectionHeader;
    @Override
    @Step("{0} adds product to cart")
    public <T extends Actor> void performAs(T actor) {
        //collectionHeader = CollectionPageHeader.valueIs().answeredBy(theActorInTheSpotlight());

        actor.attemptsTo(
                Check.whether(ADD_TO_CART_BUTTON.resolveFor(actor).isClickable()).andIfSo(AddToCartFromPdp.toCart()).otherwise(ReturnAndAddAnotherProduct.toCart())
        );
    }
    public static Task toCart() {
        return instrumented(AddProductToCart.class);
    }
}
