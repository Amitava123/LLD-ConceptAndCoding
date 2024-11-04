package SOLID_Principles.Liskov.With;

public interface Bike {
    default int getNoOfWheels() {
        return 2;
    }

    void speed();
}
