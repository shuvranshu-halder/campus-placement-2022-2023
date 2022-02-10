// 5. Write a program to display the sequence 1, 4, 9, 16, 25, 36, 49,....................

import java.util.Scanner;

public class series3 {

    static int square(int n){
        return n*n;
    }
    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int terms=inp.nextInt();

        for(int i=1;i<=terms;i++){
            System.out.print(square(i)+",");
        }
    }
    
}
