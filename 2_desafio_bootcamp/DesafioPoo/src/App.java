import models.PessoaJuridica;

import java.util.Date;

import models.Pessoa;
import models.PessoaFisica;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", "123.456.789-00");
        PessoaFisica pessoaFisica = new PessoaFisica("Maria", "987.654.321-00", new Date());
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa X", "12.345.678/0001-00", new Date());
  
        System.out.println(pessoa.getNome() + " - " + pessoa.getDocumento());
        System.out.println(pessoaFisica.getNome() + " - " + pessoaFisica.getDocumento() + " - " + pessoaFisica.getDataNascimento());
        System.out.println(pessoaJuridica.getNome() + " - " + pessoaJuridica.getDocumento() + " - " + pessoaJuridica.getDataCriacao());
     }


}
