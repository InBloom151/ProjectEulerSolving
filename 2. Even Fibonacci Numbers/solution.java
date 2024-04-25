public class solution {
    public static void main(String[] args) {
        int limit = 4000000;
        int result = fibonacciSum(limit);
        System.out.println(result);
    }

    public static int fibonacciSum(int limit) {
        int fibSum = 0;
        int a = 1;
        int b = 2;

        while (a <= limit) {
            if (a % 2 == 0) {
                fibSum += a;
            }
            int temp = a;
            a = b;
            b = temp + b;
        }

        return fibSum;
    }
}
