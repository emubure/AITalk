package com.emubure.aitalk;

import android.content.Context;

import com.activeandroid.Model;

/**
 * Created by Ray on 2016/02/28.
 */
public class Memory extends Model {

    Context c;

    public Memory() {
    }

    public Memory(Context con) {
        c = con;
    }

    public void i(String word, String reply) {
        Patterns Patterns = new Patterns();
        Patterns.word = word;
        Patterns.reply = reply;
        Patterns.save();
    }

    public void setData() {
        i("‚¨‚Í‚æ‚¤", "‚¨‚Í‚æ‚¤‚²‚´‚¢‚Ü‚·");
    }


}
