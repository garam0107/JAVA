package class1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder [] orders = new ProductOrder[3];
        ProductOrder product1 = new ProductOrder();
        product1.productname = "두부";
        product1.price = 2000;
        product1.quantity = 2;
        orders[0] = product1;

        ProductOrder product2 = new ProductOrder();
        product2.productname = "김치";
        product2.price = 5000;
        product2.quantity = 1;
        orders[1] = product2;

        ProductOrder product3 = new ProductOrder();
        product3.productname = "콜라";
        product3.price = 1500;
        product3.quantity = 2;
        orders[2] = product3;

        
        int sum = 0;
        for (int i = 0; i < orders.length; i++){
            ProductOrder product = orders[i];
            sum += orders[i].price * orders[i].quantity;
            System.out.println("상품명: " + product.productname + ',' + " 가격: " + product.price + " 수량: " + product.quantity );
        }
        System.out.println("총 결제 금액: " + sum);
    }
}
