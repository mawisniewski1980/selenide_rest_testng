package org.thread;

import org.BaseThreadTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Threads_IT extends BaseThreadTest {

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        LOG.info("BEFOREMETHOD: {}, {}", Threads_IT.class.getName(), Thread.currentThread().getId());
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        LOG.info("AFTERMETHOD: {}, {}", Threads_IT.class.getName(), Thread.currentThread().getId());
    }

    @Test(groups = "THREAD")
    public void test1() {
        String text = "test1: " + Threads_IT.class.getName() + ", " + Thread.currentThread().getId();
        firstComponent.printSomething3(text, Threads_IT.class);
    }

    @Test(groups = "THREAD")
    public void test2() {
        String text = "test2: " + Threads_IT.class.getName() + ", " + Thread.currentThread().getId();
        firstComponent.printSomething3(text, Threads_IT.class);
    }

    @Test(groups = "THREAD")
    public void test3() {
        String text = "test3: " + Threads_IT.class.getName() + ", " + Thread.currentThread().getId();
        firstComponent.printSomething3(text, Threads_IT.class);
    }

    @Test(groups = "THREAD")
    public void test4() {
        String text = "test4: " + Threads_IT.class.getName() + ", " + Thread.currentThread().getId();
        firstComponent.printSomething3(text, Threads_IT.class);
    }

    @Test(groups = "THREAD")
    public void test5() {
        String text = "test5: " + Threads_IT.class.getName() + ", " + Thread.currentThread().getId();
        firstComponent.printSomething3(text, Threads_IT.class);
    }

    @Test(groups = "THREAD")
    public void test6() {
        String text = "test6: " + Threads_IT.class.getName() + ", " + Thread.currentThread().getId();
        firstComponent.printSomething3(text, Threads_IT.class);
    }

    @Test(groups = "THREAD")
    public void test7() {
        String text = "test7: " + Threads_IT.class.getName() + ", " + Thread.currentThread().getId();
        firstComponent.printSomething3(text, Threads_IT.class);
    }

    @Test(groups = "THREAD")
    public void test8() {
        String text = "test8: " + Threads_IT.class.getName() + ", " + Thread.currentThread().getId();
        firstComponent.printSomething3(text, Threads_IT.class);
    }

    @Test(groups = "THREAD")
    public void test9() {
        String text = "test9: " + Threads_IT.class.getName() + ", " + Thread.currentThread().getId();
        firstComponent.printSomething3(text, Threads_IT.class);
    }

    @Test(groups = "THREAD")
    public void test10() {
        String text = "test10: " + Threads_IT.class.getName() + ", " + Thread.currentThread().getId();
        firstComponent.printSomething3(text, Threads_IT.class);
    }
}
