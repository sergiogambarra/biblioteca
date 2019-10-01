/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.dao.LivroDAO;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Autor;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Editora;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Livro;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn.LivroRN;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn.RegraNegocio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author sergio
 */
@Component
public class LivroServico extends Servico<Livro> {

    @Autowired
    LivroDAO dao;
    
    @Autowired
    LivroRN regraNegocio;
    
    @Autowired
    EmprestimoServico emprestimoServico;

    @Override
    public CrudRepository<Livro, Integer> getDAO() {
        return  dao;
    }

    @Override
    public RegraNegocio<Livro> getRegraNegocio() {
        return regraNegocio;
    }
    
    public Livro listarLivro(int idEmprestimo) throws Throwable {
        return emprestimoServico.recuperar(idEmprestimo).getLivro();
    }
    
    public List<Editora> listarEditora(int idLivro) throws Throwable {
        return this.recuperar(idLivro).getEditora();
    }
    
    public List<Autor> listarAutores(int idLivro) throws Throwable {
        return this.recuperar(idLivro).getAutor();
    }
    
    public void associarAutor(int idLivro, Autor autor) throws Throwable {
        Livro livro = this.recuperar(idLivro);
        livro.getAutor().add(autor);
        dao.save(livro);
    }
}
