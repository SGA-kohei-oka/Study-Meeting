package com.example.a0000142025.singleton;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Singletonのインスタンス生成
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        //値の代入テスト
        System.out.println("obj1.testNum = " + String.valueOf(obj1.getNextTestNum()));
        System.out.println("obj2.testNum = " + String.valueOf(obj2.getNextTestNum()));
        System.out.println("obj1.testNum = " + String.valueOf(obj1.getNextTestNum()));
        System.out.println("obj2.testNum = " + String.valueOf(obj2.getNextTestNum()));

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
