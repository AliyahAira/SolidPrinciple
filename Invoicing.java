public class Invoicing implements CreateInv {
    @Override
    public void generateInvoice(String fileName){
        System.out.println("Invoice generated: " + fileName);
    }
}