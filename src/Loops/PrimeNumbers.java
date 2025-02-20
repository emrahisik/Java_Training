package Loops;

public class PrimeNumbers {

    public static boolean isPrime (int number) {
        if (number<=2) return number==2;
        int cap = (int) Math.ceil(Math.sqrt(number));
        for(int i=2; i<cap; i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrime(17));
        System.out.println(isPrime(97));
    }
}
