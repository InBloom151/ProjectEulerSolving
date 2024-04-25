public class solution {

    public static long largestPrimeFactor(long n) {
        long i = 2;
        while (i * i <= n) {
            while (n % i == 0) {
                n /= i;
            }
            i++;
        }
        return n;
    }

    public static void main(String[] args) {
        long number = 600851475143L;
        long largestPrime = largestPrimeFactor(number);
        System.out.println(largestPrime);
    }
}
