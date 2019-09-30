/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.excecoes.QuebraRegraNegocio;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.dao.BibliotecarioDAO;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Bibliotecario;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico.BibliotecarioServico;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author default
 */
@Component
public class BibliotecarioRN implements RegraNegocio<Bibliotecario> {
    
    @Autowired
    BibliotecarioDAO bibliotecarioDAO;
    
    @Autowired
    List<BibliotecarioDAO> bibliotecariosDAO;
    
    @Autowired
    BibliotecarioServico servico;
    
    

    public void validar(Bibliotecario entidade) {
        if(entidade.getSenha()==null||entidade.getEmail()==null||entidade.getNome()==null)
            throw new QuebraRegraNegocio("todos os campos devem ser preenchidos");
        if(entidade.getSenha().length() < 8)
            throw new QuebraRegraNegocio("senha com no mínimo 8 caracteres");
        List<Bibliotecario> bibliotecarios = (List<Bibliotecario>) servico.listar();
        for (int i=0;i<bibliotecarios.size();i++){
            if (bibliotecarios.get(i).getEmail().equals(entidade.getEmail()))
                throw new QuebraRegraNegocio("email já cadastrado");
        }
        
    }
    
    @Override
    public void validarCadastrar(Bibliotecario entidade) {
        
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
