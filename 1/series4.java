// Write a program to display the sequence 1, 2, 4, 8, 16, 32, 64,....................
import java.util.*;

public class series4 {

    
    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int terms=inp.nextInt();
        int temp=1;
        for(int i=0;i<terms;i++){
            if(i==0){
                System.out.print(1+",");
        }else{
                temp*=2;
            System.out.print(temp+",");
            }
            
        }
    }
}
