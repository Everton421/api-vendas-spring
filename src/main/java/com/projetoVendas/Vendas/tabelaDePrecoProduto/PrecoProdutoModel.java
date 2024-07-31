package com.projetoVendas.Vendas.tabelaDePrecoProduto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "prod_tabprecos")

public class PrecoProdutoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int TABELA;

    private int PRODUTO;
    private int PRECO;
    
    public int getTABELA() {
        return TABELA;
    }
    public void setTABELA(int tABELA) {
        TABELA = tABELA;
    }
    public int getPRODUTO() {
        return PRODUTO;
    }
    public void setPRODUTO(int pRODUTO) {
        PRODUTO = pRODUTO;
    }
    public int getPRECO() {
        return PRECO;
    }
    public void setPRECO(int pRECO) {
        PRECO = pRECO;
    }


    

}
