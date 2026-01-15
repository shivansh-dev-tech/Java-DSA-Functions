//Program: Checks a number is prime or not in an optimized way
//concept used : loops + function
public class PrimeCheck {
    public static boolean isPrime( int n){
        if(n == 2){
            return true;
        }
        for(int i =2; i<=Math.sqrt(n);i++){
            if(n % i == 0){ // completely divisible
            return false;
        }
    }
        return true;
    }
    public static void main(String[] args) {
       System.out.println(isPrime(15));
    }
}


