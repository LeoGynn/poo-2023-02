public class PessoaFisica extends Pessoa {
    protected String cpf;
    protected char sexo;
    protected int estadoCivil;

    public PessoaFisica(String nome, String endereco, String telefone, String cpf, char sexo, int estadoCivil) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("CPF: " + cpf);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
    }
}