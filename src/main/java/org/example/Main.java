package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку текста через пробел: ");
        String inputText = scanner.nextLine();
        String[] wordArray = inputText.split("\\s+");

        int wordCount = 0;
        for (int index = 0; index < wordArray.length; index++) {
            if (wordArray[index].startsWith("А")) {
                wordArray[index] = "а" + wordArray[index].substring(1);
                wordCount++;
            }
        }

        String updatedText = String.join(" ", wordArray);
        System.out.println("Текст после замены: " + updatedText);
        System.out.println("Количество слов, которые начинались на 'А': " + wordCount);
    }
}
