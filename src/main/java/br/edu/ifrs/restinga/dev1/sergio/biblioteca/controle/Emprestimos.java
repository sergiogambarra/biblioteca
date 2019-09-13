/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.controle;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Emprestimo;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico.EmprestimoServico;
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
 * @author sergio
 */

@RestController
@RequestMapping("/api")
public class Emprestimos {
    
    @Autowired
    EmprestimoServico emprestimoServico;

    public Servico<Emprestimo> getService() {
        return emprestimoServico;
    }
    
    @PostMapping("/emprestimos/")
    @ResponseStatus(HttpStatus.CREATED)
    public Emprestimo cadastrarLivro(@RequestBody Emprestimo emprestimo) {
        return emprestimoServico.cadastrar(emprestimo);
    }
    
    @GetMapping("/emprestimos/")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Emprestimo> listarEmprestimos() {
    return emprestimoServico.listar();
    }
    
    
    
    
    
    
}
