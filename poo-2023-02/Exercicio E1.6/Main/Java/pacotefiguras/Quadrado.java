package pacotefiguras;
public abstract class Quadrado extends Figura {
    private double lado;

    //Construtor padrão
    public Quadrado() {
        this.lado = 0.0; // Valor padrão

    }

    //Construtor que recebe o atributo(lado) como argumento 
    public Quadrado(double lado) {
        this.lado = lado;
    }

    //Sobrescrita do método de calcular a área da figura(quadrado)
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    //Sobrescrita do método de calcular o perímetro da figura(quadrado)
    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    //Metodo GET do valor do atributo
    public double getLado(double lado){
    return lado;
    }

    //Metodo SET do valor do atributo
    public void setLado(double lado){
        this.lado = lado;
    }

}
