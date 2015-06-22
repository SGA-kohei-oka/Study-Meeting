package com.example.a0000142025.iterator;


/**
 * Created by 0000142025 on 2015/06/22.
 */
public class Book {
    private String name;

    /**
     * Bookを初期化するコンストラクタ
     * @param name Bookの名前とする文字列
     */
    public Book(String name) {
        this.name = name;
    }

    /**
     * Bookの名前を取得するゲッタメソッド
     * @return name 取得するBookの名前の文字列
     */
    public String getName() {
        return name;
    }
}
