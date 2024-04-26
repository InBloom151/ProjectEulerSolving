public class solution {
    public static void main(String[] args) {
        int n = 100;
        int difference = squareOfSum(n) - sumOfSquares(n);

        System.out.println(difference);
    }

    public static int sumOfSquares(int n) {
        int result = (n * (n + 1) * (2 * n + 1)) / 6;
        return result;
    }

    public static int squareOfSum(int n) {
        int result = ((n * (n + 1)) / 2);
        return result * result;
    }
}
