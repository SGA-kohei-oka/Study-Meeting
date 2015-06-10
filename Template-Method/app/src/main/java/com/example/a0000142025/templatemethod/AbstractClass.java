package com.example.a0000142025.templatemethod;

/**
 * Created by 0000142025 on 2015/06/10.
 */
public abstract class AbstractClass {
    /**
     * 継承する具象クラスによって異なる処理を行う抽象メソッド
     */
    protected abstract void abstractMethod();

    /**
     * 継承する全具象クラスで共通する処理を行うテンプレートメソッド
     */
    public final void templateMethod() {
        abstractMethod();
        System.out.println("ここは共通して実行される");
    }
}
