/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.dao.TelefoneDAO;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Telefone;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn.RegraNegocio;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn.TelefoneRN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author sergio
 */

@Component
public class TelefoneServico extends Servico<Telefone> {

    @Autowired
    TelefoneDAO dao;
    
    @Autowired
    TelefoneRN regraNegocio;

    @Override
    public CrudRepository<Telefone, Integer> getDAO() {
        return  dao;
    }

    @Override
    public RegraNegocio<Telefone> getRegraNegocio() {
        return regraNegocio;
    }      

    
}
