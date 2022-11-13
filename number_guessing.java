// Online Java Compiler
// Use this editor to write, compile and run50
import java.util.*;


class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x,num,y;   
        num = 1+(int)(100*Math.random());
        y = 0;
        System.out.println("Enter your choice");
        do{
            x = sc.nextInt();
            if(x>num){
                System.out.println("Enter lower one  :");
            }else if(x<num){
                System.out.println("Enter Bigger one :");
            }else{
                System.out.println("you found it in "+y+"choices");
            }
            y+=1;
        }while(y<9);
        
    }
}