package org.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.web.actions.BaseActions;

public abstract class BaseController {

    protected static final Logger LOG = LoggerFactory.getLogger("Logger");
    protected BaseActions baseActions = new BaseActions();
    private FactoryController factoryController;

    public BaseController(FactoryController factoryController) {
        this.factoryController = factoryController;
    }
}
