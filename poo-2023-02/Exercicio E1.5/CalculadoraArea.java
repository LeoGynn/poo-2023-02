public class CalculadoraArea{
public static void main(String[] args) {
        FormaGeometrica[] formas = new FormaGeometrica[3];
        formas[0] = new Circulo();
        formas[1] = new Retangulo();
        formas[2] = new Triangulo();

        // Calcular a área total das formas geométricas
        double areaTotal = CalculadoraArea.calcularAreaTotal(formas);

        for (FormaGeometrica forma : formas) {
            System.out.println("Área da forma: " + forma.calcularArea());
    }
}
}