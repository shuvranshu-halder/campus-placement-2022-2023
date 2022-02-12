import java.util.Scanner;

// Write a program to display the sequence 1, 1, 5, 5, 9, 9, 13, 13, .............................


public class series7 {
    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int terms=inp.nextInt();

        int start=1;
        for(int i=1;i<=terms;i++){
            System.out.print(start+",");
            if(i%2==0){
                start+=4;
            }
        }
    }
}
