package miscellaneousproblems;

import java.util.Scanner;

public class PrimeNumber {
    public static void checkPrimeNumber() {
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your Number please: ");
        int givenNumber = scanner.nextInt();

        for (int i = 2; i < givenNumber/2; i++) {
            if (givenNumber % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(givenNumber + " is a Prime Number");
        else
            System.out.println(givenNumber + " is NOT a Prime Number");
    }
    public static void main(String[] args) {
        checkPrimeNumber();
    }
}
