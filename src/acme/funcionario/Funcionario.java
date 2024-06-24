package acme.funcionario;

import acme.contato.Telefone;
import acme.enums.Cargo;
import acme.contato.Endereco;
import acme.reajuste.Reajuste;
import acme.enums.Setor;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class Funcionario implements Reajuste {
    private String nome;
    private List<Telefone> telefones;
    private Endereco endereco;
    private BigDecimal salario;
    private Setor setor;
    private Cargo cargo;

    public Funcionario(Cargo cargo, Endereco endereco, String nome, BigDecimal salario, Setor setor, List<Telefone> telefones) {
        this.cargo = cargo;
        this.endereco = endereco;
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
        this.telefones = telefones;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
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
    public Optional<BigDecimal> novoSalario(Double porcentage) {
        BigDecimal novoSalario = salario.add(this.salario.multiply(BigDecimal.valueOf(porcentage/100)));
        this.salario = novoSalario;
        return Optional.of(novoSalario) ;
    }
}

