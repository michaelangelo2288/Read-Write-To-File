import javax.print.DocFlavor;
import java.io.*;
import java.util.Arrays;
import java.util.logging.Logger;

public class ReadWrite {

    public static void main(String[] args) {

        String filePath = System.getProperty("user.dir");

        try {
            FileWriter writer = new FileWriter(filePath + File.separator + "test.txt");
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("this is a test\nmy name is mike\ni live in oakland");
            bw.close();
            writer.close();
            System.out.println("write file success!");

            FileReader reader = new FileReader(filePath + File.separator + "test.txt");
            BufferedReader br = new BufferedReader(reader);
            int i;
            String readFile = "";
            while((i=br.read()) != -1){
//                System.out.print((char)i);
                readFile = readFile + new StringBuilder().append((char)i).toString();
            }
            br.close();
            reader.close();

            System.out.println("\nread file success:");
            System.out.println(readFile);
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
