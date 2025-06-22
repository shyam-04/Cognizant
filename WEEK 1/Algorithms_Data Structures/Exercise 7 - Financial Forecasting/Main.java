public class Main {
    public static void main(String[] args) {

        double initialAmount = 1000.0;

        double growthRate = 0.10;

        int years = 5;

        double valueRecursive = Forecast.futureValue(initialAmount, growthRate, years);
        System.out.println("Future value using recursion: ₹" + valueRecursive);

        double valueOptimized = OptimizedForecast.futureValue(initialAmount, growthRate, years);
        System.out.println("Future value using loop (optimized): ₹" + valueOptimized);
    }
}
