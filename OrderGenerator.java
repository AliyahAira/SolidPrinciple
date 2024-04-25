public class OrderGenerator {
    private final OrderDeets orderDeets;
    private final PlaceOrder placeOrder;
    private final CreateInv createInv;
    private final EmailNotif emailNotif;

    public OrderGenerator(OrderDeets orderDeets, PlaceOrder placeOrder, CreateInv createInv, EmailNotif emailNotif){
        this.orderDeets = orderDeets;
        this.placeOrder = placeOrder;
        this.createInv = createInv;
        this.emailNotif = emailNotif;
    }

    public void processOrder(double price, int quantity, String customerName, String address, String fileName, String email){
        orderDeets.calculateTotal(price, quantity);
        placeOrder.placeOrder(customerName, address);
        createInv.generateInvoice(fileName);
        emailNotif.sendEmailNotification(email);
    }
}