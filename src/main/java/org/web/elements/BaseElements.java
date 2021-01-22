package org.web.elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BaseElements {

    public SelenideElement getElement(String selector) {
        return StringUtils.startsWithAny(selector, "//", "//", "//*") ? $x(selector) : $(selector);
    }

    public ElementsCollection getElementCollection(String selector) {
        return StringUtils.startsWithAny(selector, "//", "//", "//*") ? $$x(selector) : $$(selector);
    }

    public SelenideElement getElementByTagName(String tagName) {
        return $(By.tagName(tagName));
    }

    public ElementsCollection getElementCollectionByTagName(String tagName) {
        return $$(By.tagName(tagName));
    }
}
