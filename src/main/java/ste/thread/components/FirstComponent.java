package ste.thread.components;

import ste.thread.factory.BaseComponent;
import ste.thread.factory.ComponentFactory;

public class FirstComponent extends BaseComponent {

    private final FirstComponentAction action = new FirstComponentAction(baseAction);

    public FirstComponent(ComponentFactory componentFactory) {
        super(componentFactory);
    }

    public void printSomething3(String text, Class clas) {
        action.printSomenthing2(text, clas);
    }

    public int get(int add) {
        return action.getValue(add);
    }
}
