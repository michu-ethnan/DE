package com.deosite.tests.actions;

import com.deosite.tests.tasks.product.AddToCartFromPdp;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Open {

    public static OpenMiniCart miniCart() {
        return new OpenMiniCart();
    }

    public static OpenCheckoutPage checkoutPage() {
        return new OpenCheckoutPage();
    }

    public static OpenProductPage productPageByPosition() {
        return instrumented(OpenProductPage.class);

    }

    public static OpenLoginPage loginPage() {
        return new OpenLoginPage();
    }

    public static OpenCategoryPage categoryPage() {
        return new OpenCategoryPage();
    }

    public static OpenAccountPage accountPage() {
        return new OpenAccountPage();
    }
}
