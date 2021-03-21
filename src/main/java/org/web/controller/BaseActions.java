package org.web.controller;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Selenide.*;

public class BaseActions {

    protected static final Logger LOG = LoggerFactory.getLogger("Logger");

    public void setValue(By seleniumSelector, String value) {
        LOG.info("Before action: " + seleniumSelector + " value: " + value);
        $(seleniumSelector).shouldBe(Condition.visible).setValue(value);
        LOG.info("After action: " + seleniumSelector + " value: " + value);
    }

    public void setValueAndPressEnter(By seleniumSelector, String value) {
        LOG.info("Before action: " + seleniumSelector + " value: " + value);
        $(seleniumSelector).shouldBe(Condition.visible).setValue(value).pressEnter();
        LOG.info("After action: " + seleniumSelector + " value: " + value);
    }

    public boolean isElementDisplayed(By seleniumSelector) {
        LOG.info("Before action: " + seleniumSelector + " is visible ?");
        boolean isDisplayed = $(seleniumSelector).isDisplayed();
        LOG.info("After action: " + seleniumSelector + " is visible: " + isDisplayed);
        return isDisplayed;
    }

    public void closePopUp(By seleniumSelector, int index) {
        LOG.info("Before action: " + seleniumSelector + " index: " + index);
        if (isIframeExists() && countIframe() > 0) {
            switchTo().frame(index);
            if ($(seleniumSelector).isDisplayed()) {
                $(seleniumSelector).click();
                switchTo().defaultContent();
            }
        }
        LOG.info("After action: " + seleniumSelector + " index: " + index);
    }

    public ElementsCollection getElementsCollection(By seleniumSelector) {
        LOG.info("Before action: " + seleniumSelector);
        ElementsCollection collection = $$(seleniumSelector).shouldBe(CollectionCondition.sizeGreaterThan(0));
        LOG.info("After action: " + seleniumSelector);
        return collection;
    }

    private boolean isIframeExists() {
        return $(By.tagName("iframe")).exists();
    }

    private int countIframe() {
        return $$(By.tagName("iframe")).size();
    }
}
