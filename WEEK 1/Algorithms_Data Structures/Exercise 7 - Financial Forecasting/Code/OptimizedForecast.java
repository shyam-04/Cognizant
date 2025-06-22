public class OptimizedForecast {

    public static double futureValue(double amount, double rate, int years) {
        double result = amount;

        for (int i = 1; i <= years; i++) {
            result = result + (result * rate);
        }

        return result;
    }
}