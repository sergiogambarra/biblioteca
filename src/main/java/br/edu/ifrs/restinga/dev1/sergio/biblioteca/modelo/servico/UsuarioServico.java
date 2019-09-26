/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.excecoes.NaoEncontrado;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.dao.TelefoneDAO;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.dao.UsuarioDAO;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Emprestimo;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Telefone;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Usuario;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn.RegraNegocio;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn.TelefoneRN;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.rn.UsuarioRN;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author sergio
 */

@Component
public class UsuarioServico extends Servico<Usuario> {
    
    @Autowired
    TelefoneDAO telefoneDAO;

    @Autowired
    UsuarioDAO usuarioDAO;
    
    @Autowired
    UsuarioRN usuarioRN;
    
    @Autowired
    TelefoneRN telefoneRN;

    @Override
    public CrudRepository<Usuario, Integer> getDAO() {
        return  usuarioDAO;
    }

    @Override
    public RegraNegocio<Usuario> getRegraNegocio() {
        return usuarioRN;
    }
    
    //@Override
    public Usuario cadastrar(Usuario usuario, Telefone telefone) throws Throwable {
        usuarioRN.validar(usuario);
        if (usuario.getTelefones() != null) {
            Telefone telefoneBanco = telefoneDAO.save(telefone);
       //     usuario.setTelefones(telefone);
        }

        Usuario usuarioBanco = usuarioDAO.save(usuario);
        return usuarioBanco;
    }

    @Override
    public void atualizar(Usuario usuario) {
        usuarioRN.validar(usuario);
        //if (produto.getEmbalagem() != null) {
        //    embalagemDAO.save(usuario.getEmbalagem());
        //}
        usuarioDAO.save(usuario);
    }

    public Telefone cadastrarTelefone(int idUsuario, Telefone telefone) throws Throwable {
        Usuario usuario = this.recuperar(idUsuario);
        telefone.setId(0);
        Telefone telefoneBanco = telefoneDAO.save(telefone);
        usuario.getTelefones().add(telefoneBanco);
        usuarioDAO.save(usuario);
        return telefoneBanco;
    }
    
    public Telefone recuperarTelefone(int idUsuario, int idTelefone) throws Throwable {
        Usuario usuario = this.recuperar(idUsuario);
        List<Telefone> telefones = usuario.getTelefones();
        for (Telefone telefone : telefones) {
            if (telefone.getId() == idTelefone) {
                return telefone;
            }
        }
        throw new NaoEncontrado("id " + idTelefone + " não foi encontrada");
    }
    
 //   public Usuario recuperarUsuario(int idUsuario, int idEmprestimo) throws Throwable {
 //       Usuario usuario = this.recuperar(idUsuario);
 //       List<Emprestimo> emprestimos = emprestimo.
 //       for (Telefone telefone : emprestimos) {
 //           if (telefone.getId() == idEmprestimo) {
 //               return usuario;
 //           }
 //       }
 //       throw new NaoEncontrado("id " + idTelefone + " não foi encontrada");
 //   }

    public void atualizarTelefone(int idUsuario, Telefone telefone) throws Throwable {
        this.recuperarTelefone(idUsuario, telefone.getId());
        telefoneDAO.save(telefone);
    }

    public List<Telefone> listarTelefone(int idUsuario) throws Throwable {
        return this.recuperar(idUsuario).getTelefones();
    }

    public void excluirTelefone(int idUsuario, int idTelefone) throws Throwable {
        Usuario usuario = this.recuperar(idUsuario);
        List<Telefone> telefones = usuario.getTelefones();
        for (Telefone telefone : telefones) {
            if (telefone.getId() == idTelefone) {
                usuario.getTelefones().remove(telefone);
                usuarioDAO.save(usuario);
                return;
            }
        }
        throw new NaoEncontrado("id " + idTelefone + " não foi encontrada");
    }

    
}
