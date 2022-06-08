/* Recursive Assignment 
 * Stephano Ghdaye
 * ICS4U
 * November 21, 2018
 * This program will find the product of the first n integers, generate the first n terms of the recursive sequence given their definitions,
 * find the n-th element of the following sequences, find the gcd of two given numbers and calculate the fractorial of
 * a given number. 
 */
 
class recursiveFunctions {

  public static void main(String [] args){
  
  int n = 6;
    
  //Outputs
    System.out.println(prod(n));
    System.out.println(firstSequence(n));
    System.out.println(secondSequence(n));
    System.out.println(fibonacci(n));
    System.out.println(thirdSequence(n));
    System.out.println(fourthSequence(n));
    System.out.println(fractorial(n));
  }
  
  //Finds the product of the first n integers:also known as n!
  public static long prod (int n){
  if (n < 0)
  throw new RuntimeException("Invalid parameter");
  else if (n == 1 || n==0)
    return 1;
  else
    return n * prod(n-1);
  }
  
  //Generates first n terms of the recursive sequences given their definitions. a) t1 = 3; tn = tn-1 - n!
  public static long firstSequence (int n){
    if (n < 1)
      throw new RuntimeException("Invalid parameter");
    if (n == 1)
      return 3;
    
    return firstSequence(n-1) - prod(n);
  }

  //Generates first n terms of the recursive sequences given their definitions. b) t1=-4;t2 = -7; 2tn-1+3 tn-2
  public static long secondSequence (int n){
  if (n < 1)
      throw new RuntimeException("Invalid parameter");
    if (n == 1)
      return -4;
    if (n == 2)
      return -7;
    return 2 * secondSequence(n-1) + 3 * secondSequence(n-2);
  }
  //Recursive function that finds the n-th element of the following sequence. Fibonacci sequence
  public static long fibonacci (int n){
    if(n < 1)
      throw new RuntimeException("Invalid parameter");
    if(n == 1 || n == 2)
      return 1;
    return fibonacci(n - 2) + fibonacci(n - 1); 
  }
  
  //Recursive function that finds the n-th element of the following sequence. 1,4,8,13,19,26
  public static long thirdSequence(int n){
    if (n < 1)
      throw new RuntimeException("Invalid parameter");
    if (n == 1)
      return 1;
    return thirdSequence(n-1) +n+ 1;
  }
   
  //Recursive function that finds the n-th element of the following sequence. 1,2,2,4,8,11,33,37,148
  public static long fourthSequence(int n){
    if (n < 1)
      throw new RuntimeException("Invalid parameter");
    if (n == 1)
      return 1;
    if(n%2 == 0)
     return fourthSequence(n-1) +(n/2);
    return fourthSequence(n-1)*(n/2);
  }
  //Recursive function that returns the greatest common divisor of x and y
  public static long gcd(long x, long y){
    if (y==0){
    return x;
    }
    //if(x >= y && y > 0){
    return gcd(y, (x % y));
    //}
  
  }
  //Recursive function that will calculate fractorials
  public static long fractorial(int n){
    if (n< 1)
      throw new RuntimeException("Invalid parameter");
    if(n==1) {
      return 1; 
    } 
    else { 
  return n * fractorial(n-1) / gcd(n,fractorial(n-1)) ;
  }
  }
}
//End program
  
