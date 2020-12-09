package org;

import com.codeborne.selenide.testng.ScreenShooter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.web.components.googlesearch.controller.GoogleSearchController;
import org.web.controller.ControllerFactory;

@Listeners({ScreenShooter.class})
public abstract class BaseWebTest extends BaseTest {

    protected GoogleSearchController googleSearchController;
    private ControllerFactory controllerFactory;

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        LOG.info("beforeClass");
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
