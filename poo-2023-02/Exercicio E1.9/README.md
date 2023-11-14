Exercício E1.9
Objetivo

    Implementar a Calculadora com tratamento de Exceção e levantando Exceção de Número Negativo.

Problema

    Dada a classe Calc que executa as operações básicas de uma calculadora, e a classe Principal por onde o usuário insere os dados para executar as operações.

    Altere o código para acrescentar os tratamentos de exceção para o método dividir evitando o erro de uma divisão por zero; e crie uma exceção (classe de exceção – ex: NumeroNegativo) que seja lançada toda vez que um número negativo for digitado.

    As exceções que devem ser tratadas: InputMismatchException ("Entrada de Dados Inválida"),
    NumberFormatException ("Valor Inválido"), ArithmeticException ("Erro divisão por zero") e NumeroNegativo ("Entrada de número negativo").

Código fonte:

```java

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        DecimalFormat dc = new DecimalFormat("0,00");
        Calc c = new Calc();
        c.n1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Entre com o primeiro número:"));
        c.n2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Entre com o segundo número:"));
        JOptionPane.showMessageDialog(null,
                "Soma : " + dc.format(c.somar()));
        JOptionPane.showMessageDialog(null,

                "Subtração : " + dc.format(c.diminuir()));

        JOptionPane.showMessageDialog(null,

                "Multiplicação : " + dc.format(c.multiplicar()));

        JOptionPane.showMessageDialog(null,
                "Divisão : " + dc.format(c.dividir()));

    }
}
```