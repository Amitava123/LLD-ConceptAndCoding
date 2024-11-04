package SOLID_Principles.OpenClose.With;

import SOLID_Principles.SRP.Without.Invoice;

public class DBInvoice implements InvoceDAO{

    @Override
    public void save(Invoice invoice) {
        // Write in Implementation to save transaction in DB
    }
}
