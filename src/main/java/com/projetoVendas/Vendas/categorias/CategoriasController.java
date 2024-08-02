package com.projetoVendas.Vendas.categorias;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoVendas.Vendas.produto.ProdutoModel;

import lombok.Delegate;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


 
@RestController
@RequestMapping("/categorias")
public class CategoriasController {
    
        @Autowired ICategoriasRepository categoriasRepository;

    @GetMapping("")
    public List<CategoriasModel> getCategorias() {
            List<CategoriasModel> optionalCategoria = this.categoriasRepository.findAll(); 
            return optionalCategoria;
    }

    @PostMapping("")
    public ResponseEntity  postCategoria(@RequestBody CategoriasModel categoria) {

        var categorOptional = this.categoriasRepository.findByNOME(categoria.getNOME());

                if(categorOptional.isPresent()){
                        return ResponseEntity.status(400).body("categoria "+categoria.getNOME()+" ja foi cadastrada");
                }else{
                        var novaCategoria = this.categoriasRepository.save(categoria);
                        return ResponseEntity.status(200).body(novaCategoria); 
                }
    }
    
    @PutMapping("/{id}")
    public ResponseEntity putMethodName(@PathVariable int id, @RequestBody CategoriasModel categoria) {

                 Optional<CategoriasModel> categorOptional = this.categoriasRepository.findById(id);


                 if(categorOptional.isPresent() ){

                                var categoriaNome = this.categoriasRepository.findByNOME(categoria.getNOME());
                                        
                                        if(categoriaNome.isPresent()){
                                                return ResponseEntity.status(400).body("categoria "+categoria.getNOME()+" ja existe");
                                        }else{
                                                CategoriasModel auxCategoria =  categorOptional.get();
                                                auxCategoria.setNOME(categoria.getNOME());
                                                var categoriaAtualizada = this.categoriasRepository.save(auxCategoria);
                                                return ResponseEntity.status(200).body(categoriaAtualizada);
                                        }
                                     
                 }else{
                        return ResponseEntity.status(400).body("categoria id "+ id+" nao foi encontrada!"); 
                }
        
    }



        @DeleteMapping("/{id}")
        public void deletecategoria(@PathVariable int id){
                Optional<CategoriasModel> categorOptional = this.categoriasRepository.findById(id);

                if(categorOptional.isPresent()){
                        this.categoriasRepository.deleteById(id);
                }else{
                     throw new RuntimeException("nao encontrado categoria com o id :"+id);
                }
        }


   






}

 
