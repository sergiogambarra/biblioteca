/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.excecoes.QuebraRegraNegocio;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Telefone;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Usuario;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico.UsuarioServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author sergio
 */



@Component
public class TelefoneRN implements RegraNegocio<Telefone> {
    
    @Autowired
    UsuarioServico usuarioServico;
    
    public void validar(Telefone telefone) {
       // if(emprestimo.getTitulo()==null)
       //     throw new QuebraRegraNegocio("todos os campos são obrigatórios");
       // if (emprestimo.isDoacao())
       //     throw new QuebraRegraNegocio("todos os campos são obrigatórios");
        //if(livro.getAnoPublicacao())
        //    throw new QuebraRegraNegocio("Nome deve ter 3 ou mais letras");
        
    }

    public void validarCadastrar(int idUsuario, Telefone entidade) throws Throwable {
        Usuario usuario = usuarioServico.recuperar(idUsuario);
        if(usuario.getTelefones().size()>=3)
            throw new QuebraRegraNegocio("No máximo 3 telefones");
        validar(entidade);
    }

    @Override
    public void validarAtualizar(Telefone entidadeAtinga, Telefone entidadeNova) {
        validar(entidadeNova);
    }
    
    @Override
    public void validarCadastrar(Telefone entidade) {
        validar(entidade);
    }

    @Override
    public void validarExcluir(Telefone entidade) {
        
    }        
}
