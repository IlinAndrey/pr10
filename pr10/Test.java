package pr10;

public class Test {
    public static void main(String[] args) {
        Complex a = new Complex(10, 20);
        System.out.println(a);

        ComplexAbstractFactory b = new ConcreteFactory();
        Complex c = b.createComplex(30, 29);
        System.out.println(c);

        ConcreteFactory d = new ConcreteFactory();
        Complex h = d.createComplex(100, 0);
        System.out.println(h);
    }
}
