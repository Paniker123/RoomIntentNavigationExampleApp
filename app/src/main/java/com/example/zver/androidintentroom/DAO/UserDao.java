package com.example.zver.androidintentroom.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.zver.androidintentroom.Model.User;

import java.util.List;

/**
 * Created by Zver on 01.03.2018.
 */

@Dao
public interface UserDao {
    @Query("SELECT * FROM user")
    List<User> getAll();

    @Query("SELECT * FROM user WHERE nick LIKE :userNick LIMIT 1")
    User findByNick(String userNick);

    @Insert
    boolean insertUser(User... users);
}
