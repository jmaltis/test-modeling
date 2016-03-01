package samples.oop.forreal;

import java.math.BigDecimal;

public class Warranty {
    private String name;
    private BigDecimal price;
    private QuoteType availability;

    public Warranty(String name, BigDecimal price, QuoteType availability) {
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public QuoteType getAvailability() {
        return availability;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
