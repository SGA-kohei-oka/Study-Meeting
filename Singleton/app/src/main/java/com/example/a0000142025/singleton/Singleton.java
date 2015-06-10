package com.example.a0000142025.singleton;

import android.view.ScaleGestureDetector;

/**
 * Created by 0000142025 on 2015/06/10.
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    /**
     * テスト用の数値
     */
    public int testNum = 0;

    private Singleton() {
        System.out.println("一回きりのインスタンス生成");
    }

    /**
     * 一回きりのSingletonのインスタンス生成に使うゲッタメソッド
     * @return Singletonのインスタンス
     */
    public static Singleton getInstance() {
        return singleton;
    }

}
