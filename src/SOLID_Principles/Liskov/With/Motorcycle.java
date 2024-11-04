package SOLID_Principles.Liskov.With;

public class Motorcycle implements BikeWithEngine{
    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine() {
        isEngineOn = true;
    }

    @Override
    public void speed() {
        speed += 10;
    }
}
