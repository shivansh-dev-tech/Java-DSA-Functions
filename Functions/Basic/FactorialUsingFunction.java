//Program: Factorial using function
//conecpt: Functions and Loops
public class FactorialUsingFunction{
    public static int Factorial(int n){
       int Fact = 1;
      for(int i = 1;i<=n:i++){
        fact *= i;
    }
      return fact;
    public static void main(String[] args) {
       System.out.println(Factorial(4));
       System.out.println(Factorial(11));
    }
}
