import acme.contato.Endereco;
import acme.contato.Telefone;
import acme.enums.Cargo;
import acme.enums.Setor;
import acme.funcionario.Funcionario;
import acme.funcionario.FuncionarioTerceirizado;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
                List.of(telefone1,telefone2)
        );

        FuncionarioTerceirizado funcionarioTerceirizado1 = new FuncionarioTerceirizado(
                Cargo.JUNIOR,
                endereco2,
                "Maria Oliveira",
                new BigDecimal("4000.0"),
                Setor.DEVOPS ,
                List.of(telefone2),
                "XYZ Ltda",
                12
        );
        Optional<BigDecimal> novoSalariofuncionario = funcionario1.novoSalario(12.00);
        Optional<BigDecimal> novoSalariofuncionarioTercerizado = funcionarioTerceirizado1.novoSalario(12.00);
        System.out.println("salario Funcionario: " + novoSalariofuncionario.orElse(funcionario1.getSalario()));
        System.out.println("Salario Tercerizado: " + novoSalariofuncionarioTercerizado.orElse(funcionarioTerceirizado1.getSalario()));
        }
    }
