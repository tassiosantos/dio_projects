package models;


import java.util.Date;

public class PessoaJuridica extends Pessoa {
    private Date dataCriacao;
 
    public PessoaJuridica(String nome, String documento, Date dataCriacao) {
       super(nome, documento);
       this.dataCriacao = dataCriacao;
    }
 
    public Date getDataCriacao() {
       return dataCriacao;
    }
 }