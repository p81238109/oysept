package com.oysept.state.thread;

public class Context {
    private ThreadState threadState;
    public Context() {
        this.threadState = new New(); // 初始化为新建状态
    }

    public ThreadState getThreadState() {
        return threadState;
    }

    public void setThreadState(ThreadState threadState) {
        this.threadState = threadState;
    }

    public void newState() {
        threadState.newState(this);
    }

    public void readyState() {
        threadState.readyState(this);
    }

    public void runState() {
        threadState.runState(this);
    }

    public void waitState() {
        threadState.waitState(this);
    }

    public void dieState() {
        threadState.dieState(this);
    }
}
