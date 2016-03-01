package samples.oop;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Sample {

    public static void main(String[] args) {
        Sample sample = new Sample();
        try {
            Quote quoteToRecompute = new QuoteService().getQuote();
            System.out.println("Quote price : " + sample.recomputePrice(quoteToRecompute));
            System.out.println("Quote description : " + sample.recomputeDescription(quoteToRecompute));
        } catch (ComputationPriceException e) {
            System.out.println("Couldn't recompute quote price : " + e.getMessage());
        }
    }

    BigDecimal recomputePrice(Quote quote) throws ComputationPriceException {
        BigDecimal quoteTotalPrice;

        // Check expiration date
        if (quote.getExpirationDate().isBefore(LocalDate.now())) {
            throw new ComputationPriceException("It's too late !");
        }

        // Base price
        quoteTotalPrice = new BigDecimal(quote.getPrice().doubleValue());

        // Warranties
        if (quote.getWarrantyAvailability1().equals(quote.getQuoteType())) {
            quoteTotalPrice = quoteTotalPrice.add(quote.getWarrantyPrice1());
        }
        if (quote.getWarrantyAvailability2().equals(quote.getQuoteType())) {
            quoteTotalPrice = quoteTotalPrice.add(quote.getWarrantyPrice2());
        }
        if (quote.getWarrantyAvailability3().equals(quote.getQuoteType())) {
            quoteTotalPrice = quoteTotalPrice.add(quote.getWarrantyPrice3());
        }

        // Check insurer
        if (InsurerType.GOVERNMENT.equals(quote.getType())) {
            throw new ComputationPriceException("Government quote are not available anymore");
        }

        // Fees
        if (!quote.isFeesIncluded()) {
            if (quote.getOneTimeFees() != null) {
                quoteTotalPrice = quoteTotalPrice.add(quote.getOneTimeFees());
            }
            if (quote.getAnnualFees() != null) {
                quoteTotalPrice = quoteTotalPrice.add(quote.getAnnualFees());
            }
        }

        // Taxes has changed after 1st January 2015
        if (quote.getDate().isBefore(LocalDate.of(2015, 1, 1))) {
            quoteTotalPrice = quoteTotalPrice.multiply(new BigDecimal(1.20));
        } else {
            quoteTotalPrice = quoteTotalPrice.multiply(new BigDecimal(1.196));
        }

        // Rounding
        quoteTotalPrice = quoteTotalPrice.setScale(2, BigDecimal.ROUND_HALF_UP);

        return quoteTotalPrice;
    }

    String recomputeDescription(Quote quote) {
        String separator = " / ";
        String quoteDescription = quote.getInsurer();
        quoteDescription += separator + quote.getName();
        if (quote.getWarrantyAvailability1().equals(quote.getQuoteType())) {
            quoteDescription += separator + quote.getWarrantyName1();
        }
        if (quote.getWarrantyAvailability2().equals(quote.getQuoteType())) {
            quoteDescription += separator + quote.getWarrantyName2();
        }
        if (quote.getWarrantyAvailability3().equals(quote.getQuoteType())) {
            quoteDescription += separator + quote.getWarrantyName3();
        }
        return quoteDescription;
    }

}