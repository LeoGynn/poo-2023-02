package pacotefiguras;
public abstract class Retangulo extends Quadrado {
    private double altura;

    //Construtor padrão
    public Retangulo() {
        super(); // Chama o construtor padrão da classe pai (Quadrado)
        this.altura = 0.0; // Valor padrão
    }

    //Construtor que recebe o atributo lado e altura como argumento 
    public Retangulo(double lado,double altura) {
        super(lado); // Chama o construtor da classe pai (Quadrado) com o lado
        this.altura = altura;
    }

    //Sobrescrita do método de calcular a área da figura(retangulo)
    @Override
    public double calcularArea() {
        return lado * altura;
    }

    //Sobrescrita do método de calcular o perímetro da figura(retangulo)
    @Override
    public double calcularPerimetro() {
        return 2 * (lado * altura);
    }

    //Metodo GET do valor do atributo(altura)
    public double getAltura(double altura){
    return altura;
    }

    //Metodo SET do valor do atributo(altura)
    public void setAltura(double altura){
        this.altura = altura;
        
    }
    //Classe Main para criar o objeto Retangulo e utilizar seus métodos
    public class Main {
        public static void main(String[] args) {
            // Criar um objeto Retangulo
            Retangulo retangulo = new Retangulo(4.0, 6.0); // Lado: 4.0, Altura: 6.0
    
            // Calcular a área e o perímetro do retângulo
            double area = retangulo.calcularArea();
            double perimetro = retangulo.calcularPerimetro();
    
            // Exibir os resultados
            System.out.println("Área do retângulo: " + area);
            System.out.println("Perímetro do retângulo: " + perimetro);
        }
    }

}
