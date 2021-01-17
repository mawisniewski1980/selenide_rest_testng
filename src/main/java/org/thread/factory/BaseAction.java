package org.thread.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseAction {

    protected static final Logger LOG = LoggerFactory.getLogger("Logger");

    public void printSomething(String text, Class clas) {
        LOG.info("BaseAction: {}, {}, {}", clas.getName(), Thread.currentThread().getId(), text);
    }
}
