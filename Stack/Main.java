package Stack;
import java.util.Scanner;

public class Main{
    public static void menu(){
        System.out.println("1. push");
        System.out.println("2. pop");
        System.out.println("3. stack");
        System.out.println("Q. 종료");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("stack의 크기 : ");
        int T = sc.nextInt();
        Stack stack = new Stack(T);
        boolean flag = true;
        
        while(flag) {
            menu();
            String s = sc.next();

            switch (s) {
                case "1":
                    System.out.print("push : ");
                    String data = sc.next();
                    stack.push(data);
                    break;
                case "2":
                    System.out.println("pop : " + stack.pop());
                    break;
                case "3":
                    stack.printStack(stack);
                    break;
                case "Q":
                case "q":
                    flag = false;
                    break;
            }
        }
    }
}