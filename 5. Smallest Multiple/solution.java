public class solution {
    public static void main(String[] args) {
        long result = findSmallestMultiple(20);
        System.out.println(result);
    }

    public static long findSmallestMultiple(int maxDivisor) {
        long smallestMultiple = 1;

        for (int i = 2; i <= maxDivisor; i++) {
            long gcd = calculateGCD(smallestMultiple, i);

            smallestMultiple = (smallestMultiple * i) / gcd;
        }

        return smallestMultiple;
    }

    public static long calculateGCD(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
