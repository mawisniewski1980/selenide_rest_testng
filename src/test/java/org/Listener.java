package org;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

    Logger LOG = LogManager.getLogger("Logger");


    @Override
    public void onTestSuccess(ITestResult result) {
        LOG.info(result.getName() + " PASSED ");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        LOG.info(result.getName() + " FAILED ");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        LOG.info(result.getName() + " SKIPPED ");
    }

    @Override
    public void onFinish(ITestContext testContext) {
        LOG.info("Test completed on: " + testContext.getEndDate().toString());
    }
}
