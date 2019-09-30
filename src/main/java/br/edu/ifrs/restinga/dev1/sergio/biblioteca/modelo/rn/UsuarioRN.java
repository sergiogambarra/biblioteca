/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.excecoes.QuebraRegraNegocio;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Usuario;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico.UsuarioServico;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author sergio
 */

@Component
public class UsuarioRN implements RegraNegocio<Usuario> {
    
    @Autowired
    UsuarioServico servico;
    
    public void validar(Usuario entidade) {
        if(entidade.getCpf()==null||entidade.getEmail()==null||entidade.getNome()==null) 
            throw new QuebraRegraNegocio("todos os campos são obrigatórios");
        if(entidade.getNome()==null||entidade.getNome().trim().length()<3)
            throw new QuebraRegraNegocio("Nome deve ter 3 ou mais letras");
        List<Usuario> usuarios = (List<Usuario>) servico.listar();
        for (int i=0;i<usuarios.size();i++){
            if (usuarios.get(i).getEmail().equals(entidade.getEmail())||usuarios.get(i).getCpf().equals(entidade.getCpf()))
                throw new QuebraRegraNegocio("email já cadastrado ou cpf");
        }
        
        // Caso seja obrigatorio um telefone
      //  if(usuario.getTelefones()==null)
      //      throw new QuebraRegraNegocio("No mínimo um telefone e no máximo três");
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
