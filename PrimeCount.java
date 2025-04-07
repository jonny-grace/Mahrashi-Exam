// 1. Write a function named primeCount with signature
// int primeCount(int start, int end);
// The function returns the number of primes between start and end inclusive. Recall that a prime is
// a positive integer greater than 1 whose only integer factors are 1 and itself.

package MahrashiQuestion;

public class PrimeCount {

    public static void main(String[] args) {
        System.out.println(primeCount(10,100));
    }

   static int primeCount(int start, int end){
    //check if start is lessthan or equal to end
   
    if(start > end) return 0;
    if(end < 2) return 0;
    //check if start is -ve number then we should start from 0 
    if(start <= 1){
        start=2;
    }
    int counter=0;
    for(int num = start; num<=end; num++){
        boolean isPrime=true;// 2 and 10 
         for(int i=2; i<= Math.sqrt(num); i++){
           if(num%i==0){
               isPrime=false;
            break;
           }
         }
         if(isPrime){
            counter+=1;
            isPrime=true;
         }
    }
    
    return counter;
    }
}