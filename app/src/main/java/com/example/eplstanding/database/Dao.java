package com.example.eplstanding.database;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@androidx.room.Dao
public interface Dao {

    @Query("Select * from " + Entity.TABLE_NAME + " Order by rank asc")
    List<Entity> getAllData();
    @Insert
    void insert(Entity entity);
    @Update
    void update(Entity entity);
    @Delete
    void delete(Entity entity);
}
