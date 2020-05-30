package org.example;

import org.abstracts.AbstractTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppLocal_IT extends AbstractTest {

    @Test(groups = {"LOCAL"})
    public void test1() {
        LOG.info(String.format("Group: %s, env: %s, thread: %s", "LOCAL", System.getProperty("env"), Thread.currentThread().getId()));
        assertThat(true).isTrue();
    }

    @Test(groups = {"LOCAL"})
    public void test2() {
        LOG.info(String.format("Group: %s, env: %s, thread: %s", "LOCAL", System.getProperty("env"), Thread.currentThread().getId()));
        assertThat(true).isTrue();
    }

    @Test(groups = {"LOCAL"})
    public void test3() {
        LOG.info(String.format("Group: %s, env: %s, thread: %s", "LOCAL", System.getProperty("env"), Thread.currentThread().getId()));
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

}
