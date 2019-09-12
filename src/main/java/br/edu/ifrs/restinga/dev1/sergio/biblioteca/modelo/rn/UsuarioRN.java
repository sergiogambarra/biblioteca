/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.excecoes.QuebraRegraNegocio;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Usuario;
import org.springframework.stereotype.Component;

/**
 *
 * @author sergio
 */

@Component
public class UsuarioRN implements  RegraNegocio<Usuario> {
    public void validar(Usuario usuario) {
        if(usuario.getCpf()==null||usuario.getEmail()==null||usuario.getNome()==null) 
            throw new QuebraRegraNegocio("todos os campos são obrigatórios");
        if(usuario.getNome()==null||usuario.getNome().trim().length()<3)
            throw new QuebraRegraNegocio("Nome deve ter 3 ou mais letras");
        
        // Caso seja obrigatorio a embalgem
        //if(produto.getEmbalagem()==null)            throw new QuebraRegraNegocio("Embalagem não pode ser nulo");
    }

    @Override
    public void validarCadastrar(Usuario entidade) {
        validar(entidade);
    }

    @Override
    public void validarAtualizar(Usuario entidadeAtinga, Usuario entidadeNova) {
        validar(entidadeNova);
    }

    @Override
    public void validarExcluir(Usuario entidade) {
        
    }
    
}
