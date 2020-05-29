package org.example;

import org.abstracts.AbstractTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class AppRemote_IT extends AbstractTest {


    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        LOG.info("setUp");
    }

    @Test(groups = {"REMOTE"})
    public void test1() {
        LOG.info("TEST1: REMOTE");
        LOG.info("ENV: " + System.getProperty("env"));
        LOG.info("Thread REMOTE " + Thread.currentThread().getId());
        assertThat(true).isTrue();
    }

    @Test(groups = {"REMOTE"})
    public void test2() {
        LOG.info("TEST2: REMOTE");
        LOG.info("ENV: " + System.getProperty("env"));
        LOG.info("Thread REMOTE " + Thread.currentThread().getId());
        assertThat(true).isTrue();
    }

    @Test(groups = {"REMOTE"})
    public void test3() {
        LOG.info("TEST3: REMOTE");
        LOG.info("ENV: " + System.getProperty("env"));
        LOG.info("Thread REMOTE " + Thread.currentThread().getId());
        assertThat(true).isTrue();
    }

    @Test(groups = {"REMOTE"})
    public void test4() {
        LOG.info("TEST4: REMOTE");
        LOG.info("ENV: " + System.getProperty("env"));
        LOG.info("Thread REMOTE " + Thread.currentThread().getId());
        assertThat(true).isTrue();
    }

    @Test(groups = {"REMOTE"})
    public void test5() {
        LOG.info("TEST5: REMOTE");
        LOG.info("ENV: " + System.getProperty("env"));
        LOG.info("Thread REMOTE " + Thread.currentThread().getId());
        assertThat(false).isTrue();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        LOG.info("tearDown");
    }
}
