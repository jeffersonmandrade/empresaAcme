import acme.contato.Endereco;
import acme.contato.Telefone;
import acme.enums.Cargo;
import acme.enums.Setor;
import acme.funcionario.Funcionario;
import acme.funcionario.FuncionarioTerceirizado;

import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua A", "123", "São Paulo", "SP", "01234-567");
        Endereco endereco2 = new Endereco("Rua B", "456", "Rio de Janeiro", "RJ", "76543-210");

        Telefone telefone1 = new Telefone(55,12,12345678);
        Telefone telefone2 = new Telefone(53,14,987564123);
        Funcionario funcionario1 = new Funcionario(
                Cargo.PLENO,
                endereco1,
                "João Silva",
                new BigDecimal("1000.0"),
                Setor.DESENVOLVIMENTO,
                telefone1
        );

        FuncionarioTerceirizado funcionarioTerceirizado1 = new FuncionarioTerceirizado(
                Cargo.JUNIOR,
                endereco2,
                "Maria Oliveira",
                new BigDecimal("4000.0"),
                Setor.DEVOPS  ,
                telefone2,
                12,
                "XYZ Ltda"
        );
        BigDecimal novoSalariofuncionario = funcionario1.novoSalario(12.00);
        BigDecimal novoSalariofuncionarioTercerizado = funcionarioTerceirizado1.novoSalario(12.00);

        }
    }
