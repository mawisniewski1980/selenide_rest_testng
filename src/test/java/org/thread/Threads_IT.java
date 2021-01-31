package org.thread;

import org.BaseThreadTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Threads_IT extends BaseThreadTest {

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        LOG.info("BEFOREMETHOD: {}, {}", Threads_IT.class.getName(), Thread.currentThread().getId());
        initComponents();
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        LOG.info("AFTERMETHOD: {}, {}", Threads_IT.class.getName(), Thread.currentThread().getId());
    }

    @Test(groups = "THREAD")
    public void test1() {
        firstComponent.printSomething3("test1= " + firstComponent.get(1), Threads_IT.class);
    }

    @Test(groups = "THREAD")
    public void test2() {
        firstComponent.printSomething3("test2= " + firstComponent.get(2), Threads_IT.class);
    }

    @Test(groups = "THREAD")
    public void test3() {
        firstComponent.printSomething3("test3= " + firstComponent.get(3), Threads_IT.class);
    }

    @Test(groups = "THREAD")
    public void test4() {
        firstComponent.printSomething3("test4= " + firstComponent.get(4), Threads_IT.class);
    }

    @Test(groups = "THREAD")
    public void test5() {
        firstComponent.printSomething3("test5= " + firstComponent.get(5), Threads_IT.class);
    }

    @Test(groups = "THREAD")
    public void test6() {
        firstComponent.printSomething3("test6= " + firstComponent.get(6), Threads_IT.class);
    }

    @Test(groups = "THREAD")
    public void test7() {
        firstComponent.printSomething3("test7= " + firstComponent.get(7), Threads_IT.class);
    }

    @Test(groups = "THREAD")
    public void test8() {
        firstComponent.printSomething3("test8= " + firstComponent.get(8), Threads_IT.class);
    }

    @Test(groups = "THREAD")
    public void test9() {
        firstComponent.printSomething3("test9= " + firstComponent.get(9), Threads_IT.class);
    }

    @Test(groups = "THREAD")
    public void test10() {
        firstComponent.printSomething3("test10= " + firstComponent.get(10), Threads_IT.class);
    }
}
