/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.excecoes.NaoEncontrado;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.dao.BibliotecarioDAO;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.dao.EmprestimoDAO;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Bibliotecario;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Emprestimo;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn.EmprestimoRN;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn.RegraNegocio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author sergio
 */
@Component
public class EmprestimoServico extends Servico<Emprestimo> {
    @Autowired
    EmprestimoDAO dao;
    
    @Autowired
    EmprestimoRN regraNegocio;
    
    @Autowired
    BibliotecarioDAO bibliotecarioDAO;
    
    @Autowired
    EmprestimoDAO emprestimoDAO;
    
    public void associarBibliotecario(int idEmprestimo, Bibliotecario bibliotecario) throws Throwable {
        Emprestimo emprestimo = this.recuperar(idEmprestimo);
        emprestimo.setBibliotecario(bibliotecario);
        emprestimoDAO.save(emprestimo);
    }
    
    public void desassociarBibliotecario(int idEmprestimo, int idBibliotecario) throws Throwable {
        Emprestimo emprestimo = this.recuperar(idEmprestimo);
        emprestimo.setBibliotecario(null);
        emprestimoDAO.save(emprestimo);
        
        //List<Fornecedor> fornecedores = produto.getFornecedores();
        //for (Fornecedor fornecedor : fornecedores) {
        //    if (fornecedor.getId() == idFornecedor) {
        //        produto.getFornecedores().remove(fornecedor);
        //        produtoDAO.save(produto);
        //        return;
        //    }

        }
    
    public Bibliotecario recuperarBibliotecario(int idEmprestimo, int idBibliotecario) throws Throwable {
        Emprestimo emprestimo = this.recuperar(idEmprestimo);
        return emprestimo.getBibliotecario();
        //List<Bibliotecario> bibliotecarios2 = emprestimo.getBibliotecario();
        //return bibliotecario;
    
       // throw new NaoEncontrado("id " + idBibliotecario + " não foi encontrada");
    }

    @Override
    public CrudRepository<Emprestimo, Integer> getDAO() {
        return  dao;
    }

    @Override
    public RegraNegocio<Emprestimo> getRegraNegocio() {
        return regraNegocio;
    }  
    
}
