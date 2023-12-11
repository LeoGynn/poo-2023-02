public class TorreHanoi {
    private int movimentos;

    public TorreHanoi() {
        this.movimentos = 0;
    }

    public void resolverHanoi(int discos, char origem, char destino, char auxiliar) {
        if (discos == 1) {
            System.out.println("Mova o disco de " + origem + " para " + destino);
            this.movimentos++;
        } else {
            resolverHanoi(discos - 1, origem, auxiliar, destino);
            System.out.println("Mova o disco de " + origem + " para " + destino);
            this.movimentos++;
            resolverHanoi(discos - 1, auxiliar, destino, origem);
        }
    }

    public int getQuantidadeMovimentos() {
        return this.movimentos;
    }

    public void resetMovimentos() {
        this.movimentos = 0;
    }
}