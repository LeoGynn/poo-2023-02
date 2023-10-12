✅ Objetos são instâncias de classes

// Classe que representa um carro
class Carro {
    String marca;
    String modelo;
}

// Instância de um objeto da classe Carro
Carro meuCarro = new Carro();
meuCarro.marca = "Toyota";
meuCarro.modelo = "Corolla";

✅ Objetos no mundo real são representados em software por instâncias de classes
No exemplo acima, o objeto meuCarro representa um carro do mundo real como uma instância da classe Carro.
✅ Classe inclui dados e comportamentos

class Pessoa {
    String nome;
    int idade;
    
    void cumprimentar() {
        System.out.println("Olá, meu nome é " + nome);
    }
}
✅ Objetos possuem seus próprios dados

Pessoa pessoa1 = new Pessoa();
pessoa1.nome = "Alice";
pessoa1.idade = 30;

Pessoa pessoa2 = new Pessoa();
pessoa2.nome = "Bob";
pessoa2.idade = 25;
✅ Objetos compartilham comportamento da classe

Ambos os objetos pessoa1 e pessoa2 compartilham o mesmo comportamento definido na classe Pessoa, como o método cumprimentar.

✅ Comportamento é descrito via métodos

Como mostrado no exemplo anterior, o método cumprimentar descreve o comportamento da classe Pessoa.

✅ Chamar um método é enviar uma mensagem

pessoa1.cumprimentar(); // Chama o método cumprimentar para pessoa1
pessoa2.cumprimentar(); // Chama o método cumprimentar para pessoa2
✅ Aplicação OO é um conjunto de objetos que trocam mensagens entre eles

public class AplicacaoOO {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Alice";
        pessoa1.idade = 30;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Bob";
        pessoa2.idade = 25;

        pessoa1.cumprimentar(); // Alice envia uma mensagem cumprimentar()
        pessoa2.cumprimentar(); // Bob envia uma mensagem cumprimentar()
    }
}
