package org.web.elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public interface BaseElements {

    SelenideElement getElement(String selector);

    ElementsCollection getElementCollection(String selector);

    SelenideElement getElementByTagName(String tagName);

    ElementsCollection getElementCollectionByTagName(String tagName);
}
