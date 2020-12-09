package org.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.web.actions.BaseActions;
import org.web.actions.BaseActionsImp;

public abstract class BaseController {

    protected static final Logger LOG = LoggerFactory.getLogger("Logger");
    protected ControllerFactory controllerFactory;
    protected BaseActions baseActions = new BaseActionsImp();

    public BaseController(ControllerFactory controllerFactory) {
        this.controllerFactory = controllerFactory;
    }
}
