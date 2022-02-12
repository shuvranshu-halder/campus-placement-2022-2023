// Write a program to display the sequence A1, B2, C4, D8, E16, F32, .................

import java.util.Scanner;

public class series10 {
    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int terms=inp.nextInt();

        char first='A';
        int second=1;
        for(int i=1;i<terms;i++){
            System.out.print(first);
            System.out.print(second+",");
            first++;
            second*=2;
        }
    }
}
