package com.qa.efficiency.common;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Страница со всеми встречами
 */

public class ActivitiesPage {
    private final SelenideElement createButton = $x("//*[button(@class, calendar-counter__add");

    public ActivitiesPage(String url){
        Selenide.open(url);
    }
    public void clickOnCreate(){
        createButton.click();
    }
}
