/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.controle;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Telefone;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Usuario;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico.Servico;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico.UsuarioServico;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sergio
 */

@RestController
@RequestMapping("/api/usuarios")
public class Usuarios extends CRUDControle<Usuario>{
    
    @Autowired
    UsuarioServico usuarioServico;
    
    @Override
    public Servico<Usuario> getService() {
        return usuarioServico;
    }
    
    @PostMapping("/usuarios/")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario cadastrarTelefone(@RequestBody Usuario telefone) {
        return usuarioServico.cadastrar(telefone);
    }
    
    @GetMapping("/usuarios/")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Usuario> listarGeneros() {
    return usuarioServico.listar();
    }
    
    @PostMapping("/{idUsuario}/telefones/")
    @ResponseStatus(HttpStatus.CREATED)
    public Telefone cadastrarTelefone(@PathVariable int idUsuario, @RequestBody Telefone telefone) throws Throwable {
        return usuarioServico.cadastrarTelefone(idUsuario, telefone);
    }  

    @PutMapping("/{idUsuario}/telefones/{idTelefone}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizarTelefone(@PathVariable int idUsuario, @PathVariable int idTelefone, @RequestBody Telefone telefone) throws Throwable {
        telefone.setId(idTelefone);
        usuarioServico.atualizarTelefone(idTelefone, telefone);
    }
    
    @DeleteMapping("/{idUsuario}/telefones/{idTelefone}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluirTelefone(@PathVariable int idUsuario, @PathVariable int idTelefone) throws Throwable {
        usuarioServico.excluirTelefone(idUsuario, idTelefone);
    }

    @GetMapping("/{idUsuario}/telefones/{idTelefone}")
    @ResponseStatus(HttpStatus.OK)
    public Telefone recuperarTelefone(@PathVariable int idUsuario, @PathVariable int idTelefone) throws Throwable {
        return usuarioServico.recuperarTelefone(idUsuario, idTelefone);
    }
    
    
    @GetMapping("/{idUsuario}/telefones/")
    @ResponseStatus(HttpStatus.OK)
    public List<Telefone> listarTelefone(@PathVariable int idUsuario) throws Throwable {
        return usuarioServico.listarTelefone(idUsuario);
    }
    
    
}
