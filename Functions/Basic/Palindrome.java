// Returns true if the given number is palindrome
public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));
    }
    public  static boolean isPalindrome(int x) {
        int palindrome = x;
        int rev = 0;
        if(x<0){
            return false;
        }
        while(x>0){
            int remainder =x % 10;
            rev = (rev*10)+ remainder;
            x = x /10;
        }
        return rev==palindrome;
    }
}
