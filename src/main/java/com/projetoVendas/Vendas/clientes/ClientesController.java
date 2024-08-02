package com.projetoVendas.Vendas.clientes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/clientes")
public class ClientesController {
    
        @Autowired IClientesRepository clientesRepository;

    @GetMapping("")
    public List<ClientesModel> getClientes() {

        List<ClientesModel> clientes = this.clientesRepository.findAll();
        if(clientes.size() > 0 ){
            return clientes;
        }else{
            throw new RuntimeException("erro ao buscar clientes");
        }
    }
    

    @GetMapping("/{id}")
    public ClientesModel getClientId(@PathVariable int id) {
            Optional<ClientesModel> clienteOptional = this.clientesRepository.findById(id);
            if(clienteOptional.isPresent()){
                return clienteOptional.get();
            }else{
                throw new RuntimeException();
            }
    }

    @PostMapping("")
    public ResponseEntity postCliente(@RequestBody ClientesModel cliente) {
        Optional<ClientesModel> optionalCliente = this.clientesRepository.findByCnpj(cliente.getCnpj());

        if( optionalCliente.isPresent()){
            System.out.println("cliente ja cadastrado com o cnpj: "+cliente.getCnpj());
            return ResponseEntity.status(400).body("cliente ja cadastrado com o cnpj: "+cliente.getCnpj());
        }else{
            var novoCliente = this.clientesRepository.save(cliente);
            return ResponseEntity.status(200).body(novoCliente);

        }

        
    }
    


}
