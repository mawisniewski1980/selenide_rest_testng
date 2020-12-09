package org.web.actions;

import com.codeborne.selenide.ElementsCollection;

public interface BaseActions {

    void setValue(String selector, String value);

    void setValueAndPressEnter(String selector, String value);

    void closePopUp(String selector, int idx);

    ElementsCollection getElementsCollection(String selector);
}
