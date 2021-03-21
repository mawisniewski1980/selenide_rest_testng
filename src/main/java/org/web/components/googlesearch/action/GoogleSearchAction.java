package org.web.components.googlesearch.action;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.web.components.googlesearch.data.GoogleSearchData;
import org.web.controller.BaseActions;

import static org.web.components.googlesearch.elements.GoogleSearchElement.*;

public class GoogleSearchAction {

    private BaseActions baseActions;

    public GoogleSearchAction(BaseActions baseActions) {
        this.baseActions = baseActions;
    }

    public void search(String value) {
        baseActions.setValueAndPressEnter(By.cssSelector(INPUT.getSelector()), value);
    }

    public ElementsCollection getResults() {
        return baseActions.getElementsCollection(By.cssSelector(LIST_VALUES.getSelector()));
    }

    public boolean isResultsAreEmpty() {
        return baseActions.getElementsCollection(By.cssSelector(LIST_VALUES.getSelector())).isEmpty();
    }

    public void closePopUp() {
        baseActions.closePopUp(By.xpath(_AGREE_BUTTON.getSelector()), 0);
    }

    public GoogleSearchData getData() {
        return new GoogleSearchData(baseActions.isElementDisplayed(By.cssSelector(INPUT.getSelector())));
    }
}
