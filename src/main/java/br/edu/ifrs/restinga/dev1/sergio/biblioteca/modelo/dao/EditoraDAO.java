/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.dao;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Editora;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author default
 */
public interface EditoraDAO extends CrudRepository<Editora, Integer>{
    
}
