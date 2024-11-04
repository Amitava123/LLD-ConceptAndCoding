package SOLID_Principles.SRP.With;

public class Invoice {
    public Marker marker;
    public int quantity;

    Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }
    
    public int calcPrice() {
        return marker.price*quantity;
    }
}
