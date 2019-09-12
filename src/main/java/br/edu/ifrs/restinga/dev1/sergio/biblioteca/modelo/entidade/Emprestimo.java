/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author sergio
 */

@Entity
public class Emprestimo implements Entidade {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date retirada;
    private Date previsaoDevolucao;
    private Date devolucao;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the retirada
     */
    public Date getRetirada() {
        return retirada;
    }

    /**
     * @param retirada the retirada to set
     */
    public void setRetirada(Date retirada) {
        this.retirada = retirada;
    }

    /**
     * @return the previsaoDevolucao
     */
    public Date getPrevisaoDevolucao() {
        return previsaoDevolucao;
    }

    /**
     * @param previsaoDevolucao the previsaoDevolucao to set
     */
    public void setPrevisaoDevolucao(Date previsaoDevolucao) {
        this.previsaoDevolucao = previsaoDevolucao;
    }

    /**
     * @return the devolucao
     */
    public Date getDevolucao() {
        return devolucao;
    }

    /**
     * @param devolucao the devolucao to set
     */
    public void setDevolucao(Date devolucao) {
        this.devolucao = devolucao;
    }
    
}
