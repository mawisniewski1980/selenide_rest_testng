package org.thread;

import org.BaseThreadTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Threads2_IT extends BaseThreadTest {

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        LOG.info("BEFOREMETHOD: {}, {}", Threads2_IT.class.getName(), Thread.currentThread().getId());
    }

    @BeforeMethod(alwaysRun = true)
    public void afterMethod() {
        LOG.info("AFTERMETHOD: {}, {}", Threads2_IT.class.getName(), Thread.currentThread().getId());
    }

    @Test(groups = "THREAD")
    public void test1() {
        String text = "test1: " + Threads2_IT.class.getName() + ", " + Thread.currentThread().getId();
        firstComponent.printSomething3(text, Threads2_IT.class);
    }

    @Test(groups = "THREAD")
    public void test2() {
        String text = "test2: " + Threads2_IT.class.getName() + ", " + Thread.currentThread().getId();
        firstComponent.printSomething3(text, Threads2_IT.class);
    }

    @Test(groups = "THREAD")
    public void test3() {
        String text = "test3: " + Threads2_IT.class.getName() + ", " + Thread.currentThread().getId();
        firstComponent.printSomething3(text, Threads2_IT.class);
    }

    @Test(groups = "THREAD")
    public void test4() {
        String text = "test4: " + Threads2_IT.class.getName() + ", " + Thread.currentThread().getId();
        firstComponent.printSomething3(text, Threads2_IT.class);
    }

    @Test(groups = "THREAD")
    public void test5() {
        String text = "test5: " + Threads2_IT.class.getName() + ", " + Thread.currentThread().getId();
        firstComponent.printSomething3(text, Threads2_IT.class);
    }

    @Test(groups = "THREAD")
    public void test6() {
        String text = "test6: " + Threads2_IT.class.getName() + ", " + Thread.currentThread().getId();
        firstComponent.printSomething3(text, Threads2_IT.class);
    }

    @Test(groups = "THREAD")
    public void test7() {
        String text = "test7: " + Threads2_IT.class.getName() + ", " + Thread.currentThread().getId();
        firstComponent.printSomething3(text, Threads2_IT.class);
    }

    @Test(groups = "THREAD")
    public void test8() {
        String text = "test8: " + Threads2_IT.class.getName() + ", " + Thread.currentThread().getId();
        firstComponent.printSomething3(text, Threads2_IT.class);
    }

    @Test(groups = "THREAD")
    public void test9() {
        String text = "test9: " + Threads2_IT.class.getName() + ", " + Thread.currentThread().getId();
        firstComponent.printSomething3(text, Threads2_IT.class);
    }

    @Test(groups = "THREAD")
    public void test10() {
        String text = "test10: " + Threads2_IT.class.getName() + ", " + Thread.currentThread().getId();
        firstComponent.printSomething3(text, Threads2_IT.class);
    }

}
