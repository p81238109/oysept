package com.oysept.state;

public class ConcreteStateB extends State {
    public void handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
