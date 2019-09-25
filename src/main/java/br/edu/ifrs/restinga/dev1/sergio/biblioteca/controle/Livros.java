/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.controle;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Livro;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico.LivroServico;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico.Servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author default
 */

@RestController
@RequestMapping("/api")
public class Livros {
    
    @Autowired
    LivroServico livroServico;
    
    @PostMapping("/livros/")
    @ResponseStatus(HttpStatus.CREATED)
    public Livro cadastrarLivro(@RequestBody Livro livro) {
        return livroServico.cadastrar(livro);
}
    
    @GetMapping("/livros/")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Livro> listarLivros() {
    return livroServico.listar();
    }
    
}
