public class Forecast {

    public static double futureValue(double amount, double rate, int years) {
        if (years == 0) {
            return amount;
        }

        double nextYearValue = futureValue(amount, rate, years - 1);

        return nextYearValue + (nextYearValue * rate);
    }
}