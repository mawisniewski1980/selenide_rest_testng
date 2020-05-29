package org.example;

import org.abstracts.AbstractTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppLocal_IT extends AbstractTest
{

    @BeforeMethod
    public void setUp() {
        LOG.info("setUp");
    }

    @Test(groups = {"LOCAL"})
    public void test1() {
        LOG.info("TEST1: LOCAL");
        LOG.info("ENV: " + System.getProperty("env"));
        LOG.info("Thread LOCAL " + Thread.currentThread().getId());
        assertThat(true).isTrue();
    }

    @Test(groups = {"LOCAL"})
    public void test2() {
        LOG.info("TEST2: LOCAL");
        LOG.info("ENV: " + System.getProperty("env"));
        LOG.info("Thread LOCAL " + Thread.currentThread().getId());
        assertThat(true).isTrue();
    }

    @Test(groups = {"LOCAL"})
    public void test3() {
        LOG.info("TEST3: LOCAL");
        LOG.info("ENV: " + System.getProperty("env"));
        LOG.info("Thread LOCAL " + Thread.currentThread().getId());
        assertThat(true).isTrue();
    }

    @Test(groups = {"LOCAL"})
    public void test4() {
        LOG.info("TEST4: LOCAL");
        LOG.info("ENV: " + System.getProperty("env"));
        LOG.info("Thread LOCAL " + Thread.currentThread().getId());
        assertThat(true).isTrue();
    }

    @Test(groups = {"LOCAL"})
    public void test5() {
        LOG.info("TEST5: LOCAL");
        LOG.info("ENV: " + System.getProperty("env"));
        LOG.info("Thread LOCAL " + Thread.currentThread().getId());
        assertThat(true).isTrue();
    }

    @AfterMethod
    public void tearDown() {
        LOG.info("tearDown");
    }
}
