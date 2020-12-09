package org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.web.components.googlesearch.controller.GoogleSearchController;
import org.web.controller.ControllerFactory;

public abstract class BaseWebTest extends BaseTest {

    protected GoogleSearchController googleSearchController;
    private ControllerFactory controllerFactory;

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        controllerFactory = new ControllerFactory();
        initControllers();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        LOG.info("afterClass");
    }

    private void initControllers() {
        googleSearchController = controllerFactory.newGoogleSearchController();
    }
}
