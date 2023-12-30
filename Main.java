import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        InteractiveStack stack = new InteractiveStack();
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Choose an option:");
            System.out.println("1. Add an element.");
            System.out.println("2. Pop an element from the stack.");
            System.out.println("3.Exit");
            int option = input.nextInt();

            switch(option){
                case 1:
                    System.out.println("Enter to add a number.");
                    int numberToAdd = input.nextInt();
                    stack.push(numberToAdd);
                    System.out.println(stack.display());
                    break;
                case 2:
                    stack.pop();
                    System.out.println("Top element has been popped.");
                    System.out.println(stack.display());
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    System.out.println(stack.display());
                    System.exit(0);
            }
        }
    }
}
