import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestePessoa {

    @Test
    public void testPessoaMenos65Salario1787() {
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(30);
        pessoa.setSalario(1787);
        pessoa.setNumDependentes(0);
        assertEquals(0, pessoa.calculaImposto(), 0.001);
    }

    // Teste para outras faixas salariais e números de dependentes

    @Test
    public void testPessoaMais65Salario1787() {
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(70);
        pessoa.setSalario(1787);
        pessoa.setNumDependentes(0);
        assertEquals(0, pessoa.calculaImposto(), 0.001);
    }

    // Teste para outras faixas salariais para pessoas com mais de 65 anos

}