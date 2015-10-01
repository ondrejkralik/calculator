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
}
