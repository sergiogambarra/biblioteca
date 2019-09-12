/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.dao;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Telefone;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author sergio
 */
public interface TelefoneDAO extends CrudRepository<Telefone, Integer>{
    
}
