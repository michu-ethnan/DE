package com.deosite.tests.pages;

import net.serenitybdd.screenplay.targets.Target;

public class Alert {

    public static Target ALERT_BOX = Target.the("Added to cart alert").locatedBy("//*[@id=\"__notifications-bottomLeft__\"]/div/div");
}
