package models;
import java.util.Date;

public class PessoaFisica extends Pessoa {
   private Date dataNascimento;

   public PessoaFisica(String nome, String documento, Date dataNascimento) {
      super(nome, documento);
      this.dataNascimento = dataNascimento;
   }

   public Date getDataNascimento() {
      return dataNascimento;
   }
}