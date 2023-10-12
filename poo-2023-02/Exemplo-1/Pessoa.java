// Definição de uma classe simples chamada "Pessoa"
public class Pessoa {
    // Atributos (variáveis de instância) da classe
    private String nome; // Atributo privado
    public int idade;    // Atributo público

    // Construtor da classe
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos da classe
    public void saudacao() {
        System.out.println("Olá, meu nome é " + nome + " e eu tenho " + idade + " anos.");
    }

    // Método público para acessar o atributo privado "nome"
    public String getNome() {
        return nome;
    }

    // Método público para modificar o atributo privado "nome"
    public void setNome(String novoNome) {
        nome = novoNome;
    }
}