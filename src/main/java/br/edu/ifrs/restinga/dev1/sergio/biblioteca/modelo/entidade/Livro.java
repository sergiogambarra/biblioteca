/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author sergio
 */
    
@Entity
public class Livro implements Entidade{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private int anoPublicacao;
    private boolean doacao;
    
    @ManyToMany
    private List<Editora> editora;
    
    @ManyToMany
    private List<Autor> autor;
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
}

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the anoPublicacao
     */
    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    /**
     * @param anoPublicacao the anoPublicacao to set
     */
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    /**
     * @return the doacao
     */
    public boolean isDoacao() {
        return doacao;
    }

    /**
     * @param doacao the doacao to set
     */
    public void setDoacao(boolean doacao) {
        this.doacao = doacao;
    }

    /**
     * @return the editora
     */
    public List<Editora> getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(List<Editora> editora) {
        this.editora = editora;
    }

    /**
     * @return the autor
     */
    public List<Autor> getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(List<Autor> autor) {
        this.autor = autor;
    }
    
    
    
}
