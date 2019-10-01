/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.excecoes.QuebraRegraNegocio;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Autor;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico.AutorServico;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author default
 */
@Component
public class AutorRN implements  RegraNegocio<Autor> {
    
    @Autowired
    AutorServico servico;
    
    public void validar(Autor entidade) {
        if(entidade.getPrimeiroNome()==null||entidade.getSegundoNome()==null)
            throw new QuebraRegraNegocio("todos os campos são obrigatórios");
        List<Autor> autores = (List<Autor>) servico.listar();
        for (int i=0;i<autores.size();i++){
            if (autores.get(i).getPrimeiroNome().equals(entidade.getPrimeiroNome())&&autores.get(i).getSegundoNome().equals(entidade.getSegundoNome()))
                throw new QuebraRegraNegocio("nome e sobrenome ja cadastrado");
        }
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
