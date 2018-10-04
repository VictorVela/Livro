package com.example.opet.livro.activity.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.opet.livro.R;

public class MainActivity extends AppCompatActivity {

    private ListView        listaLivros;
    //private LivroRepository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
