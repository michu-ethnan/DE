package com.deosite.tests.tasks.product;

import com.deosite.tests.actions.Open;
import com.deosite.tests.actions.OpenMiniCart;
import com.deosite.tests.questions.product.ProductName;
import com.deosite.tests.tasks.basic.ReturnToPreviousPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;

import static com.deosite.tests.pages.ProductPage.ADD_TO_CART_BUTTON;
import static com.deosite.tests.pages.ProductPage.PAGE_NOT_FOUND;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddToCart implements Task {
    //String productName;

    @Override
    @Step("{0} adds product to cart")
    public <T extends Actor> void performAs(T actor) {
        //productName = ProductName.productName().answeredBy(theActorInTheSpotlight());
        if (PAGE_NOT_FOUND.resolveFor(actor).isPresent()){
            actor.attemptsTo(
                    ReturnToPreviousPage.goToPreviousPage(),
                    Open.productPageByPosition()
            );
        }
        actor.attemptsTo(
                Check.whether(ADD_TO_CART_BUTTON.resolveFor(actor).isClickable()).andIfSo(AddToCartFromPdp.toCart()).otherwise(ReturnAndAddAnotherProduct.toCart())
                //Check.whether(productName.contains(productName)).andIfSo(AddToCartFromPdp.toCart()).otherwise(AddToCartFromCollectionPage.toCart())
               /* WaitUntil.the(ADD_TO_CART_BUTTON, isPresent()).forNoMoreThan(100).seconds(),
                WaitUntil.the(ADD_TO_CART_BUTTON, isClickable()).forNoMoreThan(100).seconds(),
                Click.on(ADD_TO_CART_BUTTON),
                WaitUntil.the(ALERT_BOX, isPresent()).forNoMoreThan(100).seconds()*/
        );
    }
}
