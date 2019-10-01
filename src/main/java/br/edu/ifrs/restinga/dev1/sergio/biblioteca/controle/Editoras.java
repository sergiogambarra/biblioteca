/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.controle;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Editora;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico.EditoraServico;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico.Servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author default
 */

@RestController
@RequestMapping("/api/editoras/")
public class Editoras extends CRUDControle<Editora> {
        @Autowired
        EditoraServico servico;
    
        @Override
        public Servico<Editora> getService() {
            return servico;
        }
    
}
