import java.rmi.server.SocketSecurityException;
import java.util.*;

import javax.swing.plaf.synth.SynthLookAndFeel;
public class calculation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number");
        int a = sc.nextInt();
        System.out.println("enter your second number");
        int b = sc.nextInt();
        System.out.println("enter your mathed");
        int operator = sc.nextInt();
        /**
         * 1 -> +
         * 2 -> -
         * 3 -> *
         * 4 -> /
         * 5 -> %
         */
        switch(operator) {
            case 1 : System.out.println("Addition is : "+(a+b));
                break;
            case 2 : System.out.println("Subtraction is : "+(a-b));
                break;
            case 3 : System.out.println("Multiplecation is : "+(a*b));
                break;
            case 4 : if(b == 0) {
                System.out.println("Invalid Division");
            } else {
                System.out.println("Division is : "+(a/b));
            }
                break;
            case 5 : if(b == 0) {
                System.out.println("Invalid Division");
            } else {
                System.out.println(a%b);
            }
                break;
            default : System.out.println("Invalid Operator");
        }

    }

}



