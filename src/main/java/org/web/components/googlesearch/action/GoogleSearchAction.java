package org.web.components.googlesearch.action;

import org.web.actions.BaseActions;

import static org.web.components.googlesearch.elements.GoogleSearchElement.*;

public class GoogleSearchAction {

    private BaseActions baseActions;

    public GoogleSearchAction(BaseActions baseActions) {
        this.baseActions = baseActions;
    }

    public void search(String value) {
        baseActions.setValueAndPressEnter(INPUT.getSelector(), value);
    }

    public boolean isResultsAreEmpty() {
        return baseActions.getElementsCollection(LIST_VALUES.getSelector()).isEmpty();
    }

    public void closePopUp() {
        baseActions.closePopUp(AGREE_BUTTON.getSelector(), 0);
    }
}
