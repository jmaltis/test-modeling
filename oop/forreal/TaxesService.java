package samples.oop.forreal;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TaxesService {

    public BigDecimal applyTaxes(LocalDate date, BigDecimal amount) {
        // Taxes has changed after 1st January 2015
        BigDecimal amountWithTaxes = date.isBefore(LocalDate.of(2015, 1, 1)) ?
                        amount.multiply(new BigDecimal(1.20)) :
                        amount.multiply(new BigDecimal(1.196));

        return amountWithTaxes.setScale(2, BigDecimal.ROUND_HALF_UP);
    }
}
