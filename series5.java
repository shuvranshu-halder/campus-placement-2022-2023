// Write a program to display the sequence 7, 10, 8, 11, 9, 12, .................

import java.util.Scanner;

public class series5 {
    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int terms=inp.nextInt();
        int odd=7;
        int even=10;
        for(int i=1;i<=terms;i++){
            if(i%2!=0){
                System.out.print(odd+",");
                odd++;
            }else{
                System.out.print(even+",");
                even++;
            }
        }
    }
}
