//program: Product of two numbers using Functions
//concept used: Functions and Return type
public class ProductOfTwoNumbers{
    public static int multiply(int a , int b){
        int product =  a * b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int b = 3;
        int prod = multiply(a,b);
        System.out.println("a * b:"+ prod);
        prod = multiply(100, 200);
        System.out.println("a * b:"+ prod);
    }
}
