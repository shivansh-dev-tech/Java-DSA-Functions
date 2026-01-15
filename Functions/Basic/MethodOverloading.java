// Demonstrates method overloading using different parameter types and counts

public class MethodOverloading {
  //Add two integer
    public static int sum(int a , int b ){
        return a + b ;
    }
  //Add two decimal integer
    public static float sum(float a , float b){
       return a + b;
    }
     public static void main(String[] args) {
     System.out.println((sum(1,5)));
     System.out.println(sum(2.4f ,4.5f));
}
    
}
