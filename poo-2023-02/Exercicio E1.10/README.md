    12. Aula 10
Assunto

    Teoria: Testes de Unidade com o JUnit

Antes de praticar...

    JUnit tutorial, veja mais aqui: https://www.devmedia.com.br/junit-tutorial/1432
    Testando Java com Visual Studio Code (configuração, requisitos e exemplos): https://code.visualstudio.com/docs/java/java-testing
    Projeto CalculadoraJUnit disponível em: https://drive.google.com/drive/folders/1LwNx7cYqiGW8erq_BQwEaueOEIE--pfy?usp=sharing (acesso com e-mail institucional UFG)

Exemplo 1, fonte: https://www.devmedia.com.br/teste-unitario-com-junit/41235

    A primeira anotação a ser utilizada para criar testes unitários é @Test, que informa ao JUnit quais são os métodos de teste de uma classe. Para o JUnit o nome do método não importa, pois desde de que ele seja anotado dessa maneira ele será identificado como um método de teste.

Nota: Um método anotado com @Test não deve retornar um valor.

Considere que estamos trabalhando no módulo de vendas em um projeto de software e que como regra de negócio um produto jamais possa ser ativado se seu preço for menor ou igual a zero. O código que implementa essa regra poderia se parecer com este:

```java
public class ProdutoValidador {

    public void validar(Produto produto) {
        if (produto.getPreco() <= 0 && (produto.getStatus() == null || produto.getStatus() == ProdutoStatus.ATIVO)) {
            throw new ProdutoAtivadoSemPrecoException();
        }
    }
}
```

Agora, para assegurar a consistência dessa validação, podemos escrever uma classe de teste e verificar se quando o produto possui preço zero e estado ativo a exceção correspondente será lançada. Embora seja este o modificador que usamos abaixo, um método ou classe de teste não precisa ser público.

```java

public class ProdutoValidadorTest {

    @Test
    @DisplayName("Verifica se um produto está ativo e possui um preço válido")
    public void verificaSeProdutoAtivoSemPrecoLancaExcecao() {
        Produto produto = new Produto("Aparelho de Barbear", 10, ProdutoStatus.ATIVO);

        ProdutoValidador validador = new ProdutoValidador();
        assertThrows(ProdutoAtivadoSemPrecoException.class, () -> validador.validar(produto));
    }
}

```

    Nesse cenário construído para falha é o método assertThrows() quem verifica se obtivemos êxito em fazer com que validar() falhe. Assim como este, existem muitos outros métodos conhecidos como Assertions, cada um deles escrito para assegurar o retorno de um valor específico.

Exercício E1.10
Objetivo

    Realizar um exercício de Testes com JUnit

Problema

Executar testes de unidade em um método de cálculo de imposto de renda de uma classe Pessoa.

Para esse contexto, uma Pessoa tem como características: seu nome, salário, idade e número de dependentes.

As regras para o cálculo do imposto de renda são:

- Uma pessoa com idade maior ou igual a 65 anos não paga imposto.

- Para pessoas com menos de 65 anos o imposto é calculado de acordo com a seguinte tabela:

Salário
	

Percentual
	

Dedução

Até 1.787,77
	

-
	

-

De 1.787,78 até 2.679,29
	

7,5%
	

134,08

De 2.679,30 até 3.572,43
	

15%
	

335,03

De 3.572,44 até 4.463,81
	

22,5%
	

602,96

Acima de 4.463,81
	

27,5%
	

826,15

Do total de imposto calculado, é deduzido R$ 179,71 por dependente.

Ou seja, se o imposto calculado foi 300,00 e a pessoa tem 1 dependente, o imposto passa a ser 300,00 – 179,71.

De acordo com esse contexto faça:

    uma classe Pessoa com seus atributos e um método calculaImposto que retorna o valor do imposto (double), para passar na série de teste da classe TestePessoa;
    o código a seguir apresenta uma classe de teste (Junit) - TestePessoa - com um método de teste para cada situação das regras apresentadas para o problema. Copie o código, crie um novo método para a regra de pessoas maiores de 65 anos com salários em todas as faixas.
    Implemente o método calculaImposto da classe Pessoa com as regras necessárias para passar na série de teste.
