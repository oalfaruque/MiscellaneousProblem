package miscellaneousproblems;

public class StarPyramid {
    public static void main(String[] args) {
        int totalLayers = 5;
        for(int layer = 1; layer<=totalLayers; layer++) {

            for (int space = layer; space < totalLayers; space++)
                System.out.print(" ");//to print empty spaces in every layer
            for (int character = 1; character<(layer*2); character++)
                System.out.print("*");//to print the character and an empty space between them
                System.out.print("\n");//to go to the next line
        }
    }
}
