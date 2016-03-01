package samples.oop.forreal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Quote {

    private Insurer insurer;
    private String name;
    private QuoteType quoteType;
    private LocalDate date;
    private LocalDate expirationDate;
    private BigDecimal price;
    private List<Warranty> warranties;
    private Fees fees;

    public Quote() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QuoteType getQuoteType() {
        return quoteType;
    }

    public void setQuoteType(QuoteType quoteType) {
        this.quoteType = quoteType;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Insurer getInsurer() {
        return insurer;
    }

    public void setInsurer(Insurer insurer) {
        this.insurer = insurer;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<Warranty> getWarranties() {
        return warranties;
    }

    public void setWarranties(List<Warranty> warranties) {
        this.warranties = warranties;
    }

    public Fees getFees() {
        return fees;
    }

    public void setFees(Fees fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return getInsurer() + " / " + getName();
    }
}
