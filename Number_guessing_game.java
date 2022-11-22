// Online Java Compiler
// Use this editor to write, compile and run50
import java.util.*;


class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x,num,y,m;   
        num = 1+(int)(100*Math.random());
        y = 0;
        m=10
        System.out.println("Enter your choice");
        do{
            x = sc.nextInt();
            if(x>num){
                System.out.printf("Enter lower one only you have %d coices : \n",m);
            }else if(x<num){
                System.out.printf("Enter Bigger one only you have %d choice  :");
            }else{
                System.out.println("you found it in "+ y +"choices");
            }
            y+=1;
            m-=1;
        }while(y<10);
        
    }
}
