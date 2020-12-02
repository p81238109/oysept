package com.oysept.state.thread;

public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.newState();
        context.readyState();
        context.runState();
        context.waitState();
        context.dieState();
    }
}
