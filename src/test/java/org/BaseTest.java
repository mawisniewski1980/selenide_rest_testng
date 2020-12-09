package org;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

@Listeners({Listener.class})
public abstract class BaseTest {

    protected static final Logger LOG = LogManager.getLogger("Logger");

    @BeforeSuite(alwaysRun = true)
    public static void beforeSuite() {
        LOG.info("beforeSuite");
    }

    @AfterSuite(alwaysRun = true)
    public static void afterSuite() {
        LOG.info("afterSuite");
    }
}
