package miscellaneousproblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderAndPalindromeConcept {
    public static void getInputFromTheUser() throws IOException {
        //get a text String as an input from a file
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Omar Al-Faruque\\Documents\\sample.txt"));
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));//get input a String from the user
        System.out.println("Input your string please: ");
        String str = br.readLine();
        System.out.println("============================");
        System.out.println("You have input: " + str);
        String reverseString = "";
        for(int i = str.length()-1; i >=0; i--){
            reverseString = reverseString + str.charAt(i);
        }
        System.out.println("The reversed string is: " + reverseString);
        if (str.equalsIgnoreCase(reverseString))
            System.out.println(str + " is a palindrome String");
        else
            System.out.println(str + " is not a palindrome String");
    }
    public static void main(String[] args) throws IOException {
        getInputFromTheUser();
    }
}
