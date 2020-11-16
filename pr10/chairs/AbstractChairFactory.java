package pr10.chairs;

public abstract class AbstractChairFactory {
    abstract VictorianChair createVictorianChair();
    abstract MagicChair createMagicChair();
    abstract FunctionalChair createFunctionalChair();
}
