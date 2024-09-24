package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Variouswords{
    public static void main(String[] args) throws IOException {
        TreeSet<String> uniqueWords = new TreeSet<>();
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\denis\\OneDrive\\Рабочий стол\\testforclasswork.txt"));

        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
            for (String word : currentLine.split("\\s+")) {
                uniqueWords.add(word.toLowerCase());
            }
        }

        reader.close();
        System.out.println("Уникальные слова: ");
        uniqueWords.forEach(System.out::println);
    }
}
