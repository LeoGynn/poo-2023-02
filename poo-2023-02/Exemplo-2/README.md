public class PessoaFisica extends Pessoa {

}

A palavra reservada extends indica que a classe a ser especificada herda de uma outra classe;
Na linguagem Java, a hierarquia de classes inicia com a classe Object (do pacote java.lang), sendo assim toda classe Java é descendente em algum grau da classe Object.

Uma sub-classe tem acesso aos atributos e métodos definidos com visibilidade public e protected, mas não private.

Em Java, a palavra-chave super é usada para acessar métodos ou atributos da classe pai (superclasse) a partir de uma classe filha (subclasse) que herda da classe pai. O super 
permite que você chame explicitamente o construtor da superclasse, métodos da superclasse ou acesse atributos da superclasse quando eles têm o mesmo nome que membros na classe filha.

A palavra reservada super é similar a this, porém atua como referência para o objeto corrente interpretado como uma instância da superclasse;

Uma classe abstrata é uma classe que não pode ser instanciada diretamente e é usada como uma base para outras classes. Você pode definir métodos abstratos em classes abstratas que devem ser implementados nas subclasses.

public abstract class Pessoa {
    protected String nome;
    protected String endereco;
    protected String telefone;

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Método abstrato para obter o tipo de pessoa (Física ou Jurídica)
    public abstract String getTipoPessoa();

    // Outros métodos comuns podem ser definidos aqui, caso seja necessário
}

Temos três atributos comuns a todas as pessoas: nome, endereco e telefone.

Um construtor foi criado para permitir a definição desses atributos ao criar uma instância da classe.

Um método abstrato chamado getTipoPessoa() foi definido. Esse método será implementado nas classes derivadas (PessoaFisica e PessoaJuridica) para fornecer o tipo específico de pessoa (Física ou Jurídica), conforme exemplo abaixo.

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

    @Override
    public String getTipoPessoa() {
        return "Pessoa Física";
    }
}

public class PessoaJuridica extends Pessoa {
    protected String cnpj;
    protected String razaoSocial;

    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String razaoSocial) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String getTipoPessoa() {
        return "Pessoa Jurídica";
    }
}

Pessoa pai = new Pessoa();
Referência antes do =
Instância depois do new
