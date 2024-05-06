package Stack;

/**
 * Created by: IntelliJ IDEA
 * User      : boyng
 * Date      : 06/02/2024
 * Time      : 5:45 CH
 * Filename  : main
 */
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();

        System.out.println("Stack: ");
        stack.printStack();
    }
}
