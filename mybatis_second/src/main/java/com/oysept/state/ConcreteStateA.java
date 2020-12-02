package com.oysept.state;

public class ConcreteStateA extends State {
    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
