package com.emubure.aitalk;

import android.content.Context;

import com.activeandroid.Model;

public class Memory {

    Context c;

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
