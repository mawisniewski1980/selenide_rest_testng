package org;

import com.codeborne.selenide.testng.ScreenShooter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.web.components.googlesearch.controller.GoogleSearchController;
import org.web.controller.FactoryController;

@Listeners({ScreenShooter.class})
public abstract class BaseWebTest extends BaseTest {

    protected boolean headless = true;
    protected GoogleSearchController googleSearchController;
    private FactoryController factoryController = new FactoryController();

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        LOG.info("beforeClass");
        initControllers();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        LOG.info("afterClass");
    }

    private void initControllers() {
        googleSearchController = factoryController.newGoogleSearchController();
    }
}
