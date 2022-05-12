package com.deosite.tests.actions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;

import java.util.List;
import java.util.Random;

import static com.deosite.tests.pages.SearchPage.PRODUCTS_TITLE;

public class OpenProductPageRandomly implements Interaction {




    @Override
    @Step("{0} opens page of a product")
    public <T extends Actor> void performAs(T actor) {


        int size = PRODUCTS_TITLE.resolveAllFor(actor).size();
        System.out.println(size);
        List<WebElementFacade> products = PRODUCTS_TITLE.resolveAllFor(actor);
        System.out.println(products);
            Random r = new Random();
            int i = r.nextInt(products.size());
            products.get(i).click();



    }
}
