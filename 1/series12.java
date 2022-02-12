// Write a program to display the sequence A, Z, X, B, V,........................
import java.util.Scanner;

public class series12 {

    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
    System.out.println("Enter number of terms:");
    int terms=inp.nextInt();
    if(terms<=26){
        char front='A';
        char rear='Z';
        for(int i=1;i<=terms;i++){
    
            if(i==1){
                System.out.print(front+",");
                front++;
            }
            else if(i%4==0){
                System.out.print(front+",");
                front++;
            }else{
                System.out.print(rear+",");
                rear-=2;
            }
        }

    }else{
        System.out.println("Error:enter a number between 1-18.");
    }

    }
}
