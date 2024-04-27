import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        System.out.println(nPrime(10001));
    }

    public static int nPrime(int n) {
        int upperBound = (int) Math.ceil(n * (Math.log(n) + Math.log(Math.log(n))));
        boolean[] sieve = new boolean[upperBound + 1];
        Arrays.fill(sieve, true);
        sieve[0] = false;
        sieve[1] = false;

        for (int i = 2; i <= Math.sqrt(upperBound); i++) {
            if (sieve[i]) {
                for (int j = i * i; j <= upperBound; j += i) {
                    sieve[j] = false;
                }
            }
        }

        int count = 0;
        for (int num = 0; num < sieve.length; num++) {
            if (sieve[num]) {
                count++;
                if (count == n) {
                    return num;
                }
            }
        }

        return -1;
    }
}
