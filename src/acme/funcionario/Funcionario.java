package acme.funcionario;

import acme.contato.Telefone;
import acme.enums.Cargo;
import acme.contato.Endereco;
import acme.reajuste.Reajuste;
import acme.enums.Setor;

import java.math.BigDecimal;

public class Funcionario implements Reajuste {
    private String nome;
    private Telefone telefones;
    private Endereco endereco;
    private BigDecimal salario;
    private Setor setor;
    private Cargo cargo;

    public Funcionario(Cargo cargo, Endereco endereco, String nome, BigDecimal salario, Setor setor, Telefone telefones) {
        this.cargo = cargo;
        this.endereco = endereco;
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
        this.telefones = telefones;
    }

    public Telefone getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone telefones) {
        this.telefones = telefones;
    }


    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }


    @Override
    public BigDecimal novoSalario(Double porcentage) {
        BigDecimal novoSalario = salario.add(this.salario.multiply(BigDecimal.valueOf(porcentage/100)));
        this.salario = novoSalario;
        return getSalario() ;
    }
}

