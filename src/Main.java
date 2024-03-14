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
            System.out.println("đoạn thay: ");
        } catch (IOException e) {
            System.err.println("ko tìm thấy file! " + e.getMessage());
        }
    }
}
