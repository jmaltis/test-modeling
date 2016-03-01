package samples.oop.forreal;

import java.math.BigDecimal;

public class FeesService {

    public BigDecimal computeFeesAmount(Fees fees) {
        BigDecimal feesAmount = BigDecimal.ZERO;

        if (!fees.included()) {
            if (fees.getOneTimeFees() != null) {
                feesAmount = feesAmount.add(fees.getOneTimeFees());
            }
            if (fees.getAnnualFees() != null) {
                feesAmount = feesAmount.add(fees.getAnnualFees());
            }
        }

        return feesAmount;
    }
}
