package acme.funcionario;

import acme.contato.Endereco;
import acme.contato.Telefone;
import acme.enums.Cargo;
import acme.enums.Setor;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class FuncionarioTerceirizado extends Funcionario{

    private String empresaContratada;
    private int tempoPrevistoPermanencia;

    public FuncionarioTerceirizado(Cargo cargo, Endereco endereco, String nome, BigDecimal salario, Setor setor, List<Telefone> telefones, String empresaContratada, int tempoPrevistoPermanencia) {
        super(cargo, endereco, nome, salario, setor, telefones);
        this.empresaContratada = empresaContratada;
        this.tempoPrevistoPermanencia = tempoPrevistoPermanencia;
    }

    public String getEmpresaContratada() {
        return empresaContratada;
    }

    public void setEmpresaContratada(String empresaContratada) {
        this.empresaContratada = empresaContratada;
    }

    public int getTempoPrevistoPermanencia() {
        return tempoPrevistoPermanencia;
    }

    public void setTempoPrevistoPermanencia(int tempoPrevistoPermanencia) {
        this.tempoPrevistoPermanencia = tempoPrevistoPermanencia;
    }
    @Override
    public Optional<BigDecimal> novoSalario( Double percentual) {
        return Optional.of(this.getSalario());
    }
}
