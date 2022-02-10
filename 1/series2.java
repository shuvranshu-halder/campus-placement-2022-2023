// Write a program to display the sequence 1, 2, 2, 4, 8, 32, 256,....................

import java.util.Scanner;

public class series2 {
    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int terms=inp.nextInt();
        int arr[]=new int[terms];
        for(int i=0;i<terms;i++){
            if(i==0){
                arr[i]=1;
                System.out.print(1+",");
            }else if(i==1){
                arr[i]=2;
                System.out.print(2+",");

            }else{
                arr[i]=arr[i-1]*arr[i-2];
                System.out.print(arr[i]+",");
            }
        }
    }
}
