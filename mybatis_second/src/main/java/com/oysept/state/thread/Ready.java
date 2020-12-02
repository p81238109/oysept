package com.oysept.state.thread;

public class Ready extends ThreadState {
    private Context context;

    public void newState(Context context) {
        // 什么都不做
    }

    public void readyState(Context context) {
        System.out.println("当前线程处于就绪状态!");
        context.setThreadState(new Run());
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
