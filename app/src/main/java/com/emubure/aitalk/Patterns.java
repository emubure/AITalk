package com.emubure.aitalk;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by Ray on 2016/02/28.
 */
@Table(name = "Patterns")
public class Patterns extends Model {


    @Column(name = "word")
    public String word;
    @Column(name = "reply")
    public String reply;

    public Patterns() {
        super();
    }
}
