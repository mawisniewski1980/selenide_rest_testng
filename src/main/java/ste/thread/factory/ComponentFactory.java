package ste.thread.factory;

import ste.thread.components.FirstComponent;

public class ComponentFactory {


    public ComponentFactory() {
    }

    public FirstComponent getFirstComponent() {
        return new FirstComponent(this);
    }

}
