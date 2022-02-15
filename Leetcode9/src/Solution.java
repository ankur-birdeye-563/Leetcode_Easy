public class Solution {

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));

    }

    public static boolean isPalindrome(int x) {

        int reverse = 0, copy = x;

        while (copy > 0) {
            reverse = (reverse * 10) + copy%10;
            copy = copy/10;
        }
        return reverse == x;
    }
}
