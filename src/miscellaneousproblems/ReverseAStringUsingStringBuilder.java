package miscellaneousproblems;

import java.util.Scanner;

public class ReverseAStringUsingStringBuilder {
    static String myString;

    public static void inputAndReverseYourString(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your String please: ");
        myString = scanner.next();

        StringBuilder myStringBuilder = new StringBuilder();
        myStringBuilder.append(myString);
        myStringBuilder = myStringBuilder.reverse();
        System.out.println("After reversing the String :" +myStringBuilder);
    }

    public static void main(String[] args) {
        inputAndReverseYourString();
    }
}
