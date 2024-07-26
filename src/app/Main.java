package app;

public class Main {

    static String product;
    static double totSales;
    static double productNum;
    static double days;
    static double daySales;

    private final static String CURRENCY = "EUR";

    public static void main(String[] args) {
        product = "smartphone";
        productNum = 1;
        days = 5;
        totSales = 12153.41;
        daySales = totSales / days;

        System.out.printf("%nProduct No %.0f: %s,",
                productNum, product);

        System.out.printf("%ntotal sales for %.0f days is %s %.2f,",
                days, CURRENCY, totSales);

        System.out.printf("%nsales by day is %s %.2f.",
                CURRENCY, daySales);

        product = "laptop";
        productNum = 2;
        days = 7;
        totSales = 10486.85;
        daySales = totSales / days;

        System.out.printf("%nProduct No %.0f: %s,",
                productNum, product);

        System.out.printf("%ntotal sales for %.0f days is %s %.2f,",
                days, CURRENCY, totSales);

        System.out.printf("%nsales by day is %s %.2f.",
                CURRENCY, daySales);







    }
}

