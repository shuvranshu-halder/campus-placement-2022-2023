// Write a program to display the sequence 21, 9, 21, 11, 21, 13, 21, .................

import java.util.Scanner;
public class series8 {
    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int terms=inp.nextInt();

        int start=9;
        for(int i=0;i<terms;i++){
            if(i%2!=0){
                System.out.print(start+",");
                start+=2;
            }else{
                System.out.print(21+",");
            }
        }

    }
}
