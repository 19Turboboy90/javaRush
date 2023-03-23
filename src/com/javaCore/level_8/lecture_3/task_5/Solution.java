package com.javaCore.level_8.lecture_3.task_5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/*
Ввести с консоли имя файла.
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран.
Закрыть поток ввода-вывода.

Пример байт входного файла:
44 83 44

Пример вывода:
44 83

Требования:
•	Программа должна считывать имя файла с консоли.
•	Для чтения из файла используй поток FileInputStream.
•	В консоль через пробел должны выводиться все уникальные байты из файла в порядке возрастания.
•	Данные в консоль должны выводится в одну строку.
•	Поток чтения из файла должен быть закрыт.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file = bufferedReader.readLine();
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            Set<Integer> integerSet = new TreeSet<>();
            while (fileInputStream.available() > 0) {
                int date = fileInputStream.read();
                integerSet.add(date);
            }
            List<Integer> result = integerSet.stream().sorted().collect(Collectors.toList());
            result.forEach(r -> System.out.print(r + " "));
        }
    }
}
