/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.dao.UsuarioDAO;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Usuario;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn.RegraNegocio;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn.UsuarioRN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author sergio
 */

@Component
public class UsuarioServico extends Servico<Usuario> {

    @Autowired
    UsuarioDAO dao;
    
    @Autowired
    UsuarioRN regraNegocio;

    @Override
    public CrudRepository<Usuario, Integer> getDAO() {
        return  dao;
    }

    @Override
    public RegraNegocio<Usuario> getRegraNegocio() {
        return regraNegocio;
    }  

    
}
