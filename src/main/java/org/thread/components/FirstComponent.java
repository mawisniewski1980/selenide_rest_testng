package org.thread.components;

import org.thread.factory.BaseComponent;
import org.thread.factory.ComponentFactory;

public class FirstComponent extends BaseComponent {

    private FirstComponentAction action = new FirstComponentAction(baseAction);

    public FirstComponent(ComponentFactory componentFactory) {
        super(componentFactory);
    }

    public void printSomething3(String text, Class clas) {
        action.printSomenthing2(text, clas);
    }
}
