package com.example.opet.livro.activity.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.opet.livro.activity.DAO.LivroDAO;
import com.example.opet.livro.activity.model.Livro;

/**
 * Created by opet on 03/10/2018.
 */
@Database(entities = {Livro.class},version = 1)
public abstract class LivroRoomDatabase extends RoomDatabase {
    private static volatile LivroRoomDatabase INSTANCE;
    public abstract LivroDAO livroDAO();

    public static LivroRoomDatabase getDarabese (final Context context){
        if(INSTANCE == null){
            synchronized (LivroRoomDatabase.class){
                if(INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),LivroRoomDatabase.class,"filme_database").allowMainThreadQueries().build();
                }
            }
        }
        return INSTANCE;
    }
}
