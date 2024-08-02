package com.projetoVendas.Vendas.clientes;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface IClientesRepository extends JpaRepository <ClientesModel, Integer> {
     Optional<ClientesModel> findByCnpj(String cnpj);
        
    
    
}
