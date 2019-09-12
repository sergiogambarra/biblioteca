/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Telefone;
import org.springframework.stereotype.Component;

/**
 *
 * @author sergio
 */

@Component
public class TelefoneRN implements RegraNegocio<Telefone> {
    public void validar(Telefone telefone) {
       // if(emprestimo.getTitulo()==null)
       //     throw new QuebraRegraNegocio("todos os campos são obrigatórios");
       // if (emprestimo.isDoacao())
       //     throw new QuebraRegraNegocio("todos os campos são obrigatórios");
        //if(livro.getAnoPublicacao())
        //    throw new QuebraRegraNegocio("Nome deve ter 3 ou mais letras");
        
    }

    @Override
    public void validarCadastrar(Telefone entidade) {
        validar(entidade);
    }

    @Override
    public void validarAtualizar(Telefone entidadeAtinga, Telefone entidadeNova) {
        validar(entidadeNova);
    }

    @Override
    public void validarExcluir(Telefone entidade) {
        
    }        
}
