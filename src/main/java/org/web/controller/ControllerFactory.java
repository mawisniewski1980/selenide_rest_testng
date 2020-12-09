package org.web.controller;

import org.web.components.googlesearch.controller.GoogleSearchController;

public class ControllerFactory {

    public ControllerFactory() {
    }

    public GoogleSearchController newGoogleSearchController() {
        return new GoogleSearchController(this);
    }

}
