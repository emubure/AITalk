package com.emubure.aitalk;

import android.content.Context;

import com.activeandroid.Model;
import com.activeandroid.query.Select;


public class Reply{
    Context con;

    public Reply(Context c) {
        con = c;
    }

    public static String aiReply;

    public void search(String word) {
        Patterns patterns = new Select().from(Patterns.class).where("word LIKE ?", word).executeSingle();
        aiReply = patterns.reply.toString();
    }
}
