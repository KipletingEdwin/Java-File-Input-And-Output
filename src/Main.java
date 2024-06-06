import java.io.*;

public class Main {
    public static void main(String[] args) {

        String[] names = {"John", "Carl", "Jerry"};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("/home/edwin/Downloads/output.txt"));
            writer.write("Writing to a file.");
            writer.write("\nHere is another line");

            for (String name : names) {
                writer.write("\n" + name);
            }
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("/home/edwin/Downloads/output.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
