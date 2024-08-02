package com.projetoVendas.Vendas.vendedores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/vendedores")
public class VendedorController {
    

    @Autowired IVendedorRepository vendedorRepository;

    @GetMapping("")
    public List<VendedorModel> getVendedores() {
            List<VendedorModel> vendedores = this.vendedorRepository.findAll();
            return vendedores;

    }


    
}
