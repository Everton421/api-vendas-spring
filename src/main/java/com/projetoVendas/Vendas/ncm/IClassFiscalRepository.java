package com.projetoVendas.Vendas.ncm;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;


public interface IClassFiscalRepository  extends JpaRepository <ClassFiscalModel, Integer> {
         Optional<ClassFiscalModel>  findByNCM(String ncm);
    
}
