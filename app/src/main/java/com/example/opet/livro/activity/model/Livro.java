package com.example.opet.livro.activity.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by opet on 03/10/2018.
 */
@Entity(tableName = "livro_table")
public class Livro {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    private  long   id;
    private  String titulo;
    private  String genero;
    private  int    ano_produção;
    private  int    avaliação;

    public Livro(){

    }

    public Livro(long id, String titulo, String genero, int ano_produção, int avaliação) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.ano_produção = ano_produção;
        this.avaliação = avaliação;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno_produção() {
        return ano_produção;
    }

    public void setAno_produção(int ano_produção) {
        this.ano_produção = ano_produção;
    }

    public int getAvaliação() {
        return avaliação;
    }

    public void setAvaliação(int avaliação) {
        this.avaliação = avaliação;
    }
}
