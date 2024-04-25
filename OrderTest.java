public class OrderTest {
    
    public static void main(String []args){
        OrderGenerator orderGenerator = new OrderGenerator(
            new OrderInfo(),
            new OrderInfo(),
            new Invoicing(),
            new Notify()
        );
        orderGenerator.processOrder(10.0, 2, "John Doe", "123 Main St", "order_123.pdf", "johndoe@example.com");
    }
}