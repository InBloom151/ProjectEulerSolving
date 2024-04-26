public class solution {

    public static boolean isPalindrome(int n) {
        String strN = Integer.toString(n);
        return strN.equals(new StringBuilder(strN).reverse().toString());
    }

    public static int largestPalindrome() {
        for (int num = 999 * 999; num >= 100 * 100; num--) {
            if (isPalindrome(num)) {
                for (int i = 999; i >= 100; i--) {
                    if (num % i == 0 && 100 <= num / i && num / i <= 999) {
                        return num;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(largestPalindrome());
    }
}