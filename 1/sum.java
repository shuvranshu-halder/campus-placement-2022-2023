// Write a program to calculate the sum of n natural numbers.
import java.util.*;

public class sum {

    static int sum(int n){
        if(n==1){
            return 1;
        }else{
            return n+sum(n-1);
        }
    }

    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter n:");
        int n=inp.nextInt();
        int sum=sum(n);
        System.out.println("Summation:"+sum);
    }
}
