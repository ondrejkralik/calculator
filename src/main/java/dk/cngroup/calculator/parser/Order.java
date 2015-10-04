package dk.cngroup.calculator.parser;

import java.math.BigDecimal;

/**
 * Holder class for parsed orders
 */
public class Order {

    private String order;

    private BigDecimal number;

    public Order(String order, BigDecimal number) {
        this.order = order;
        this.number = number;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public BigDecimal getNumber() {
        return number;
    }

    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (!getOrder().equals(order.getOrder())) return false;
        return getNumber().equals(order.getNumber());
    }

    @Override
    public int hashCode() {
        int result = getOrder().hashCode();
        result = 31 * result + getNumber().hashCode();
        return result;
    }
}
