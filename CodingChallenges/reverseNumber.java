package CodingChallenges;

public class reverseNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(232));
    }
    public static boolean isPalindrome(int x){
        boolean isIt = x < 0 ? false : x == reverseInt(x);

        return isIt;
    }

    private static int reverseInt(int x){
        int result = 0;

        while (x > 0){
            result = result * 10 + x%10;
            x = Math.floorDiv(x, 10);
        }
        return result;
    }
}
