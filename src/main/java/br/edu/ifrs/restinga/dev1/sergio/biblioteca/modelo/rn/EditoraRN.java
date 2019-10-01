/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.excecoes.QuebraRegraNegocio;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Editora;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico.EditoraServico;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author default
 */
@Component
public class EditoraRN implements  RegraNegocio<Editora> {
    
    @Autowired
    EditoraServico servico;
    
    public void validar(Editora entidade) {
       if(entidade.getNome()==null||entidade.getCnpj()==null)
            throw new QuebraRegraNegocio("todos os campos são obrigatórios");
        List<Editora> editoras = (List<Editora>) servico.listar();
        for (int i=0;i<editoras.size();i++){
            if (editoras.get(i).getCnpj().equals(entidade.getCnpj()))
                throw new QuebraRegraNegocio("CNPJ já cadastrado");
        }
        
    }

    @Override
    public void validarCadastrar(Editora entidade) {
      validar(entidade);
    }

    @Override
    public void validarAtualizar(Editora entidadeAtinga, Editora entidadeNova) {
       validar(entidadeNova);
    }

    @Override
    public void validarExcluir(Editora entidade) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
