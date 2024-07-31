package com.projetoVendas.Vendas.produto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

 

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    
    @Autowired
    private IProdutoRepository produtoRepository;
    
   

    @GetMapping("/{id}")
    public ProdutoModel getProdutos(@PathVariable int id) {

                Optional<ProdutoModel> produto = this.produtoRepository.findById(id);

                if( produto.isPresent()){

                return produto.get();

                }else{
                    throw new RuntimeException();
                }
        }
    
        @GetMapping("")
        public List<ProdutoModel> getProdutos() {
             List<ProdutoModel> listaProdutos = this.produtoRepository.findAll();
            return listaProdutos;
        }
        


    
}
