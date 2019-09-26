/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.controle;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Bibliotecario;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Emprestimo;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Livro;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Usuario;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico.EmprestimoServico;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico.LivroServico;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico.Servico;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico.UsuarioServico;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sergio
 */

@RestController
@RequestMapping("/api/emprestimos/")
public class Emprestimos extends CRUDControle<Emprestimo> {
    
    @Autowired
    EmprestimoServico emprestimoServico;
    
    @Autowired
    LivroServico livroServico;
    
    @Autowired
    UsuarioServico usuarioServico;

    public Servico<Emprestimo> getService() {
        return emprestimoServico;
    }
    
    @RequestMapping(path = "/{idEmprestimo}/bibliotecarios/", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void associarBibliotecario(@PathVariable int idEmprestimo, @RequestBody Bibliotecario bibliotecario) throws Throwable {
       // servico.associarBibliotecario(idEmprestimo, fornecedor);
        
    }

    @DeleteMapping("/{idEmprestimo}/bibliotecarios/{idBibliotecario}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void desassociarBibliotecario(@PathVariable int idEmprestimo, @PathVariable int idBibliotecario) throws Throwable {
     //    servico.desassociarBibliotecario(idEmprestimo,idBibliotecario);
    }

    
    @RequestMapping(path = "/{idEmprestimo}/bibliotecarios/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Bibliotecario> listarBibliotecario(@PathVariable int idEmprestimo) throws Throwable {
    //    return this.recuperarBibliotecario(idEmprestimo).idBibliotecario();
        return null;
    }
    
    @GetMapping("/{idEmprestimo}/bibliotecarios/{idBibliotecario}")
    @ResponseStatus(HttpStatus.OK)
    public Bibliotecario recuperarBibliotecario(@PathVariable int idEmprestimo, @PathVariable int idBibliotecario) throws Throwable {
     //   return servico.recuperarBibliotecario(idEmprestimo,idBibliotecario);
        return null;
    }
    
    @RequestMapping(path = "/{idEmprestimo}/livros/", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void associarLivro(@PathVariable int idEmprestimo, @RequestBody Livro livro) throws Throwable {
       // servico.associarLivro(idEmprestimo, fornecedor);
        
    }

    @DeleteMapping("/{idEmprestimo}/livros/{idLivro}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void desassociarLivro(@PathVariable int idEmprestimo, @PathVariable int idLivro) throws Throwable {
     //    servico.desassociarLivro(idEmprestimo,idLivro);
    }

    
    @RequestMapping(path = "/{idEmprestimo}/livro/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Livro listarLivro(@PathVariable int idEmprestimo) throws Throwable {
        return livroServico.listarLivro(idEmprestimo);
        
    }
    
    @RequestMapping(path = "/{idEmprestimo}/usuarios/", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void associarUsuario(@PathVariable int idEmprestimo, @RequestBody Usuario usuario) throws Throwable {
       // servico.associarUsuario(idEmprestimo, usuario);
        
    }

    @DeleteMapping("/{idEmprestimo}/usuarios/{idUsuario}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void desassociarUsuario(@PathVariable int idEmprestimo, @PathVariable int idUsuario) throws Throwable {
     //    servico.desassociarUsuario(idEmprestimo,idUsuario);
    }

    
    @RequestMapping(path = "/{idEmprestimo}/usuarios/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Usuario listarUsuario(@PathVariable int idEmprestimo) throws Throwable {
     //   return usuarioServico.recuperarUsuario(idEmprestimo).idUsuario();
        return null;
    }
    
    @GetMapping("/{idEmprestimo}/usuarios/{idUsuario}")
    @ResponseStatus(HttpStatus.OK)
    public Usuario recuperarUsuario(@PathVariable int idEmprestimo, @PathVariable int idUsuario) throws Throwable {
     //   return servico.recuperarUsuario(idEmprestimo,idUsuario);
        return null;
    }
    
}
