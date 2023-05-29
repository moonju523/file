package school;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Tester4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sentenceCount = 0;
        
        try (FileWriter fileWriter = new FileWriter("pra.txt", true)) {
            while (sentenceCount < 4) {
                System.out.print("문장을 입력하세요: ");
                String sentence = scanner.nextLine();
                
                String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                String praEntry = timestamp + " " + sentence + "\n";
                
                fileWriter.write(praEntry);
                sentenceCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
