package SOLID_Principles.OpenClose.Without;

import SOLID_Principles.SRP.With.Invoice;

public class InvoiceDAO {
    Invoice invoice;

    public InvoiceDAO(Invoice invoice){
        this.invoice = invoice;
    }

    public void saveToDB() {
        // Implementation to save it to DB
        System.out.println("Saving Transaction to Database");
    }

    // New Requirement, we want to save the transaction to another DB/File
    public void saveToFile() {
        // Implementation to save it to File
        System.out.println("Saving Transaction to File");
    }
}
