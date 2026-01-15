// This code prints all prime numbers with in a range enterd by user
// coecpt used : loops + method overloading
public class CountPrimes {
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
    //print primes in range
     public static void PrimesInRange(int n){
        for(int i = 2 ; i<=n;i++){
            if(isPrime(i)){
            System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
       System.out.println(isPrime(15));
    }
}
