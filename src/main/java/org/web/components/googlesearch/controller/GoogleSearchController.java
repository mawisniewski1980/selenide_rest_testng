package org.web.components.googlesearch.controller;

import org.web.components.googlesearch.action.GoogleSearchAction;
import org.web.controller.BaseController;
import org.web.controller.ControllerFactory;

public class GoogleSearchController extends BaseController {

    private GoogleSearchAction action = new GoogleSearchAction(baseActions);

    public GoogleSearchController(ControllerFactory controllerFactory) {
        super(controllerFactory);
    }

    public void search(String value) {
        action.closePopUp();
        action.search(value);
    }

    public boolean isResultsAreEmpty() {
        return action.isResultsAreEmpty();
    }
}
