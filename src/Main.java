import java.io.*;

public class Main {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {

                String replacedLine = line.replaceAll("Nha Trang", "Vũng Tàu");

                writer.write(replacedLine);
                writer.newLine();
            }
            System.out.println("Replacement completed. Check output.txt for the result.");
        } catch (IOException e) {
            System.err.println("Error occurred while processing the file: " + e.getMessage());
        }
    }
}
