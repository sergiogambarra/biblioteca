/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.controle;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Autor;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico.AutorServico;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico.Servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author default
 */

    
@RestController
@RequestMapping("/api/autores/")
public class Autores extends CRUDControle<Autor> {
        @Autowired
        AutorServico autorServico;
    
        @Override
        public Servico<Autor> getService() {
            return autorServico;
        }
    
 //   @PostMapping("/livros/")
 //   @ResponseStatus(HttpStatus.CREATED)
 //   public Livro cadastrarLivro(@RequestBody Bibliotecario bibliotecario) {
 //       return bibliotecarioServico.cadastrar(livro);
  //  }
    
//    @GetMapping("/livros/")
//    @ResponseStatus(HttpStatus.OK)
//    public Iterable<Livro> listarLivros() {
//    return livroServico.listar();
//    }
    
 //   @GetMapping("/livros/{idLivro}")
 //   @ResponseStatus(HttpStatus.OK)
 //   public Livro recuperarLivro(@PathVariable int idLivro) throws Throwable {
 //       return livroServico.recuperar(idLivro);
 //   }

    
    


    
}
