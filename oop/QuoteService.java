package samples.oop;

import java.math.BigDecimal;
import java.time.LocalDate;

public class QuoteService {

    // Stub method for generating a quote
    public Quote getQuote() {
        Quote quote = new Quote();
        quote.setDate(LocalDate.now());
        quote.setExpirationDate(quote.getDate().plusDays(1));
        quote.setInsurer("Allianz");
        quote.setType(InsurerType.PRIVATE);
        quote.setName("Allianz custom quote name");
        quote.setQuoteType(QuoteType.LIMITED_COVERAGE);
        quote.setPrice(new BigDecimal(499));
        quote.setWarrantyName1("Liability");
        quote.setWarrantyPrice1(new BigDecimal(0));
        quote.setWarrantyAvailability1(QuoteType.LIMITED_COVERAGE);
        quote.setWarrantyName2("fire");
        quote.setWarrantyPrice2(new BigDecimal(149));
        quote.setWarrantyAvailability2(QuoteType.INTERMEDIATE_COVERAGE);
        quote.setWarrantyName3("ownDamages");
        quote.setWarrantyPrice3(new BigDecimal(299));
        quote.setWarrantyAvailability3(QuoteType.FULL_COVERAGE);
        quote.setOneTimeFees(new BigDecimal(49.99));
        quote.setAnnualFees(new BigDecimal(19.99));
        return quote;
    }
}
