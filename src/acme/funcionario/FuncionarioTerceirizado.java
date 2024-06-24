package acme.funcionario;

import acme.endereco.Endereco;

import java.math.BigDecimal;

public class FuncionarioTerceirizado extends Funcionario{

    private String empresaContratada;
    private int tempoPrevistoPermanencia;

    public FuncionarioTerceirizado(String cargo, Endereco endereco, String nome, BigDecimal salario, String setor, Integer telefones, String empresaContratada, int tempoPrevistoPermanencia) {
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
    public BigDecimal novoSalario( Double percentual) {
        System.out.println("O funcionário terceirizado " + getNome() + " não pode receber reajuste salarial pela ACME.");
        return this.getSalario();
    }
}
