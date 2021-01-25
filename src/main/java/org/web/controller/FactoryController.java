package org.web.controller;

import org.web.components.googlesearch.controller.GoogleSearchController;

public final class FactoryController {

    public FactoryController() {
    }

    public GoogleSearchController newGoogleSearchController() {
        return new GoogleSearchController(this);
    }

}
