package SOLID_Principles.Liskov.With;

public class Bicycle implements Bike{
    int speed;

    @Override
    public void speed() {
        speed += 10;
    }
}
