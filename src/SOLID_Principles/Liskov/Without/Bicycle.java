package SOLID_Principles.Liskov.Without;

public class Bicycle implements Bike{
    int speed;

    @Override
    public void turnOnEngine() {
        throw new AssertionError("Bicycle doesn't have engine");
    }

    @Override
    public void accelarate() {
        speed += 10;
    }
}
