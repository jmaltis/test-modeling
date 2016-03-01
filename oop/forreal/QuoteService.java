package samples.oop.forreal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;

public class QuoteService {

    private FeesService feesService = new FeesService();
    private WarrantyService warrantyService = new WarrantyService();
    private TaxesService taxesService = new TaxesService();

    // Stub method for generating a quote
    public Quote getQuote() {
        Quote quote = new Quote();
        quote.setInsurer(new Insurer("Allianz", InsurerType.PRIVATE));
        quote.setName("Allianz custom quote name");
        quote.setQuoteType(QuoteType.LIMITED_COVERAGE);
        quote.setDate(LocalDate.now());
        quote.setExpirationDate(quote.getDate().plusDays(1));
        quote.setPrice(new BigDecimal(499));
        quote.setWarranties(Arrays.asList(
                        new Warranty("Liability", new BigDecimal(0), QuoteType.LIMITED_COVERAGE),
                        new Warranty("Fire", new BigDecimal(149), QuoteType.INTERMEDIATE_COVERAGE),
                        new Warranty("OwnDamages", new BigDecimal(299), QuoteType.FULL_COVERAGE)));
        quote.setFees(new Fees(new BigDecimal(49.99), new BigDecimal(19.99), false));
        return quote;
    }

    public BigDecimal recomputePrice(Quote quote) throws ComputationPriceException {
        // Check validity first
        checkQuoteIsStillValid(quote.getExpirationDate(), quote.getInsurer());

        // Compute price
        BigDecimal quoteTotalPrice = new BigDecimal(quote.getPrice().doubleValue())
                        .add(warrantyService.computeWarrantiesAmount(quote.getQuoteType(), quote.getWarranties()))
                        .add(feesService.computeFeesAmount(quote.getFees()));

        // Apply taxes
        return taxesService.applyTaxes(quote.getDate(), quoteTotalPrice);
    }

    private void checkQuoteIsStillValid(LocalDate expirationDate, Insurer insurer) throws ComputationPriceException {
        // Check expiration date
        if (expirationDate.isBefore(LocalDate.now())) {
            throw new ComputationPriceException("It's too late !");
        }

        // Check insurer
        if (insurer != null && InsurerType.GOVERNMENT.equals(insurer.getType())) {
            throw new ComputationPriceException("Government quote are not available anymore");
        }
    }

    String recomputeDescription(Quote quote) {
        return quote.toString() + " / " + String.join(" / ",
                        warrantyService.availableWarranties(quote.getQuoteType(), quote.getWarranties()).stream()
                                        .map(Warranty::toString)
                                        .collect(Collectors.toList()));
    }

}
