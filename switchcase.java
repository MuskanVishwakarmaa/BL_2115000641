import java.sql.SQLOutput;
import java.util.*;
import java.util.Scanner;
public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1 ");
        int a = sc.nextInt();
        System.out.println("enter number 2 ");
        int b = sc.nextInt();
        System.out.println("enter your choice ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Error: invalid choice---->> pls choose b/w 1-4");
        }
        sc.close();
    }
}
