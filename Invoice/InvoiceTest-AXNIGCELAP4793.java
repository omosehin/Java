public class InvoiceTest {
    public static void main(String[] args) {
        Invoice Invoice1 = new Invoice("Invoice 1","Partnumber 1",1,-30);
    Invoice Invoice2 = new Invoice("Invoice 2","Partnumber 2",2,40);

     double data = Invoice1.getInvoiceAmount();

     System.out.printf("invoice amount is %.2f",data);

    }
    
}
