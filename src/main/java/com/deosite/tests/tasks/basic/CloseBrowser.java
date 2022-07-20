package com.deosite.tests.tasks.basic;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CloseBrowser implements Task {
    @Override
    @Step("{0} closes the browser")
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().close();
    }

    public static CloseBrowser closeBrowser() {
        return instrumented(CloseBrowser.class);
    }
}
