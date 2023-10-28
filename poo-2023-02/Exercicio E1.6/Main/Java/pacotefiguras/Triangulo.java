package pacotefiguras;

public abstract class Triangulo extends Figura {
    private double base;
    private double lado1;
    private double lado2;
    private double altura;

    //Construtor padrão
    public Triangulo() {
        this.base = 0.0; // Valor padrão
        this.lado1 = 0.0; // Valor padrão
        this.lado2 = 0.0; // Valor padrão
        this.altura = 0.0; // Valor padrão
    }

    //Construtor que recebe o atributo(lado) como argumento 
    public Triangulo(double lado) {
        this.lado = lado;
    }

    //Sobrescrita do método de calcular a área da figura(quadrado)
    @Override
    public double calcularArea() {
        return (base * altura) /2;
    }

    //Sobrescrita do método de calcular o perímetro da figura(quadrado)
    @Override
    public double calcularPerimetro() {
        return lado1 + lado2;
    }

    //Metodo GET do valor do atributo(base)
    public double getBase(double base){
    return base;
    }

    //Metodo SET do valor do atributo(base)
    public void setBase(double base){
        this.base = base;
    }
    
    //Metodo GET do valor do atributo(lado1)
    public double getLado1(double base){
    return base;
    }

    //Metodo SET do valor do atributo(lado1)
    public void setLado1(double lado1){
        this.lado1 = lado1;
    }

    //Metodo GET do valor do atributo(lado2)
    public double getLado2(double lado2){
    return lado2;
    }

    //Metodo SET do valor do atributo(lado2)
    public void setLado2(double lado2){
        this.lado2 = lado2;
    }

    //Metodo GET do valor do atributo(altura)
    public double getAltura(double altura){
    return altura;
    }

    //Metodo SET do valor do atributo(altura)
    public void setAltura(double altura){
        this.altura = altura;
    }
}
