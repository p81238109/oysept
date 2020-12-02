package com.oysept.state.thread;

public class Die extends ThreadState {
    private Context context;

    public void newState(Context context) {
        // 什么都不做
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
        System.out.println("当前线程处于死亡状态!");
    }
}
