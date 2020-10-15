package com.csquare.roomDatabase;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Users.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UsersDao usersDao();
}
