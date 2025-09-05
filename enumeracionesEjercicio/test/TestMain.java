package ejercicio.test;

import ejercicio.clases.Order;
import ejercicio.enums.OrderPriority;
import ejercicio.enums.OrderStatus;
import ejercicio.enums.PaymentMethod;

public class TestMain {
    public static void main(String[] args) {
        
        Order order1 = new Order("Jose", OrderStatus.NEW, OrderPriority.MEDIUM, PaymentMethod.CASH);
        Order order2 = new Order("Miguel", OrderStatus.PROCESSING, OrderPriority.LOW, PaymentMethod.TRANSFER);
        Order order3 = new Order("Pedro", OrderStatus.DELIVERED, OrderPriority.HIGHT, PaymentMethod.CARD);

        order1.showDetails();
        System.out.println();
        order2.showDetails();
        System.out.println();
        order3.showDetails();
    }
}
