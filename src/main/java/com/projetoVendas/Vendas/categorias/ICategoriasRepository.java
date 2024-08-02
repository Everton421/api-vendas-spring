package com.projetoVendas.Vendas.categorias;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;


public interface ICategoriasRepository extends JpaRepository < CategoriasModel,Integer > {
    Optional<CategoriasModel>   findByNOME(String nOME);
}
