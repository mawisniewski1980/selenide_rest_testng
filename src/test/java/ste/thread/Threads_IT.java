package ste.thread;

import ste.BaseThreadTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ste.thread.components.FirstComponent;

public class Threads_IT extends BaseThreadTest {

    FirstComponent firstComponent;

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        LOG.info("BEFOREMETHOD: {}, {}", Threads_IT.class.getName(), Thread.currentThread().getId());
        firstComponent = getFactory().getFirstComponent();
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        LOG.info("AFTERMETHOD: {}, {}", Threads_IT.class.getName(), Thread.currentThread().getId());
    }

    @Test(groups = "THREAD")
    public void test1() {
        //threads.setString("1", "1");
        //int value = firstComponent.get(Integer.parseInt(threads.getString("1")));
        firstComponent.printSomething3("test1= " + firstComponent.get(1), Threads_IT.class);
    }

    @Test(groups = "THREAD")
    public void test2() {
        //threads.setString("2", "2");
        //int value = firstComponent.get(Integer.parseInt(threads.getString("2")));
        firstComponent.printSomething3("test2= " + firstComponent.get(2), Threads_IT.class);
    }

    @Test(groups = "THREAD")
    public void test3() {
        //threads.setString("3", "3");
        //int value = firstComponent.get(Integer.parseInt(threads.getString("3")));
        firstComponent.printSomething3("test3= " + firstComponent.get(3), Threads_IT.class);
    }

    @Test(groups = "THREAD")
    public void test4() {
        //threads.setString("4", "4");
        //int value = firstComponent.get(Integer.parseInt(threads.getString("4")));
        firstComponent.printSomething3("test4= " + firstComponent.get(4), Threads_IT.class);
    }

    @Test(groups = "THREAD")
    public void test5() {
        //threads.setString("5", "5");
        //int value = firstComponent.get(Integer.parseInt(threads.getString("5")));
        firstComponent.printSomething3("test5= " + firstComponent.get(5), Threads_IT.class);
    }

    @Test(groups = "THREAD")
    public void test6() {
        //threads.setString("6", "6");
        //int value = firstComponent.get(Integer.parseInt(threads.getString("6")));
        firstComponent.printSomething3("test6= " + firstComponent.get(6), Threads_IT.class);
    }

    @Test(groups = "THREAD")
    public void test7() {
        //threads.setString("7", "7");
        //int value = firstComponent.get(Integer.parseInt(threads.getString("7")));
        firstComponent.printSomething3("test7= " + firstComponent.get(7), Threads_IT.class);
    }

    @Test(groups = "THREAD")
    public void test8() {
        //threads.setString("8", "8");
        //int value = firstComponent.get(Integer.parseInt(threads.getString("8")));
        firstComponent.printSomething3("test8= " + firstComponent.get(8), Threads_IT.class);
    }

    @Test(groups = "THREAD")
    public void test9() {
        //threads.setString("9", "9");
        //int value = firstComponent.get(Integer.parseInt(threads.getString("9")));
        firstComponent.printSomething3("test9= " + firstComponent.get(9), Threads_IT.class);
    }

    @Test(groups = "THREAD")
    public void test10() {
        //threads.setString("10", "10");
        //int value = firstComponent.get(Integer.parseInt(threads.getString("10")));
        firstComponent.printSomething3("test10= " + firstComponent.get(10), Threads_IT.class);
    }
}
