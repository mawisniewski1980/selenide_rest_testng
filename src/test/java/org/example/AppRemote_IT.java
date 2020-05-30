package org.example;

import org.abstracts.AbstractTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppRemote_IT extends AbstractTest {
    
    @Test(groups = {"REMOTE"})
    public void test1() {
        LOG.info(String.format("Group: %s, env: %s, thread: %s", "REMOTE", System.getProperty("env"), Thread.currentThread().getId()));
        assertThat(true).isTrue();
    }

    @Test(groups = {"REMOTE"})
    public void test2() {
        LOG.info(String.format("Group: %s, env: %s, thread: %s", "REMOTE", System.getProperty("env"), Thread.currentThread().getId()));
        assertThat(true).isTrue();
    }

    @Test(groups = {"REMOTE"})
    public void test3() {
        LOG.info(String.format("Group: %s, env: %s, thread: %s", "REMOTE", System.getProperty("env"), Thread.currentThread().getId()));
        assertThat(true).isTrue();
    }

    @Test(groups = {"REMOTE"})
    public void test4() {
        LOG.info(String.format("Group: %s, env: %s, thread: %s", "REMOTE", System.getProperty("env"), Thread.currentThread().getId()));
        assertThat(true).isTrue();
    }

    @Test(groups = {"REMOTE"})
    public void test5() {
        LOG.info(String.format("Group: %s, env: %s, thread: %s", "REMOTE", System.getProperty("env"), Thread.currentThread().getId()));
        assertThat(false).isTrue();
    }

}
