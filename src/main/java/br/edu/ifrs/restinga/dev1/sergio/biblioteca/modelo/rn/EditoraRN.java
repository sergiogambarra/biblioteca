/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Emprestimo;
import org.springframework.stereotype.Component;

/**
 *
 * @author default
 */
@Component
public class EditoraRN implements  RegraNegocio<Emprestimo> {

    @Override
    public void validarCadastrar(Emprestimo entidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void validarAtualizar(Emprestimo entidadeAtinga, Emprestimo entidadeNova) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void validarExcluir(Emprestimo entidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
