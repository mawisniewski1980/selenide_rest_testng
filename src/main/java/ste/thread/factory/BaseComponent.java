package ste.thread.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseComponent {

    protected static final Logger LOG = LoggerFactory.getLogger("Logger");

    protected ComponentFactory componentFactory;
    protected BaseAction baseAction = new BaseAction();

    public BaseComponent(ComponentFactory componentFactory) {
        this.componentFactory = componentFactory;
    }
}
