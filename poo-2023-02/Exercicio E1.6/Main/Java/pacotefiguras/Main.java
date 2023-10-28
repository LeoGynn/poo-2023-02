import pacotefiguras.*;
import pacotefiguras.Quadrado;

public class Main {
    public static void main(String[] args) {
        //Criar objetos de cada classe
        Quadrado quadrado = new Quadrado(5.0); //Lado : 5.0
        Triangulo triangulo = new Triangulo(6.0, 3.0, 4.0, 4.0); //Base : 6.0, Lado1: 3.0, Lado2: 4.0, Altura: 4.0
        Circulo circulo = new Circulo(3.0); // Raio: 3.0
        Retangulo retangulo = new Retangulo(4.0, 8.0); // Lado: 4.0, Altura: 8.0
        
        //Métodos para calcular a área e o perímetro
        double areaQuadrado = quadrado.calcularArea();
        double perimetroQuadrado = quadrado.calcularPerimetro();

        double areaTriangulo = triangulo.calcularArea();
        double perimetroTriangulo = triangulo.calcularPerimetro();

        double areaCirculo = circulo.calcularArea();
        double perimetroCirculo = circulo.calcularPerimetro();
    
        double areaRetangulo = retangulo.calcularArea();
        double perimetroRetangulo = retangulo.calcularPerimetro();
    
        //Imprimir as informações
        System.out.println("Área do Quadrado: " + areaQuadrado);
        System.out.println("Perímetro do Quadrado: " + perimetroQuadrado);

        System.out.println("Área do Triângulo: " + areaTriangulo);
        System.out.println("Perímetro do Triângulo: " + perimetroTriangulo);

        System.out.println("Área do Retângulo: " + areaRetangulo);
        System.out.println("Perímetro do Retângulo: " + perimetroRetangulo);

        System.out.println("Área do Círculo: " + areaCirculo);
        System.out.println("Perímetro do Círculo: " + perimetroCirculo);
    }
}
