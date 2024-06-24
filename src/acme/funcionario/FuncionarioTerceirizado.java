package acme.funcionario;

import acme.contato.Endereco;
import acme.contato.Telefone;
import acme.enums.Cargo;
import acme.enums.Setor;

import java.math.BigDecimal;

public class FuncionarioTerceirizado extends Funcionario{

    private String empresaContratada;
    private int tempoPrevistoPermanencia;

    public FuncionarioTerceirizado(Cargo cargo, Endereco endereco, String nome, BigDecimal salario, Setor setor, Telefone telefones, int tempoPrevistoPermanencia, String empresaContratada) {
        super(cargo, endereco, nome, salario, setor, telefones);
        this.tempoPrevistoPermanencia = tempoPrevistoPermanencia;
        this.empresaContratada = empresaContratada;
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
    public BigDecimal novoSalario( Double percentual) {
        return this.getSalario();
    }
}
