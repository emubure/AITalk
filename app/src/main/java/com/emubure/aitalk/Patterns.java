package com.emubure.aitalk;

import android.content.Context;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;


@Table(name = "Patterns")
public class Patterns extends Model{


    @Column(name = "word")
    public String word;
    @Column(name = "reply")
    public String reply;

    public Patterns() {
        super();
    }
}