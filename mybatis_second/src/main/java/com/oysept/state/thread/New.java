package com.oysept.state.thread;

public class New extends ThreadState {
    public void newState(Context context) {
        System.out.println("当前线程处于新建状态!");
        context.setThreadState(new Ready());
    }

    public void readyState(Context context) {
        // 什么都不做
    }

    public void runState(Context context) {
        // 什么都不做
    }

    public void waitState(Context context) {
        // 什么都不做
    }

    public void dieState(Context context) {
        // 什么都不做
    }
}
