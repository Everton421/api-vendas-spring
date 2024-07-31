package com.projetoVendas.Vendas.ncm;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "class_fiscal" )
public class ClassFiscalModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CODIGO;

    private String NCM;
    private String DESCRICAO;
    private Integer CODIGO_EFD;
    private String CODIGO_CEST;

    public int getCODIGO() {
        return CODIGO;
    }
    public void setCODIGO(int cODIGO) {
        CODIGO = cODIGO;
    }
    public String getNCM() {
        return NCM;
    }
    public void setNCM(String nCM) {
        NCM = nCM;
    }
    public String getDESCRICAO() {
        return DESCRICAO;
    }
    public void setDESCRICAO(String dESCRICAO) {
        DESCRICAO = dESCRICAO;
    }
    public Integer getCODIGO_EFD() {
        return CODIGO_EFD;
    }
    public void setCODIGO_EFD(Integer cODIGO_EFD) {
        CODIGO_EFD = cODIGO_EFD;
    }
    public String getCODIGO_CEST() {
        return CODIGO_CEST;
    }
    public void setCODIGO_CEST(String cODIGO_CEST) {
        CODIGO_CEST = cODIGO_CEST;
    }
    
    
}
