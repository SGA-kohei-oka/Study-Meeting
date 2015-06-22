package com.example.a0000142025.iterator;

import java.util.Iterator;
import java.util.Objects;


/**
 * Created by 0000142025 on 2015/06/22.
 */
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    /**
     * Iteratorを初期化するコンストラクタ
     * @param bookShelf Aggregateとなるオブジェクト
     */
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    /**
     * 次のBookオブジェクトがあるかどうかを返すメソッド
     * @return 次のBookオブジェクトがあればtrue、無ければfalse
     */
    public boolean hasNext() {
        if(index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 次のBookオブジェクトを返すメソッド
     * @return 次のBookオブジェクト
     */
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }

    public void remove() {}

}
