

// Write a program to display the sequence 14, 28, 20, 40, 32, 64, .......................

import java.util.Scanner;

public class series9 {
    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int terms=inp.nextInt();

        int start=14;
        int diff=6;
        int prev=0;
        for(int i=1;i<=terms;i++){

            if(i==1){
                System.out.print(start+",");//20
                prev=start;//20
            }else if(i%2!=0){
                    System.out.print(start+",");//20
                    prev=start;//20
                    int mult=(i/2)+1;//1
                    diff*=mult;     //6 
                }else{
                    System.out.print(prev*2+",");
                    start+=diff;//20
            }
            
        }
    }
}
