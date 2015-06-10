package com.example.a0000142025.templatemethod;

/**
 * Created by 0000142025 on 2015/06/10.
 */
public abstract class AbstractClass {
    public abstract void abstractMethod();
    public final void templateMethod() {
        abstractMethod();
        System.out.println("ここは共通して実行される");
    }
}
