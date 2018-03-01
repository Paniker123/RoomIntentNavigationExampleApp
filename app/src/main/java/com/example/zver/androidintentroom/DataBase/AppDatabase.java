package com.example.zver.androidintentroom.DataBase;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.zver.androidintentroom.DAO.UserDao;
import com.example.zver.androidintentroom.Model.User;

/**
 * Created by Zver on 01.03.2018.
 */
@Database(entities = {User.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}
