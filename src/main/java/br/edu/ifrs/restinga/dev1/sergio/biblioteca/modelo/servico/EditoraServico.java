/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.dao.EditoraDAO;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Editora;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn.EditoraRN;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn.RegraNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author default
 */
@Component
public class EditoraServico extends Servico<Editora> {

    @Autowired
    EditoraDAO dao;
    
    @Autowired
    EditoraRN regraNegocio;

    @Override
    public CrudRepository<Editora, Integer> getDAO() {
        return  dao;
    }

    @Override
    public RegraNegocio<Editora> getRegraNegocio() {
        return regraNegocio;
    }  
    
}
