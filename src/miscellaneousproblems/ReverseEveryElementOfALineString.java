package miscellaneousproblems;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseEveryElementOfALineString {
    static String givenString, word;
    public static void inputAndReversString(){
        //Scanner is used to get the Input from the user
        Scanner scanner = new Scanner(System.in);//creating scanner object
        System.out.print("Input your string of multi words please: ");//asking the user to input a String of multi words
        givenString = scanner.nextLine();//to read the string line input by the user

        String[] myArrayString = givenString.split(" ");//Splitting the Given String by the user
        String splitString = (Arrays.toString(myArrayString));//To print String array as an Array
        System.out.println(splitString);//Just to see if Given String is split

        for(int i = 0; i < myArrayString.length; i++){
            word = myArrayString[i];//To hold the array, word by word temporarily
            char[] myCharArray = word.toCharArray();//To create char[] for every word
            for(int j = myCharArray.length-1; j>=0; j--){
                System.out.print(myCharArray[j]);//To reverse the word
            }
            System.out.print(" ");//To maintain the spaces between the reversed word
        }
    }
    public static void main(String[] args) {
        inputAndReversString();
    }
}
