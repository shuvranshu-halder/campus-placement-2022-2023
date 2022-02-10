// Write a program to calculate the power of a number.
import java.util.*;

public class power {

    static int CalculatePower(int nmbr,int power){
        int value=0;
        if(power!=0){
           value=nmbr* CalculatePower(nmbr,power-1);
        }else{
            return 1;
        }

        return value;
    }

    public static void main(String[] args){
        Scanner nmbr_inp= new Scanner(System.in);
        Scanner power_inp= new Scanner(System.in);
        System.out.println("Enter number:");
        int nmbr=nmbr_inp.nextInt();
        System.out.println("Enter power:");
        int power=power_inp.nextInt();
        int value=CalculatePower(nmbr,power);
        System.out.println("value:"+value);
    }
}
