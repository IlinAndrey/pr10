package pr10;

public class ConcreteFactory extends ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        return new Complex(0, 0);
    }

    @Override
    public Complex createComplex(int real, int image) {
        return new Complex(real, image);
    }
}
