package com.emubure.aitalk;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
    private InputMethodManager inputMethodManager;
    private TextView aiText;
    private EditText meText;

    Memory memory;
    Reply reply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aiText = (TextView) findViewById(R.id.AIText);
        meText = (EditText) findViewById(R.id.meText);

        Context testContext = getApplicationContext();
        Log.d("MainActivity", testContext.toString());

        reply = new Reply(getApplicationContext());

        memory.setData();

        inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        //Log.d("MainActivity","success1");
        meText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    //キーボードで閉じる
                    inputMethodManager.hideSoftInputFromWindow(meText.getWindowToken(), InputMethodManager.RESULT_UNCHANGED_SHOWN);
                    //反応処理
                    reply.search(meText.toString());//meTextで検索
                    aiText.setText(reply.aiReply);//検索結果をaiTextに

                    return true;
                }
                return false;
            }
        });
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