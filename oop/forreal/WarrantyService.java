package samples.oop.forreal;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class WarrantyService {

    public BigDecimal computeWarrantiesAmount(QuoteType quoteType, List<Warranty> warranties) {
        BigDecimal warrantiesAmount = BigDecimal.ZERO;

        warranties.stream()
                        .filter(warranty -> warrantyIsAvailable(quoteType, warranty))
                        .forEach(warranty -> warrantiesAmount.add(warranty.getPrice()));

        return warrantiesAmount;
    }

    public boolean warrantyIsAvailable(QuoteType quoteType, Warranty warranty) {
        return quoteType.equals(warranty.getAvailability());
    }

    public List<Warranty> availableWarranties(QuoteType quoteType, List<Warranty> warranties) {
        return warranties.stream()
                        .filter(w -> warrantyIsAvailable(quoteType, w))
                        .collect(Collectors.toList());
    }
}
