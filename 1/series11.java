// Write a program to display the sequence A1, B2, C3, ...., Y25,Z26, A1, B2,...............

import java.util.Scanner;

public class series11 {


    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int terms=inp.nextInt();

        char first='A';
        int second=1;
        int count=0;
        for(int i=1;i<=terms;i++){
            String first_string=Character.toString(first);
            System.out.print(first_string+second+",");
            first++;
            second+=1;
            count++;
            if(count==26){
                first='A';
                second=1;
                count=0;
            }
            
            
        }
    }
}
