public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Leonardo", 2500, 70, 2);
        Pessoa pessoa2 = new Pessoa("Gleicilene", 1800, 24, 0);

        double impostoPessoa1 = pessoa1.calculaImposto();
        double impostoPessoa2 = pessoa2.calculaImposto();

        System.out.println("Imposto da pessoa 1: " + impostoPessoa1);
        System.out.println("Imposto da pessoa 2: " + impostoPessoa2);
    }
}