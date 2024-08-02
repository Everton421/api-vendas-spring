package com.projetoVendas.Vendas.vendedores;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "cad_vend")
public class VendedorModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CODIGO;
    private String NOME;
    public int getCODIGO() {
        return CODIGO;
    }
    public void setCODIGO(int cODIGO) {
        CODIGO = cODIGO;
    }
    public String getNOME() {
        return NOME;
    }
    public void setNOME(String nOME) {
        NOME = nOME;
    }
 

}
