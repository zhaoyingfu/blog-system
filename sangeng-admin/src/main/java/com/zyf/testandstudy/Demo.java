package com.zyf.testandstudy;

/**
 * @author Welfare
 * @version 1.0
 * @date 2022/5/24 15:19
 */
public class Demo {
    public static void main(String[] args) {
        Thread a = new Thread();
        System.out.println("我是默认线程优先级："+a.getPriority());
        Thread b = new Thread();
        b.setPriority(10);
        System.out.println("我是设置过的线程优先级："+b.getPriority());
    }
}

