package com.deosite.tests.actions;

import net.serenitybdd.core.steps.Instrumented;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Open {

    public static OpenMiniCart miniCart() {
        return new OpenMiniCart();
    }

    public static OpenCheckoutPage checkoutPage() {
        return new OpenCheckoutPage();
    }

    public static OpenProductPageRandomly productPageByPosition() {
        return instrumented(OpenProductPageRandomly.class);

    }

    public static OpenProductPageManually productPageManually(int position) {
        return Instrumented.instanceOf(OpenProductPageManually.class).withProperties(position);
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
