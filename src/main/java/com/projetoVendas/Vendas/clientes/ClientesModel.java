package com.projetoVendas.Vendas.clientes;

import org.hibernate.annotations.ManyToAny;

import com.projetoVendas.Vendas.vendedores.VendedorModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "cad_clie")
public class ClientesModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CODIGO;

    @Column(name = "NOME")
    private String razao_social;

    @Column(name = "APELIDO")
    private String fantasia;

    @Column(name ="CPF")
    private String cnpj;

    @Column(name = "RG")
    private  String inscricao_estadual;

    @Column(name = "EMAIL_FISCAL")
    private String email_fiscal;


    private String ENDERECO;
    private String NUMERO;
    private String COMPLEMENTO;
    private String BAIRRO;
    private String CEP;
    private String CIDADE;
    private String ESTADO;

    @Column(name = "TELEFONE_COM") 
    private String telefone;

    @ManyToOne
    @JoinColumn (name = "VENDEDOR" ,referencedColumnName = "CODIGO",insertable = false,updatable = false)
    private VendedorModel vendedor;

    private String CELULAR;
     private String EMAIL;
    private String OBSERVACOES;
    private String HISTORICO;
    private String OBS_BANCARIA;
    private String OBS_COMERCIAL1;
    private String OBS_COMERCIAL2;
    private String OBS_COMERCIAL3;
    private String OBS_PESSOAL;

    public String getOBS_COMERCIAL1() {
        return OBS_COMERCIAL1;
    }
    public void setOBS_COMERCIAL1(String oBS_COMERCIAL1) {
        OBS_COMERCIAL1 = oBS_COMERCIAL1;
    }
    public String getOBS_COMERCIAL2() {
        return OBS_COMERCIAL2;
    }
    public void setOBS_COMERCIAL2(String oBS_COMERCIAL2) {
        OBS_COMERCIAL2 = oBS_COMERCIAL2;
    }
    public String getOBS_COMERCIAL3() {
        return OBS_COMERCIAL3;
    }
    public void setOBS_COMERCIAL3(String oBS_COMERCIAL3) {
        OBS_COMERCIAL3 = oBS_COMERCIAL3;
    }
    @Column(name = "BLOQ_MOTIVO" )
   private String bloq_motivo;
   
 
    public int getCODIGO() {
        return CODIGO;
    }
    public String getHISTORICO() {
        return HISTORICO;
    }
    public void setHISTORICO(String hISTORICO) {
        HISTORICO = hISTORICO;
    }
    public void setCODIGO(int cODIGO) {
        CODIGO = cODIGO;
    }
    public String getRazao_social() {
        return razao_social;
    }
    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }
    public String getFantasia() {
        return fantasia;
    }
    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getInscricao_estadual() {
        return inscricao_estadual;
    }
    public void setInscricao_estadual(String inscricao_estadual) {
        this.inscricao_estadual = inscricao_estadual;
    }
    public String getEmail_fiscal() {
        return email_fiscal;
    }
    public void setEmail_fiscal(String email_fiscal) {
        this.email_fiscal = email_fiscal;
    }
    public String getENDERECO() {
        return ENDERECO;
    }
    public void setENDERECO(String eNDERECO) {
        ENDERECO = eNDERECO;
    }
    public String getNUMERO() {
        return NUMERO;
    }
    public void setNUMERO(String nUMERO) {
        NUMERO = nUMERO;
    }
    public String getCOMPLEMENTO() {
        return COMPLEMENTO;
    }
    public void setCOMPLEMENTO(String cOMPLEMENTO) {
        COMPLEMENTO = cOMPLEMENTO;
    }
    public String getBAIRRO() {
        return BAIRRO;
    }
    public void setBAIRRO(String bAIRRO) {
        BAIRRO = bAIRRO;
    }
    public String getCEP() {
        return CEP;
    }
    public void setCEP(String cEP) {
        CEP = cEP;
    }
    public String getCIDADE() {
        return CIDADE;
    }
    public void setCIDADE(String cIDADE) {
        CIDADE = cIDADE;
    }
    public String getESTADO() {
        return ESTADO;
    }
    public void setESTADO(String eSTADO) {
        ESTADO = eSTADO;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getCELULAR() {
        return CELULAR;
    }
    public void setCELULAR(String cELULAR) {
        CELULAR = cELULAR;
    }
    public String getEMAIL() {
        return EMAIL;
    }
    public void setEMAIL(String eMAIL) {
        EMAIL = eMAIL;
    }
    public VendedorModel getVendedor() {
        return vendedor;
    }
    public void setVendedor(VendedorModel vendedor) {
        this.vendedor = vendedor;
    }
    public String getOBSERVACOES() {
        return OBSERVACOES;
    }
    public void setOBSERVACOES(String oBSERVACOES) {
        OBSERVACOES = oBSERVACOES;
    }
    public String getBloq_motivo() {
        return bloq_motivo;
    }
    public void setBloq_motivo(String bloq_motivo) {
        this.bloq_motivo = bloq_motivo;
    }
    public String getOBS_BANCARIA() {
        return OBS_BANCARIA;
    }
    public void setOBS_BANCARIA(String oBS_BANCARIA) {
        OBS_BANCARIA = oBS_BANCARIA;
    }
    public String getOBS_PESSOAL() {
        return OBS_PESSOAL;
    }
    public void setOBS_PESSOAL(String oBS_PESSOAL) {
        OBS_PESSOAL = oBS_PESSOAL;
    }





}
