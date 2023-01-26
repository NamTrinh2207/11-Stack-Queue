import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a size: ");
        int size = input.nextInt();
        ReverseArrayOfIntegers<Integer> stack = new ReverseArrayOfIntegers<>();
        System.out.println("Before--------");
        for (int i = 0; i < size; i++) {
            stack.push(i);
        }
        System.out.println(stack);

        System.out.println("After--------");
        ReverseArrayOfIntegers<Integer> stack2 = new ReverseArrayOfIntegers<>();
        for (int i = stack.size(); i > 0; i--) {
            int del = stack.pop();
            stack2.push(del);
        }
        System.out.println(stack2);
    }
}