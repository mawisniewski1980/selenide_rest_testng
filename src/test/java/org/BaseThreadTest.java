package org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.thread.components.FirstComponent;
import org.thread.factory.ComponentFactory;


public abstract class BaseThreadTest extends BaseTest {

    protected FirstComponent firstComponent;
    private final ComponentFactory componentFactory = new ComponentFactory();

    @BeforeClass(alwaysRun = true)
    protected void beforeClass() {
        LOG.info("BEFORECLASS: {}, {}", BaseThreadTest.class.getName(), Thread.currentThread().getId());
    }

    @AfterClass(alwaysRun = true)
    protected void afterClass() {
        LOG.info("AFTERCLASS: {}, {}", BaseThreadTest.class.getName(), Thread.currentThread().getId());
    }

    protected void initComponents() {
        firstComponent = componentFactory.getFirstComponent();
    }

}
