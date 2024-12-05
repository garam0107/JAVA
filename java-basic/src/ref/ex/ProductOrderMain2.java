package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder [] orders = new ProductOrder[3];
        orders[0] = createOrder("두부", 2000,2);
        orders[1] = createOrder("김치", 5000,1);
        orders[2] = createOrder("두부", 3000,2);
    }
    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders){
            System.out.println();
        }
    }
}
