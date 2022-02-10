// 1. Write a program to display the series 0,0,2,1,4,2,6,3,8,4,............................
import java.util.*;

public class series1 {
    public static void main(String[] args ){
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int terms=inp.nextInt();
        int j=0;
        for(int i=0;i<terms;i++){
            
            if(i==0){
                System.out.print(0+",");
            }else if(i==1){
                System.out.print(j+",");
                j++;
            }else if(i%2==0){
                System.out.print(i+",");
            }else{
                System.out.print(j+",");
                j++;
            }
        }
    }
}
