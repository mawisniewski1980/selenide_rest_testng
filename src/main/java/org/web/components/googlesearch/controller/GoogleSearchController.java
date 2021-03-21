package org.web.components.googlesearch.controller;

import com.codeborne.selenide.Condition;
import org.web.components.googlesearch.action.GoogleSearchAction;
import org.web.components.googlesearch.data.GoogleSearchData;
import org.web.components.googlesearch.test.GoogleSearchTest;
import org.web.controller.BaseController;
import org.web.controller.FactoryController;

public class GoogleSearchController extends BaseController {

    private GoogleSearchAction action = new GoogleSearchAction(baseActions);
    private GoogleSearchTest test = new GoogleSearchTest();

    public GoogleSearchController(FactoryController factoryController) {
        super(factoryController);
    }

    public void validateAndSearch(String value) {
        action.closePopUp();

        GoogleSearchData data = getData();
        test.test(data);
        action.search(value);
    }

    public void clickByText(String byText) {
        action.getResults().findBy(Condition.text(byText)).click();
    }

    public boolean isResultsAreEmpty() {
        return action.isResultsAreEmpty();
    }

    private GoogleSearchData getData() {
        return action.getData();
    }
}
