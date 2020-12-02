package com.oysept.state;

public class TestState {
    public static void main(String[] args) {

        // 初始化状态为A
        Context context = new Context(new ConcreteStateA());
        context.request();
        context.request();
        context.request();

        System.out.println("bbbbb");
        System.out.println("bbbbb");
        System.out.println("bbbbb");
        System.out.println("bbbbb");
        System.out.println("bbbbb");
        System.out.println("bbbbb");
    }
}
