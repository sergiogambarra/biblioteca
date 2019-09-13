/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.sergio.biblioteca.controle;

import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.entidade.Livro;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico.LivroServico;
import br.edu.ifrs.restinga.dev1.sergio.biblioteca.modelo.servico.Servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author default
 */

@RestController
@RequestMapping("/api/livros")
public class Livros extends CRUDControle<Livro> {

    @Autowired
    LivroServico servico;

    @Override
    public Servico<Livro> getService() {
        return servico;
    }

    @PostMapping("/{idProduto}/modelos/")
    @ResponseStatus(HttpStatus.CREATED)
    public Modelo cadastrarModelo(@PathVariable int idLivro, @RequestBody Livro livro) throws Throwable {
        return servico.cadastrarModelo(idLivro, livro);
    }

    @PutMapping("/{idProduto}/modelos/{idModelo}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizarModelo(@PathVariable int idProduto, @PathVariable int idModelo, @RequestBody Modelo modelo) throws Throwable {
        modelo.setId(idModelo);
        servico.atualizarModelo(idProduto, modelo);
    }

    @DeleteMapping("/{idProduto}/modelos/{idModelo}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluirModelo(@PathVariable int idProduto, @PathVariable int idModelo) throws Throwable {
        servico.excluirModelo(idProduto, idModelo);
    }

    @GetMapping("/{idProduto}/modelos/{idModelo}")
    @ResponseStatus(HttpStatus.OK)
    public Modelo recuperarModelo(@PathVariable int idProduto, @PathVariable int idModelo) throws Throwable {
        return servico.recuperarModelo(idProduto, idModelo);
    }

    
    @GetMapping("/{idProduto}/modelos/")
    @ResponseStatus(HttpStatus.OK)
    public List<Modelo> listarModelo(@PathVariable int idProduto) throws Throwable {
        return servico.listarModelo(idProduto);
    }

    @RequestMapping(path = "/{idProduto}/fornecedores/", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void associarFornecedor(@PathVariable int idProduto, @RequestBody Fornecedor fornecedor) throws Throwable {
        servico.associarFornecedor(idProduto, fornecedor);
        
    }

    @DeleteMapping("/{idProduto}/fornecedores/{idFornecedor}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void desassociarFornecedor(@PathVariable int idProduto, @PathVariable int idFornecedor) throws Throwable {
         servico.desassociarFornecedor(idProduto,idFornecedor);
    }

    
    @RequestMapping(path = "/{idProduto}/fornecedores/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Fornecedor> listarFornecedor(@PathVariable int idProduto) throws Throwable {
        return this.recuperar(idProduto).getFornecedores();
    }
    
    @GetMapping("/{idProduto}/fornecedores/{idFornecedor}")
    @ResponseStatus(HttpStatus.OK)
    public Fornecedor recuperarFornecedor(@PathVariable int idProduto, @PathVariable int idFornecedor) throws Throwable {
        return servico.recuperarFornecedor(idProduto,idFornecedor);
    }
    
    
}
