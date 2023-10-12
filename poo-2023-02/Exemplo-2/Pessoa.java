public class Pessoa {
    protected String nome;
    protected String endereco;
    protected String telefone;

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
    }
}

public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("João", "Rua A, 123", "123-456-789", "123.456.789-01", 'M', 1);
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", "Av. B, 456", "987-654-321", "12.345.678/0001-99", "XYZ Ltda.");

        System.out.println("Informações da Pessoa Física:");
        pessoaFisica.exibirInformacoes();

        System.out.println("\nInformações da Pessoa Jurídica:");
        pessoaJuridica.exibirInformacoes();
    }
}