/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.dao.AutorDAO;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Autor;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn.AutorRN;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn.RegraNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author default
 */
@Component
public class AutorServico extends Servico<Autor> {

   
   @Autowired
    AutorDAO dao;
    
    @Autowired
    AutorRN regraNegocio;

    @Override
    public CrudRepository<Autor, Integer> getDAO() {
        return  dao;
    }

    @Override
    public RegraNegocio<Autor> getRegraNegocio() {
        return regraNegocio;
    }
    
    
}
