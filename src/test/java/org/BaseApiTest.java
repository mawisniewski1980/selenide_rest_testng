package org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseApiTest extends BaseTest {

    @BeforeClass(alwaysRun = true)
    protected void beforeClass() {
        LOG.info("beforeClass");
    }

    @AfterClass(alwaysRun = true)
    protected void afterClass() {
        LOG.info("afterClass");
    }
}
