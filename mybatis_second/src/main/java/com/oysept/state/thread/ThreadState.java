package com.oysept.state.thread;

public abstract class ThreadState {
    // 新建
    public abstract void newState(Context context);

    // 就绪
    public abstract void readyState(Context context);

    // 运行
    public abstract void runState(Context context);

    // 阻塞
    public abstract void waitState(Context context);

    // 死亡
    public abstract void dieState(Context context);
}
