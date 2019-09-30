/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.controle;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Autor;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Livro;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico.AutorServico;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico.LivroServico;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico.Servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author default
 */

@RestController
@RequestMapping("/api/livros/")
public class Livros extends CRUDControle<Livro> {
    
    @Autowired
    LivroServico servico;
    
    @Override
    public Servico<Livro> getService() {
        return servico;
    }
    
    @Autowired
    AutorServico servicoAutores;
    
  //  @Override
  //  public Servico<Autor> getService() {
  //      return servicoAutores;
  //  }
    
    @RequestMapping(path = "/{idLivros}/autores/", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void associarAutor(@PathVariable int idLivro, @RequestBody Autor autor) throws Throwable {
        servico.associarAutor(idLivro, autor);
        
    }
    
//    @PostMapping("/livros/")
//    @ResponseStatus(HttpStatus.CREATED)
//    public Livro cadastrarLivro(@RequestBody Livro livro) {
//        return livroServico.cadastrar(livro);
//}
    
    @GetMapping("/{idLivros}/autores/")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Autor> listarAutores() {
        return servicoAutores.listar();
         //       return servicoAutores.getDAO().findById(idLivro)
    }
    
 //   @GetMapping("/livros/{idLivro}")
 //   @ResponseStatus(HttpStatus.OK)
 //   public Livro recuperarLivro(@PathVariable int idLivro) throws Throwable {
 //       return livroServico.recuperar(idLivro);
 //   }

    
    
    
    
}
