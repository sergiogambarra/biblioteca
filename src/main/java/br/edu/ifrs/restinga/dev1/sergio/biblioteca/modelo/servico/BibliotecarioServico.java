/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.dao.BibliotecarioDAO;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.dao.EmprestimoDAO;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Bibliotecario;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Emprestimo;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn.BibliotecarioRN;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn.RegraNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author default
 */
@Component
public class BibliotecarioServico extends Servico<Bibliotecario> {

    @Autowired
    BibliotecarioDAO dao;
    
    @Autowired
    BibliotecarioRN regraNegocio;
    
    @Autowired
    EmprestimoDAO emprestimoDAO;
    
    
  //  public void associarBibliotecario(int idEmprestimo, Bibliotecario bibliotecario) throws Throwable {
  //      
  //      Emprestimo emprestimo = this.recuperar(idEmprestimo);
  //      emprestimo.setBibliotecario(bibliotecario);
  //      emprestimoDAO.save(emprestimo);
  //  }

    @Override
    public CrudRepository<Bibliotecario, Integer> getDAO() {
        return  dao;
    }

    @Override
    public RegraNegocio<Bibliotecario> getRegraNegocio() {
        return regraNegocio;
    }
    
}
