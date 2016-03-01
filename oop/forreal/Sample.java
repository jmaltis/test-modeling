package samples.oop.forreal;

public class Sample {

    public static void main(String[] args) {
        try {
            QuoteService quoteService = new QuoteService();
            Quote quoteToRecompute = quoteService.getQuote();
            System.out.println("Quote price : " + quoteService.recomputePrice(quoteToRecompute));
            System.out.println("Quote description : " + quoteService.recomputeDescription(quoteToRecompute));
        } catch (ComputationPriceException e) {
            System.out.println("Couldn't recompute quote price : " + e.getMessage());
        }
    }

}