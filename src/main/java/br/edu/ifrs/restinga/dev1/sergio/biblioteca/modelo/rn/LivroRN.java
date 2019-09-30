/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.excecoes.QuebraRegraNegocio;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Livro;
import org.springframework.stereotype.Component;

/**
 *
 * @author sergio
 */
@Component
public class LivroRN implements  RegraNegocio<Livro> {
    public void validar(Livro livro) {
        if(livro.getTitulo()==null||livro.getAnoPublicacao()==0)
            throw new QuebraRegraNegocio("todos os campos são obrigatórios");
      //  if (livro.isDoacao())
      //      throw new QuebraRegraNegocio("todos os campos são obrigatórios");
        //if(livro.getAnoPublicacao())
        //    throw new QuebraRegraNegocio("Nome deve ter 3 ou mais letras");
        
    }

    @Override
    public void validarCadastrar(Livro entidade) {
        validar(entidade);
    }

    @Override
    public void validarAtualizar(Livro entidadeAtinga, Livro entidadeNova) {
        validar(entidadeNova);
    }

    @Override
    public void validarExcluir(Livro entidade) {
        
    }    
    
}
