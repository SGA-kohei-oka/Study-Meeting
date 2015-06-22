package com.example.a0000142025.iterator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //要素数4のBookShelfのインスタンスを生成
        BookShelf bookShelf = new BookShelf(4);

        bookShelf.appendBook(new Book("A"));
        bookShelf.appendBook(new Book("B"));
        bookShelf.appendBook(new Book("C"));
        bookShelf.appendBook(new Book("D"));

        Iterator itr = bookShelf.iterator();
        while(itr.hasNext()) {
            Book book = (Book)itr.next();
            System.out.println(book.getName());
        }


        // Iterableを利用した場合
        IterableBookShelf iBookShelf = new IterableBookShelf();

        iBookShelf.appendBook(new Book("E"));
        iBookShelf.appendBook(new Book("F"));
        iBookShelf.appendBook(new Book("G"));
        iBookShelf.appendBook(new Book("H"));

        for(Book book: iBookShelf) {    //自動的にiBookShelf.iterator()
            System.out.println(book.getName());
        }



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
