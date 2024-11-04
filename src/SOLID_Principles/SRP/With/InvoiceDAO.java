package SOLID_Principles.SRP.With;

public class InvoiceDAO {
    Invoice invoice;

    public InvoiceDAO(Invoice invoice){
        this.invoice = invoice;
    }

    public void saveToDB() {
        // Implementation to save it to DB
        System.out.println("Saving Transaction to Database");
    }
}
