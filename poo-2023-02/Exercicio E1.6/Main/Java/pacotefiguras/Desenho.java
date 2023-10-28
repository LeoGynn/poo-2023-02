package pacotefiguras;

//Interface Desenho
public interface Desenho {
    String desenhar();
}

// Classe Quadrado implementando a interface Desenho
public class Quadrado extends Figura implements Desenho {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public String desenhar() {
        return "Desenhando a Figura Quadrado";
    }
}

// Classe Retangulo implementando a interface Desenho
public class Retangulo extends Figura implements Desenho {
    private double altura;

    public Retangulo(double lado, double altura) {
        super(lado);
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return lado * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (lado + altura);
    }

    @Override
    public String desenhar() {
        return "Desenhando a Figura Retângulo";
    }
}

// Classe Circulo implementando a interface Desenho
public class Circulo extends Figura implements Desenho {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String desenhar() {
        return "Desenhando a Figura Círculo";
    }
}

// Classe Triangulo implementando a interface Desenho
public class Triangulo extends Figura implements Desenho {
    private double base;
    private double lado1;
    private double lado2;
    private double altura;

    public Triangulo(double base, double lado1, double lado2, double altura) {
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return base + lado1 + lado2;
    }

    @Override
    public String desenhar() {
        return "Desenhando a Figura Triângulo";
    }
}