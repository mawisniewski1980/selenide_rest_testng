package org.abstracts;

import org.config.Listener;
import org.testng.annotations.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.config.SelenideConfig.cleanUp;
import static org.config.SelenideConfig.setUp;

@Listeners(Listener.class)
public abstract class AbstractTest {

    protected static final Logger LOG = LogManager.getLogger("Logger");


    @BeforeSuite(alwaysRun = true)
    public static void beforeSuite() {
        LOG.info("beforeSuite");
        setUp();
    }

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        LOG.info("beforeClass");
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        LOG.info("afterClass");
    }

    @AfterSuite(alwaysRun = true)
    public static void afterSuite() {
        LOG.info("afterSuite");
        cleanUp();
    }
}
