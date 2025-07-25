package ste;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import ste.thread.Threads;

@Listeners({Listener.class})
public abstract class BaseTest {

    protected static final Logger LOG = LogManager.getLogger("Logger");
    protected static Threads threads = Threads.getInstance();

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {
        LOG.info("BEFORESUITE: {}, {}", BaseTest.class.getName(), Thread.currentThread().getId());
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        LOG.info("AFTERSUITE: {}, {}", BaseTest.class.getName(), Thread.currentThread().getId());
        threads.clearAll();
    }


}
