package org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.thread.components.FirstComponent;
import org.thread.factory.ComponentFactory;

public abstract class BaseThreadTest extends BaseTest {

    protected FirstComponent firstComponent;
    private ComponentFactory factory;

    public BaseThreadTest() {
        factory = new ComponentFactory();
        initComponents();
    }

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        LOG.info("BEFORECLASS: {}, {}", BaseThreadTest.class.getName(), Thread.currentThread().getId());
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        LOG.info("AFTERCLASS: {}, {}", BaseThreadTest.class.getName(), Thread.currentThread().getId());
    }

    private void initComponents() {
        firstComponent = factory.getFirstComponent();
    }
}
