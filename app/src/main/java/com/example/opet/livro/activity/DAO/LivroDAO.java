package com.example.opet.livro.activity.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.opet.livro.activity.model.Livro;

import java.util.List;

/**
 * Created by opet on 03/10/2018.
 */

@Dao
public interface LivroDAO {

    @Insert
    void insert(Livro livro);

    @Query("DELETE FROM livro_table where livro_table.ID == :id")
    void delete(long id);

    @Query("SELECT * from livro_table ORDER BY avaliacao DESC")
    List<Livro> loadLivro();


}
