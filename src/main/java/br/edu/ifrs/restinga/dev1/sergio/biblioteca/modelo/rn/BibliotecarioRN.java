/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.excecoes.QuebraRegraNegocio;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Bibliotecario;
import org.springframework.stereotype.Component;

/**
 *
 * @author default
 */
@Component
public class BibliotecarioRN implements RegraNegocio<Bibliotecario> {

    public void validar(Bibliotecario entidade) {
        
       // if (emprestimo.isDoacao())
       //     throw new QuebraRegraNegocio("todos os campos são obrigatórios");
        //if(livro.getAnoPublicacao())
        //    throw new QuebraRegraNegocio("Nome deve ter 3 ou mais letras");
        
    }
    
    @Override
    public void validarCadastrar(Bibliotecario entidade) {
        if(entidade.getSenha().equals("") || entidade.getEmail().equals("") || entidade.getNome().equals(""))
            throw new QuebraRegraNegocio("todos os campos devem ser preenchidos");
        if(entidade.getSenha().length() < 8)
            throw new QuebraRegraNegocio("senha com no mínimo 8 caracteres");
        validar(entidade);
    }
    
    @Override
    public void validarAtualizar(Bibliotecario entidadeAtinga, Bibliotecario entidadeNova) {
       validar(entidadeNova);
    }
    
    @Override
    public void validarExcluir(Bibliotecario entidade) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
