package text_and_binary_io;

import java.io.*;

public class TestDataStream {
    static void main(String[] args) {
        try (
                // Create an output stream for a file
                DataOutputStream output = new DataOutputStream(new FileOutputStream("temp1.dat"))
                ) {
            // Write student test scores to the file
            output.writeUTF("Onyango");
            output.writeDouble(90.6);

            output.writeUTF("Dickens");
            output.writeDouble(85.5);
        } catch (IOException exception) {
            exception.printStackTrace();
        }


        try (
                // Create an input stream for a file
                DataInputStream input = new DataInputStream(new FileInputStream("temp1.dat"))
                ) {
            // Read student test scores from the file
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble()); // To force EOFException
        } catch (EOFException exception) {
            System.out.println("All data were read");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
