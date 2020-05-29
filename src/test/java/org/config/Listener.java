package org.config;

import com.codeborne.selenide.Selenide;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Listener implements ITestListener {

    Logger LOG = LogManager.getLogger("Logger");


    @Override
    public void onTestSuccess(ITestResult result) {
        LOG.info(result.getName() + " OK ");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        LOG.info(result.getName() + " BLAD ");
        Selenide.screenshot(result.getName() + "_" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss_SS")));
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        LOG.info(result.getName() + " SKIPPED ");
    }
}
