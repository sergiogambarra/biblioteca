/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.dao.EmprestimoDAO;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Emprestimo;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn.EmprestimoRN;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn.RegraNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author sergio
 */
@Component
public class EmprestimoServico extends Servico<Emprestimo> {
    @Autowired
    EmprestimoDAO dao;
    
    @Autowired
    EmprestimoRN regraNegocio;

    @Override
    public CrudRepository<Emprestimo, Integer> getDAO() {
        return  dao;
    }

    @Override
    public RegraNegocio<Emprestimo> getRegraNegocio() {
        return regraNegocio;
    }  
    
}
