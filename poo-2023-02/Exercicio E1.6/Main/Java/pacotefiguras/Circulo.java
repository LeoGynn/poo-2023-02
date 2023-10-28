package pacotefiguras;
public abstract class Circulo extends Figura {
    private double raio;

    //Construtor Padrão
    public Circulo() {
        this.raio = 00; //Valor Padrão
    } 

    //Construtor que recebe o atributo raio como argumento 
    public Circulo(double raio) {
        this.raio = raio;
    } 

    //Sobrescrita do método de calcular a área da figura(circulo)
    @Override
    public double calcularArea() {
        return Math.PI * (raio * raio);
    }

    //Sobrescrita do método de calcular o perímetro da figura(circulo)
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    //Metodo GET do valor do atributo
    public double getRaio() {
        return raio;
    }
    
    //Metodo SET do valor do atributo
    public void setRaio(double raio) {
        this.raio = raio;
    }
}
    