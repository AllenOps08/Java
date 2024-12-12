class Main{
 public static void main(String[] args) {
    System.out.println("Recursive factorial of 5 is : " + recursiveFactorial(5) );
    System.out.println("Fibonacci of 10 : " + recursiveFibonacci(10));
 }  
 
 
 public static int recursiveFactorial(int n){
    if(n==0 || n==1) return 1;

    return n * recursiveFactorial(n-1);
 }

 public static int recursiveFibonacci(int n){
    if (n<=1) return n; 

    return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
 }
}