public class FinancialForecastingTool{
    static double futureValueRecursive(double principal, double rate, int years) {
        if (years == 0) {
            return principal;
        }
        return futureValueRecursive(principal * (1 + rate), rate, years - 1);
    }
    public static double futureValueOptimized(double principal, double rate, int years) {
        return principal * Math.pow(1 + rate, years);
    }
    public static void main(String[] args) {
        double initialValue = 10000;       
        double annualGrowthRate = 0.10;    
        int years = 5;                     
        double futureRecursive = futureValueRecursive(initialValue, annualGrowthRate, years);
        System.out.printf("Future Value (Recursive) after %d years: %.2f\n", years, futureRecursive);
        double futureOptimized = futureValueOptimized(initialValue, annualGrowthRate, years);
        System.out.printf("Future Value (Optimized) after %d years: %.2f\n", years, futureOptimized);
    }
}
