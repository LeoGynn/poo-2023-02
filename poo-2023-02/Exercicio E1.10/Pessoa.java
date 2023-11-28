public class Pessoa {
    private String nome;
    private double salario;
    private int idade;
    private int numDependentes;

    // Método Construtor

    public double calculaImposto() {

        // implementação do cálculo do imposto

        if (idade >= 65) {
            return 0; // Pessoa com 65 anos ou mais não paga imposto
        } else {
            double imposto = 0;
            if (salario <= 1787.77) {
                imposto = 0;
            } else if (salario <= 2679.29) {
                imposto = (salario - 1787.77) * 0.075 - 134.08;
            } else if (salario <= 3572.43) {
                imposto = (salario - 2679.29) * 0.15 + 7.5 - 335.03;
            } else if (salario <= 4463.81) {
                imposto = (salario - 3572.43) * 0.225 + 15 - 602.96;
            } else {
                imposto = (salario - 4463.81) * 0.275 + 22.5 - 826.15;
            }

            imposto -= 179.71 * numDependentes;

            return imposto > 0 ? imposto : 0;
        }
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumDependentes() {
        return numDependentes;
    }

    public void setNumDependentes(int numDependentes) {
        this.numDependentes = numDependentes;
    }
}