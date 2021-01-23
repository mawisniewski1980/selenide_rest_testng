package org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.thread.factory.ComponentFactory;


public abstract class BaseThreadTest extends BaseTest {

    private final ComponentFactory factory = new ComponentFactory();

    public BaseThreadTest() {
    }

    protected ComponentFactory getFactory() {
        return factory;
    }

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        LOG.info("BEFORECLASS: {}, {}", BaseThreadTest.class.getName(), Thread.currentThread().getId());
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        LOG.info("AFTERCLASS: {}, {}", BaseThreadTest.class.getName(), Thread.currentThread().getId());
    }

}
