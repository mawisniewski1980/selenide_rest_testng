package org.web.actions;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.web.elements.BaseElements;

import static com.codeborne.selenide.Selenide.switchTo;

public class BaseActions {

    protected static final Logger LOG = LoggerFactory.getLogger("Logger");
    private BaseElements baseElements = new BaseElements();

    public void setValue(String selector, String value) {
        LOG.info("Before action: " + selector + " value: " + value);
        baseElements.getElement(selector).shouldBe(Condition.visible).setValue(value);
        LOG.info("After action: " + selector + " value: " + value);
    }

    public void setValueAndPressEnter(String selector, String value) {
        LOG.info("Before action: " + selector + " value: " + value);
        baseElements.getElement(selector).shouldBe(Condition.visible).setValue(value).pressEnter();
        LOG.info("After action: " + selector + " value: " + value);
    }

    public void closePopUp(String selector, int idx) {
        LOG.info("Before action: " + selector + " index: " + idx);
        if (isIframeExists() && countIframe() > 0) {
            switchTo().frame(idx);
            if (baseElements.getElement(selector).isDisplayed()) {
                baseElements.getElement(selector).click();
                switchTo().defaultContent();
            }
        }
        LOG.info("After action: " + selector + " index: " + idx);
    }

    public ElementsCollection getElementsCollection(String selector) {
        LOG.info("Before action: " + selector);
        ElementsCollection collection = baseElements.getElementCollection(selector).shouldBe(CollectionCondition.sizeGreaterThan(0));
        LOG.info("After action: " + selector);
        return collection;
    }

    private boolean isIframeExists() {
        return baseElements.getElementByTagName("iframe").exists();
    }

    private int countIframe() {
        return baseElements.getElementCollectionByTagName("iframe").size();
    }
}
