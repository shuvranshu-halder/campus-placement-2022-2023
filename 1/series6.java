// Write a program to display the sequence 1, 2, 4, 7,11,...............
// So, the rule boils down to:

// 1 + 0 , 1 + 1, 2 + 2, 4 + 3, 7 + 4 , 11 + 5, 16 + 6,  22 + 7, ...

import java.util.Scanner;

public class series6 {
    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int terms=inp.nextInt();
        int prev=1;
        for(int i=0;i<terms;i++){
            int temp=i+prev;
            System.out.print(temp+",");
            prev=temp;
            
        }    

    }
}
