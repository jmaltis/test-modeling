package samples.oop.forreal;

import java.math.BigDecimal;

public class Fees {

    private BigDecimal oneTimeFees;
    private BigDecimal annualFees;
    private boolean included;

    public Fees(BigDecimal oneTimeFees, BigDecimal annualFees, boolean included) {
        this.oneTimeFees = oneTimeFees;
        this.annualFees = annualFees;
        this.included = included;
    }

    public BigDecimal getOneTimeFees() {
        return oneTimeFees;
    }

    public boolean included() {
        return included;
    }

    public BigDecimal getAnnualFees() {
        return annualFees;
    }

}