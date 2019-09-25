/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Autor;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn.RegraNegocio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author default
 */
@Component
public class AutorServico extends Servico<Autor> {

    @Override
    public CrudRepository<Autor, Integer> getDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RegraNegocio<Autor> getRegraNegocio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
