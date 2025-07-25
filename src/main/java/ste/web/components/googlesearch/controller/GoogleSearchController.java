package ste.web.components.googlesearch.controller;

import com.codeborne.selenide.Condition;
import ste.web.components.googlesearch.action.GoogleSearchAction;
import ste.web.components.googlesearch.data.GoogleSearchData;
import ste.web.components.googlesearch.test.GoogleSearchTest;
import ste.web.controller.BaseController;
import ste.web.controller.FactoryController;

public class GoogleSearchController extends BaseController {

    private GoogleSearchAction action = new GoogleSearchAction(baseActions);
    private GoogleSearchTest test = new GoogleSearchTest();

    public GoogleSearchController(FactoryController factoryController) {
        super(factoryController);
    }

    public void validateAndSearch(String value) throws InterruptedException {
        action.closePopUp();
        action.search("selenide");

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
