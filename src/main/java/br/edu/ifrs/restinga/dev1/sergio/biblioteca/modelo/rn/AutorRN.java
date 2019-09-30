/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Autor;
import org.springframework.stereotype.Component;

/**
 *
 * @author default
 */
@Component
public class AutorRN implements  RegraNegocio<Autor> {
    
    public void validar(Autor autor) {
       // if(emprestimo.getTitulo()==null)
       //     throw new QuebraRegraNegocio("todos os campos são obrigatórios");
       // if (emprestimo.isDoacao())
       //     throw new QuebraRegraNegocio("todos os campos são obrigatórios");
        //if(livro.getAnoPublicacao())
        //    throw new QuebraRegraNegocio("Nome deve ter 3 ou mais letras");
        
    }

    @Override
    public void validarCadastrar(Autor entidade) {
      validar(entidade);
    }

    @Override
    public void validarAtualizar(Autor entidadeAtinga, Autor entidadeNova) {
       validar(entidadeNova);
    }

    @Override
    public void validarExcluir(Autor entidade) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
