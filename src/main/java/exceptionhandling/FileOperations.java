package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) {
        String file1 = "C:\\Users\\prath\\OneDrive\\Desktop\\prathibha.txt";
        try (BufferedReader br= new BufferedReader(new FileReader(file1)))
        {
            String line;

            while((line = br.readLine())!=null)
            {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
