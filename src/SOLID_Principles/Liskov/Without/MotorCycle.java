package SOLID_Principles.Liskov.Without;

public class MotorCycle implements Bike{
    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine() {
        isEngineOn = true;
    }

    @Override
    public void accelarate() {
        speed += 10;
    }
}
