package com.javaCore.level_3.lecture_11.task_11;

import java.io.*;
import java.util.*;

/*
В этой задаче тебе нужно:
Ввести имя файла с консоли.
Прочитать из него набор чисел.
Вывести в консоли только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10

Пример вывода:
-2
2
8
10

Требования:
•	Программа должна считывать данные с консоли.
•	Программа должна создавать FileInputStream для введенной с консоли строки.
•	Программа должна выводить данные на экран.
•	Программа должна вывести на экран все четные числа, считанные из файла, отсортированные по возрастанию.
•	Программа должна закрывать поток чтения из файла — FileInputStream.
 */
public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             Scanner console = new Scanner(new FileInputStream(reader.readLine()))) {
            List<Integer> list = new ArrayList<>();
            while (console.hasNextInt()) {
                int number = console.nextInt();
                if (number % 2 == 0) {
                    list.add(number);
                }
            }
            list.sort(Integer::compareTo);
            list.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
