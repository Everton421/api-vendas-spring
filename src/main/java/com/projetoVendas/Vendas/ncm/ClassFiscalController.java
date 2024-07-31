package com.projetoVendas.Vendas.ncm;

import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/ncm")
public class ClassFiscalController {
    
    @Autowired IClassFiscalRepository classFiscalRepository;

    @GetMapping("/{ncm}")
    public ClassFiscalModel getbyNcm(@PathVariable String ncm) {
       Optional <ClassFiscalModel> ncmOptional =  this.classFiscalRepository.findByNCM(ncm.trim());

         if(ncmOptional.isPresent()){
            return ncmOptional.get();
         }else{
            throw new RuntimeException("erro ao buscar ncm");
         }
       
    }
    
}
