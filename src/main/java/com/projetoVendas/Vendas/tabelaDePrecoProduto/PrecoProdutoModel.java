package com.projetoVendas.Vendas.tabelaDePrecoProduto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "prod_tabprecos")

public class PrecoProdutoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int TABELA;

  
    private int PRECO;
    
    public int getTABELA() {
        return TABELA;
    }
    public void setTABELA(int tABELA) {
        TABELA = tABELA;
    }
  
    public int getPRECO() {
        return PRECO;
    }
    public void setPRECO(int pRECO) {
        PRECO = pRECO;
    }


    

}
