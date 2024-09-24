package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Setofpolygonalnumbers {
    public static void main(String[] args) throws IOException {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();


        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\denis\\OneDrive\\Рабочий стол\\testforclasswork.txt"));
        String line = reader.readLine();
        boolean isFirstList = true;

        while (line != null) {
            String[] numbers = line.split("\\s+");

            for (String numStr : numbers) {
                int number = Integer.parseInt(numStr);

                if (number < 0) {
                    isFirstList = false;
                    continue;
                }

                if (isFirstList) {
                    list1.add(number);
                } else {
                    list2.add(number);
                }
            }

            line = reader.readLine();
        }

        reader.close();

        Collections.sort(list1);
        Collections.sort(list2);

        System.out.println("Список C1 (первый набор): " + list1);
        System.out.println("Список C2 (второй набор): " + list2);

        List<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);

        Collections.sort(mergedList);

        System.out.println("Объединенный и отсортированный список: " + mergedList);
    }
}
