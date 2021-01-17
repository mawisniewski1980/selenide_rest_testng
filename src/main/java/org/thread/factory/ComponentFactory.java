package org.thread.factory;

import org.thread.components.FirstComponent;

public class ComponentFactory {


    public ComponentFactory() {
    }

    public FirstComponent getFirstComponent() {
        return new FirstComponent(this);
    }

}
