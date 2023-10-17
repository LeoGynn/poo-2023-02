public class CalculadoraArea {
    public static double calcularAreaTotal(FormaGeometrica[] formas) {
        double areaTotal = 0.0;

        for (FormaGeometrica forma : formas) {
            areaTotal += forma.calcularArea();
        }

        return areaTotal;
    }

    public static void main(String[] args) {
        FormaGeometrica[] formas = new FormaGeometrica[3];
        formas[0] = new Circulo(5.0); // Fornecer o raio
        formas[1] = new Retangulo(4.0, 6.0); // Fornecer largura e altura
        formas[2] = new Triangulo(3.0, 8.0); // Fornecer base e altura

        // Calcular a área total das formas geométricas
        double areaTotal = calcularAreaTotal(formas);

        for (FormaGeometrica forma : formas) {
            System.out.println("Área da forma: " + forma.calcularArea());
        }

        System.out.println("Área total das formas geométricas: " + areaTotal);
    }
}