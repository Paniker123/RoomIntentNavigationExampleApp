package com.example.zver.androidintentroom.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Zver on 01.03.2018.
 */

@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "nick")
    private String nick;

    @ColumnInfo(name = "password")
    private String password;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
