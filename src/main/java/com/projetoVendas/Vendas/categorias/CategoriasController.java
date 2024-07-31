package com.projetoVendas.Vendas.categorias;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/categorias")
public class CategoriasController {
    
        @Autowired ICategoriasRepository categoriasRepository;

    @GetMapping("")
    public List<CategoriasModel> getCategorias() {
            List<CategoriasModel> optionalCategoria = this.categoriasRepository.findAll(); 
            return optionalCategoria;
    }
    
}
