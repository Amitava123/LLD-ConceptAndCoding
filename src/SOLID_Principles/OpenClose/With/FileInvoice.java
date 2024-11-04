package SOLID_Principles.OpenClose.With;

import SOLID_Principles.SRP.Without.Invoice;

public class FileInvoice implements InvoceDAO{

    @Override
    public void save(Invoice invoice) {
        // Implementation to save transaction into a FILE
    }
}
