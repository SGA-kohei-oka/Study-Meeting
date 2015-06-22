package com.example.a0000142025.iterator;

import android.support.annotation.StringRes;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by 0000142025 on 2015/06/22.
 */
public class IterableBookShelf implements Iterable<Book> {
    private ArrayList<Book> arrayList = new ArrayList<Book>();

    /**
     * 格納するBookを設定するメソッド
     * @param book 格納するBookオブジェクト
     */
    public void appendBook(Book book) {
        arrayList.add(book);
    }

    /**
     * IterableBookShelfのIteratorを取得するメソッド
     * @return 取得するIterator
     */
    public Iterator<Book> iterator() {
        return arrayList.iterator();
    }

}
