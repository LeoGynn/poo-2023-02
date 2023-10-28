import java.util.ArrayList;
import java.util.List;

public class ProgramaFiguras {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(4.0);
        Triangulo triangulo = new Triangulo(5.0, 3.0, 4.0, 4.0);
        Circulo circulo = new Circulo(3.0);
        Retangulo retangulo = new Retangulo(6.0, 4.0);

        //Lista de figuras
        List<Figura> listaFiguras = new ArrayList<>();
        listaFiguras.add(quadrado);
        listaFiguras.add(triangulo);
        listaFiguras.add(circulo);
        listaFiguras.add(retangulo);

        // Iterar pela lista de figuras e calcular a área e o perímetro de cada figura
        for (Figura figura : listaFiguras) {
            System.out.println("Área da figura: " + figura.calcularArea());
            System.out.println("Perímetro da figura: " + figura.calcularPerimetro());
            System.out.println(); // Linha em branco para separar as figuras
        }
    }
}