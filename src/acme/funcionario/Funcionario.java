package acme.funcionario;

import acme.endereco.Endereco;
import acme.reajuste.Reajuste;

import java.math.BigDecimal;

public class Funcionario implements Reajuste {
    private String nome;
    private Integer telefones;
    private Endereco endereco;
    private BigDecimal salario;
    private String setor;
    private String cargo;

    public Funcionario(String cargo, Endereco endereco, String nome, BigDecimal salario, String setor, Integer telefones) {
        this.cargo = cargo;
        this.endereco = endereco;
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
        this.telefones = telefones;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Integer getTelefones() {
        return telefones;
    }

    public void setTelefones(Integer telefones) {
        this.telefones = telefones;
    }

    @Override
    public BigDecimal novoSalario(Double porcentage) {
        BigDecimal calculoNovoSalario = salario.add(this.salario.multiply(BigDecimal.valueOf(porcentage/100)));
        System.out.println("O funcionário " + getNome() + "tem um novo salario de: " + calculoNovoSalario );
        return calculoNovoSalario ;
    }
}

