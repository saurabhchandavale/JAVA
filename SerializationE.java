package p2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationE {
    public static void main(String[] args) throws IOException {
         Vehicle polo = new Vehicle("Volkswagen","polo41",2001);
        try {
            FileOutputStream fileout = new FileOutputStream("polo.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(polo);
            out.close();
            fileout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Serialized data is saved in polo.ser");
    }
}
