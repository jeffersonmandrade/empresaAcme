import acme.endereco.Endereco;
import acme.funcionario.Funcionario;
import acme.funcionario.FuncionarioTerceirizado;

import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua A", "123", "São Paulo", "SP", "01234-567");
        Endereco endereco2 = new Endereco("Rua B", "456", "Rio de Janeiro", "RJ", "76543-210");

        Funcionario funcionario1 = new Funcionario(
                "PLENO",
                endereco1,
                "João Silva",
                new BigDecimal("1000.0"),
                "DESENVOLVIMENTO",
                12345678
        );

        FuncionarioTerceirizado funcionarioTerceirizado1 = new FuncionarioTerceirizado(
                "JUNIOR",
                endereco2,
                "Maria Oliveira",
                new BigDecimal("4000.0"),
                "DEVOPS",
                99887766,
                "XYZ Ltda",
                12
        );
        BigDecimal novoSalariofuncionario = funcionario1.novoSalario(12.00);
        BigDecimal novoSalariofuncionarioTercerizado = funcionarioTerceirizado1.novoSalario(12.00);

        }
    }
