package samples.oop;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Quote {

    private LocalDate date;
    private LocalDate expirationDate;
    private String insurer;
    private InsurerType type;
    private String name;
    private QuoteType quoteType;
    private BigDecimal price;
    private boolean feesIncluded;
    private String warrantyName1;
    private BigDecimal warrantyPrice1;
    private QuoteType warrantyAvailability1;
    private String warrantyName2;
    private BigDecimal warrantyPrice2;
    private QuoteType warrantyAvailability2;
    private String warrantyName3;
    private BigDecimal warrantyPrice3;
    private QuoteType warrantyAvailability3;
    private BigDecimal oneTimeFees;
    private BigDecimal annualFees;

    public Quote() {

    }

    public Quote(LocalDate date, LocalDate expirationDate, String insurer, InsurerType type, String name, QuoteType quoteType,
                    BigDecimal price, boolean feesIncluded, String warrantyName1, BigDecimal warrantyPrice1, QuoteType
                    warrantyAvailability1, String warrantyName2, BigDecimal warrantyPrice2, QuoteType
                    warrantyAvailability2, String warrantyName3, BigDecimal warrantyPrice3, QuoteType
                    warrantyAvailability3, BigDecimal oneTimeFees, BigDecimal annualFees) {
        this.date = date;
        this.expirationDate = expirationDate;
        this.insurer = insurer;
        this.type = type;
        this.name = name;
        this.quoteType = quoteType;
        this.price = price;
        this.feesIncluded = feesIncluded;
        this.warrantyName1 = warrantyName1;
        this.warrantyPrice1 = warrantyPrice1;
        this.warrantyAvailability1 = warrantyAvailability1;
        this.warrantyName2 = warrantyName2;
        this.warrantyPrice2 = warrantyPrice2;
        this.warrantyAvailability2 = warrantyAvailability2;
        this.warrantyName3 = warrantyName3;
        this.warrantyPrice3 = warrantyPrice3;
        this.warrantyAvailability3 = warrantyAvailability3;
        this.oneTimeFees = oneTimeFees;
        this.annualFees = annualFees;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public String getInsurer() {
        return insurer;
    }

    public String getName() {
        return name;
    }

    public InsurerType getType() {
        return type;
    }

    public QuoteType getQuoteType() {
        return quoteType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getWarrantyName1() {
        return warrantyName1;
    }

    public BigDecimal getWarrantyPrice1() {
        return warrantyPrice1;
    }

    public QuoteType getWarrantyAvailability1() {
        return warrantyAvailability1;
    }

    public String getWarrantyName2() {
        return warrantyName2;
    }

    public BigDecimal getWarrantyPrice2() {
        return warrantyPrice2;
    }

    public QuoteType getWarrantyAvailability2() {
        return warrantyAvailability2;
    }

    public String getWarrantyName3() {
        return warrantyName3;
    }

    public BigDecimal getWarrantyPrice3() {
        return warrantyPrice3;
    }

    public QuoteType getWarrantyAvailability3() {
        return warrantyAvailability3;
    }

    public BigDecimal getOneTimeFees() {
        return oneTimeFees;
    }

    public BigDecimal getAnnualFees() {
        return annualFees;
    }

    public boolean isFeesIncluded() {
        return feesIncluded;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setFeesIncluded(boolean feesIncluded) {
        this.feesIncluded = feesIncluded;
    }

    public void setInsurer(String insurer) {
        this.insurer = insurer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(InsurerType type) {
        this.type = type;
    }

    public void setQuoteType(QuoteType quoteType) {
        this.quoteType = quoteType;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setWarrantyName1(String warrantyName1) {
        this.warrantyName1 = warrantyName1;
    }

    public void setWarrantyPrice1(BigDecimal warrantyPrice1) {
        this.warrantyPrice1 = warrantyPrice1;
    }

    public void setWarrantyAvailability1(QuoteType warrantyAvailability1) {
        this.warrantyAvailability1 = warrantyAvailability1;
    }

    public void setWarrantyName2(String warrantyName2) {
        this.warrantyName2 = warrantyName2;
    }

    public void setWarrantyPrice2(BigDecimal warrantyPrice2) {
        this.warrantyPrice2 = warrantyPrice2;
    }

    public void setWarrantyAvailability2(QuoteType warrantyAvailability2) {
        this.warrantyAvailability2 = warrantyAvailability2;
    }

    public void setWarrantyName3(String warrantyName3) {
        this.warrantyName3 = warrantyName3;
    }

    public void setWarrantyPrice3(BigDecimal warrantyPrice3) {
        this.warrantyPrice3 = warrantyPrice3;
    }

    public void setWarrantyAvailability3(QuoteType warrantyAvailability3) {
        this.warrantyAvailability3 = warrantyAvailability3;
    }

    public void setOneTimeFees(BigDecimal oneTimeFees) {
        this.oneTimeFees = oneTimeFees;
    }

    public void setAnnualFees(BigDecimal annualFees) {
        this.annualFees = annualFees;
    }
}
