public class solution {
    public static void main(String[] args) {
        int limit = 1000;
        int result = sumMultiples(limit);
        System.out.println(result);
    }

    public static int sumMultiples(int limit) {
        return sumDivisibleBy(3, limit) + sumDivisibleBy(5, limit) - sumDivisibleBy(15, limit);
    }

    public static int sumDivisibleBy(int divisor, int limit) {
        int n = (limit - 1) / divisor;
        return divisor * (n * (n + 1)) / 2;
    }
}