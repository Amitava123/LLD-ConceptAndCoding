package SOLID_Principles.SRP.Without;

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

    public void printInvoice() {
        System.out.println("The Price of " + marker.name + " for quantity " + quantity + " is: " + calcPrice());
    }

    public void saveToDB() {
        // Implementation to save it to DB
        System.out.println("Saving Transaction to Database");
    }
}
