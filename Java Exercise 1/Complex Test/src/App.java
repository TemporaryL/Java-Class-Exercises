import static org.junit.Assert.assertEquals;
//import static Complex.java;

public class App {
    public void testAdd() {
        /* add() should return a new complex number which is the sum of this and the parameter */
        Complex a = new Complex(6.6, 12.9);
        Complex b = new Complex(13.1, 13.5);
        Complex c = a.add(b);
        assertEquals(19.7, c.real(), 1e-6);
        assertEquals(26.4, c.imag(), 1e-6);
    }
}