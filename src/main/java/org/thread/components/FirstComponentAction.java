package org.thread.components;

import org.thread.factory.BaseAction;

public class FirstComponentAction {

    private BaseAction baseAction;

    public FirstComponentAction(BaseAction baseAction) {
        this.baseAction = baseAction;
    }

    public void printSomenthing2(String text, Class clas) {
        baseAction.printSomething(text, clas);
    }
}
