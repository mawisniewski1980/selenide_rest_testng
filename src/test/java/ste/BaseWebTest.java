package ste;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import ste.web.components.googlesearch.controller.GoogleSearchController;
import ste.web.controller.FactoryController;

//@Listeners({ScreenShooter.class})
public abstract class BaseWebTest extends BaseTest {

    protected boolean headless = false;
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
