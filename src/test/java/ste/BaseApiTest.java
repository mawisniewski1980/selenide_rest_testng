package ste;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseApiTest extends BaseTest {

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        LOG.info("beforeClass");
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        LOG.info("afterClass");
    }
}
