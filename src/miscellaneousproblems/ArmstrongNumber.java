package miscellaneousproblems;

import java.util.Scanner;

public class ArmstrongNumber {
    public  static int  givenNumber, temp, reminder, sum;

    public static void findingArmstrongNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your number please: ");
        givenNumber = scanner.nextInt();
        temp = givenNumber;//to compare it later on we put 'givenNumber' in the 'temp'

        while (givenNumber > 0) {
            reminder = givenNumber % 10;//to find the reminder or the last digit of the number
            givenNumber = givenNumber / 10;//to find the number after taking out the last digit
            sum = sum + reminder * reminder * reminder;//to get every digits cube and adding them
        }
        if (sum == temp){
            System.out.println(temp + " " + "is an Armstrong Number");
        }else
            System.out.println(temp + " " + "is not an Armstrong Number");
    }

    public static void main(String[] args) {
        findingArmstrongNumber();
    }

}
