import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTorreHanoi {

    @Test
    public void testResolverHanoi3Discos() {
        TorreHanoi torre = new TorreHanoi();
        torre.resolverHanoi(3, 'A', 'C', 'B');
        assertEquals(7, torre.getQuantidadeMovimentos());
    }

    @Test
    public void testResolverHanoi4Discos() {
        TorreHanoi torre = new TorreHanoi();
        torre.resolverHanoi(4, 'A', 'C', 'B');
        assertEquals(15, torre.getQuantidadeMovimentos());
    }

    @Test
    public void testResolverHanoi0Discos() {
        TorreHanoi torre = new TorreHanoi();
        torre.resolverHanoi(0, 'A', 'C', 'B');
        assertEquals(0, torre.getQuantidadeMovimentos());
    }

    @Test
    public void testQuantidadeMovimentosInicialZero() {
        TorreHanoi torre = new TorreHanoi();
        assertEquals(0, torre.getQuantidadeMovimentos());
    }

    @Test
    public void testResolverHanoiUmDisco() {
        TorreHanoi torre = new TorreHanoi();
        torre.resolverHanoi(1, 'A', 'C', 'B');
        assertEquals(1, torre.getQuantidadeMovimentos());
    }

    @Test
    public void testResolverHanoiSemDiscos() {
        TorreHanoi torre = new TorreHanoi();
        torre.resolverHanoi(0, 'A', 'C', 'B');
        assertEquals(0, torre.getQuantidadeMovimentos());
    }

    @Test
    public void testResolverHanoiDezDiscos() {
        TorreHanoi torre = new TorreHanoi();
        torre.resolverHanoi(10, 'A', 'C', 'B');
        assertEquals(1023, torre.getQuantidadeMovimentos());
    }
