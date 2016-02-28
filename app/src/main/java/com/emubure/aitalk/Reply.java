package com.emubure.aitalk;

import android.content.Context;

import com.activeandroid.Model;
import com.activeandroid.query.Select;

/**
 * Created by Ray on 2016/02/28.
 */
public class Reply extends Model {
    Context c;

    public Reply(Context con) {
        c = con;
    }

    public static String aiReply;

    public void search(String word) {
        Patterns Patterns = new Select().from(Patterns.class).where("word LIKE ?", word).executeSingle();
        aiReply = Patterns.reply.toString();
    }
}
