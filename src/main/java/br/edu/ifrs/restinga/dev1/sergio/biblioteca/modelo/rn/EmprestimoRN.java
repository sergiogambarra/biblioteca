/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.excecoes.QuebraRegraNegocio;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Emprestimo;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico.EmprestimoServico;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author sergio
 */
@Component
public class EmprestimoRN implements  RegraNegocio<Emprestimo> {
    @Autowired
    EmprestimoServico servico;
    
    public void validar(Emprestimo entidade) {
        if(entidade.getLivro()==null||entidade.getUsuario()==null||entidade.getBibliotecario()==null)
            throw new QuebraRegraNegocio("Livro, Usuario e Bibliotecario são obrigatorios");
        if(entidade.getRetirada()!=null)
            throw new QuebraRegraNegocio("A data de retirada sera definida pelo sistema");
        if(entidade.getDevolucao()!=null)
            throw new QuebraRegraNegocio("A data de devolucao sera definida pelo sistema");
        
       
       List<Emprestimo> emprestimos = (List<Emprestimo>) servico.listar();
        for (int i=0;i<emprestimos.size();i++){
 //           if (emprestimos.get(i).getPrimeiroNome().equals(entidade.getPrimeiroNome()))
 //               throw new QuebraRegraNegocio("nome e sobrenome ja cadastrado");
        }
        
    }

    @Override
    public void validarCadastrar(Emprestimo entidade) {
        validar(entidade);
    }

    @Override
    public void validarAtualizar(Emprestimo entidadeAtinga, Emprestimo entidadeNova) {
        validar(entidadeNova);
    }

    @Override
    public void validarExcluir(Emprestimo entidade) {
        
    }    
    
}
