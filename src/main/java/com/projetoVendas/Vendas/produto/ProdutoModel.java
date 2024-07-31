package com.projetoVendas.Vendas.produto;
 
import org.hibernate.annotations.ManyToAny;

import com.projetoVendas.Vendas.categorias.CategoriasModel;
import com.projetoVendas.Vendas.ncm.ClassFiscalModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "cad_prod")
public class ProdutoModel {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int CODIGO;

    private String DESCRICAO;
    

    @ManyToOne
    @JoinColumn (name = "GRUPO" , referencedColumnName = "CODIGO", insertable = false, updatable = false)
    private CategoriasModel categoria;

    @ManyToOne
    @JoinColumn(name = "CLASS_FISCAL", referencedColumnName = "CODIGO", insertable = false , updatable = false)
    private ClassFiscalModel ncm;
    
    @Column(name = "NUM_FABRICANTE")
    private String GTIM;

    public int getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(int cODIGO) {
        CODIGO = cODIGO;
    }

    public String getDESCRICAO() {
        return DESCRICAO;
    }

    public void setDESCRICAO(String dESCRICAO) {
        DESCRICAO = dESCRICAO;
    }

    public String getGTIM() {
        return GTIM;
    }

    public void setGTIM(String gTIM) {
        GTIM = gTIM;
    }
 



    public void setClassFiscal(ClassFiscalModel classFiscal) {
        this.ncm = classFiscal;
    }

    public CategoriasModel getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriasModel categoria) {
        this.categoria = categoria;
    }

    public ClassFiscalModel getNcm() {
        return ncm;
    }


    

 
 


    


}
