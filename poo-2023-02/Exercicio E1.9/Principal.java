
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        DecimalFormat dc = new DecimalFormat("0.00");
        Calc c = new Calc();

        // Verificação para números negativos antes de realizar as operações matemáticas
        // e lançar a exceção NumeroNegativo caso seja digitado um número negativo.

        try {
            c.n1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Entre com o primeiro número:"));
            if (c.n1 < 0) {
                throw new NumeroNegativo("Número negativo não é permitido.");
            }

            c.n2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Entre com o segundo número:"));
            if (c.n2 < 0) {
                throw new NumeroNegativo("Número negativo não é permitido.");
            }

            // Realização das operações matemáticas

            JOptionPane.showMessageDialog(null,
                    "Soma : " + dc.format(c.somar()));

            JOptionPane.showMessageDialog(null,
                    "Subtração : " + dc.format(c.diminuir()));

            JOptionPane.showMessageDialog(null,
                    "Multiplicação : " + dc.format(c.multiplicar()));

            // Tratamento para ArithmeticException para evitar a divisão por zero.

            if (c.n2 == 0) {
                throw new ArithmeticException("Erro divisão por zero");
            }

            // Realização da operação de divisão

            JOptionPane.showMessageDialog(null,
                    "Divisão : " + dc.format(c.dividir()));

            // Exceções tratadas para lidar com erros de entrada ou exceções inesperadas.

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Valor Inválido: Entre com um número válido.");

        } catch (NumeroNegativo e) {
            JOptionPane.showMessageDialog(null,
                    "Entrada de número negativo.");

        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro divisão por zero.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}