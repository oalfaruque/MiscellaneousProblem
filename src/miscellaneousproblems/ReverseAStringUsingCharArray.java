package miscellaneousproblems;

import java.util.Scanner;

public class ReverseAStringUsingCharArray {
    static String myString;
    public static void inputAndReversString(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your string please: ");
        myString = scanner.next();

        char[] myCharArray = myString.toCharArray();
        for(int i = myCharArray.length-1; i>=0; i--){
            System.out.print(myCharArray[i]);
        }
    }

    public static void main(String[] args) {
        inputAndReversString();
    }
}
