package miscellaneousproblems;

import java.util.Scanner;

public class SwapNumbers {
    public static void swappingTwoNumbers(){
        int temp;
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Input first number: ");
        int number1 = scanner1.nextInt();

        System.out.print("Input second number: ");
        int number2 = scanner1.nextInt();

        temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("===========After Swapping=============");
        System.out.println("First number is: " + number1);
        System.out.println("Second number is: " + number2);
    }

    public static void main(String[] args) {
        swappingTwoNumbers();
    }
}
