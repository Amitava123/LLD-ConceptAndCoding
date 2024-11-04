package SOLID_Principles.SRP.With;

public class InvoicePrinter {
    Invoice invoice;

    public InvoicePrinter(Invoice invoice){
        this.invoice = invoice;
    }

    public void printInvoice() {
        System.out.println("The Price of " + invoice.marker.name + " for quantity " + invoice.quantity + " is: " + invoice.calcPrice());
    }
}
