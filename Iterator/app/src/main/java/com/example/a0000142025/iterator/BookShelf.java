package com.example.a0000142025.iterator;

import java.util.Iterator;

/**
 * Created by 0000142025 on 2015/06/22.
 */
public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;

    /**
     * Bookの配列を初期化するコンストラクタ
     * @param maxsize Bookの配列の要素数
     */
    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    /**
     * indexで指定した番号のBookを取得するゲッタメソッド
     * @param index 取得するBookの番号
     * @return indexで指定した番号のBook
     */
    public Book getBookAt(int index) {
        return books[index];
    }

    /**
     * 格納するBookを設定するメソッド
     * @param book 格納するBookオブジェクト
     */
    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    /**
     * 格納しているBookの総数を取得するゲッタメソッド
     * @return 格納しているBookの総数
     */
    public int getLength() {
        return last;
    }

    /**
     * BookShelfのIteratorを取得するメソッド
     * @return 取得するIterator
     */
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
