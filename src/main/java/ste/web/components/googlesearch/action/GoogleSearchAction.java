package ste.web.components.googlesearch.action;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.apache.commons.lang3.ThreadUtils;
import org.openqa.selenium.By;
import ste.web.components.googlesearch.data.GoogleSearchData;
import ste.web.controller.BaseActions;
import ste.web.components.googlesearch.elements.GoogleSearchElement;

import java.time.Duration;

public class GoogleSearchAction {

    private BaseActions baseActions;

    public GoogleSearchAction(BaseActions baseActions) {
        this.baseActions = baseActions;
    }

    public void search(String value) {
        baseActions.setValueAndPressEnter(By.cssSelector(GoogleSearchElement.INPUT.getSelector()), value);
    }

    public ElementsCollection getResults() {
        return baseActions.getElementsCollection(By.cssSelector(GoogleSearchElement.LIST_VALUES.getSelector()));
    }

    public boolean isResultsAreEmpty() {
        return baseActions.getElementsCollection(By.cssSelector(GoogleSearchElement.LIST_VALUES.getSelector())).isEmpty();
    }

    public void closePopUp() throws InterruptedException {
        //baseActions.closePopUp(By.xpath(GoogleSearchElement.AGREE_BUTTON.getSelector()), 0);
        baseActions.clickElement(By.xpath(GoogleSearchElement.AGREE_BUTTON.getSelector()));
        ThreadUtils.sleep(Duration.ofSeconds(10));
    }

    public GoogleSearchData getData() {
        return new GoogleSearchData(baseActions.isElementDisplayed(By.cssSelector(GoogleSearchElement.INPUT.getSelector())));
    }
}
