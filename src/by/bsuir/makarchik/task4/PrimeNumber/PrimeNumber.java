package by.bsuir.makarchik.task4.PrimeNumber;

public class PrimeNumber {
    public static boolean isPrime(int val){
        for(int i = 2; i <= Math.round(Math.sqrt(val)); i++)
            if(val % i == 0)
                return false;
        return true;
    }
}
