package com.example.opet.livro.activity.repository;

import android.content.Context;
import android.os.AsyncTask;

import com.example.opet.livro.activity.DAO.LivroDAO;
import com.example.opet.livro.activity.database.LivroRoomDatabase;
import com.example.opet.livro.activity.model.Livro;

import java.util.List;

/**
 * Created by opet on 03/10/2018.
 */

public class LivroRepository {
    private LivroDAO mLivroDAO;
    private List<Livro> mLivros;

    public LivroRepository(Context context){
        LivroRoomDatabase db = LivroRoomDatabase.getDarabese(context);
        mLivroDAO = db.livroDAO();
        mLivros = mLivroDAO.loadLivro();
    }

    public  List<Livro> getAllLivros() {return mLivros;}

    public void insert(Livro livro) {new insertAsyncTask(mLivroDAO).execute(livro);}

    private static class insertAsyncTask extends AsyncTask<Livro,Void,Void>{

        private LivroDAO mAsyncTaskDAO;

        insertAsyncTask(LivroDAO dao){
            mAsyncTaskDAO = dao;
        }

        @Override
        protected  Void doInBackground(final Livro... params){
            mAsyncTaskDAO.insert(params[0]);
            return null;
        }
    }
}
