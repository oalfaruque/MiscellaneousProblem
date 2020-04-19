package miscellaneousproblems;

import java.io.*;

//Class to do Serialization must implement Interface Serializable
class TwoNumbers implements Serializable {

    int number1 = 25;
    int number2 = 50;
    }

public class SerializationAndDeserializationConcept {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TwoNumbers twoNumbers = new TwoNumbers();

        //Serialization:(Converting an Object into a File)
        FileOutputStream myFileOutputStream = new FileOutputStream("TwoNumbers.txt");
        ObjectOutputStream myObjOutputStream = new ObjectOutputStream(myFileOutputStream);
        myObjOutputStream.writeObject(twoNumbers);


        //Deserialization:(Converting a File into an Object)
        FileInputStream myFileInputStream = new FileInputStream("TwoNumbers.txt");
        ObjectInputStream myObjInputStream = new ObjectInputStream(myFileInputStream);
        TwoNumbers myFile = (TwoNumbers) myObjInputStream.readObject();

        System.out.println("First Number: "+ myFile.number1);
        System.out.println("Second Number: " + myFile.number2 );
    }
}



