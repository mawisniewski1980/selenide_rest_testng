package ste.thread.components;

import ste.thread.factory.BaseAction;

public class FirstComponentAction {

    private final BaseAction baseAction;
    private int value = 10;

    FirstComponentAction(BaseAction baseAction) {
        this.baseAction = baseAction;
    }

    void printSomenthing2(String text, Class clas) {
        baseAction.printSomething(text, clas);
    }

    public int getValue(int add) {
        addValue(add);
        return value;
    }

    private void addValue(int add) {
        value = value + add;
    }
}
