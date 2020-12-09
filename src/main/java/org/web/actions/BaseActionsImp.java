package org.web.actions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.web.elements.BaseElements;
import org.web.elements.BaseElementsImp;

import static com.codeborne.selenide.Selenide.switchTo;

public class BaseActionsImp implements BaseActions {

    protected static final Logger LOG = LoggerFactory.getLogger("Logger");
    private BaseElements baseElements = new BaseElementsImp();

    @Override
    public void setValue(String selector, String value) {
        LOG.info("Before action: " + selector + " value: " + value);
        baseElements.getElement(selector).shouldBe(Condition.visible).setValue(value);
        LOG.info("After action: " + selector + " value: " + value);
    }

    @Override
    public void setValueAndPressEnter(String selector, String value) {
        LOG.info("Before action: " + selector + " value: " + value);
        baseElements.getElement(selector).shouldBe(Condition.visible).setValue(value).pressEnter();
        LOG.info("After action: " + selector + " value: " + value);
    }

    @Override
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

    @Override
    public ElementsCollection getElementsCollection(String selector) {
        LOG.info("Before action: " + selector);
        ElementsCollection collection = baseElements.getElementCollection(selector);
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
