package ejercicio.clases;

import ejercicio.enums.OrderPriority;
import ejercicio.enums.OrderStatus;
import ejercicio.enums.PaymentMethod;

public class Order {
    private final int id;
    private String customer;
    private OrderStatus status;
    private OrderPriority priority;
    private PaymentMethod paymentMethod;

    private static int contador;

    public Order(String customer, OrderStatus status, OrderPriority priority, PaymentMethod paymentMethod) {
        this.id = ++contador;
        this.customer = customer;
        this.status = status;
        this.priority = priority;
        this.paymentMethod = paymentMethod;
    }

    public int getId() {
        return id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public OrderPriority getPriority() {
        return priority;
    }

    public void setPriority(OrderPriority priority) {
        this.priority = priority;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void showDetails() {
        System.out.println(
                "Pedido #" + id +
                        ", \n Cliente: " + customer +
                        ", \n Estado: " + status + " -> " + status.getDescripcion() +
                        ", \n Prioriddad: " + priority + " (" + priority.getDescripcion() + ")" +
                        ", \n Método de pago: " + paymentMethod + " -> " + paymentMethod.getDescripcion());
    }

}
