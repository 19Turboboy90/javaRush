package com.JavaSyntaxPro.level_16.lecture_2.task_1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/*
Напиши программу, которая считывает с консоли путь к файлу1 и путь к файлу2. Далее все байты из файла1 записывает в файл2,
но при этом меняет их местами по такому принципу: первый со вторым, третий с четвертым, и т.д.
Если последний байт в файле1 нечетный, то пишем его в файл2 как есть. Для чтения и записи файлов используй
методы newInputStream и newOutputStream класса Files.

Требования:
•	Программа должна считать с консоли пути к файлам.
•	Программа должна переписывать байты из одного файла в другой согласно условию.
•	Для чтения и записи файлов должны быть использованы методы newInputStream и newOutputStream класса Files.
•	Потоки для чтения и записи должны быть закрыты.
•	Не используй следующие классы File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.
 */
public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))) {

            byte[] input = inputStream.readAllBytes();
            byte[] output = new byte[input.length];
            for (int i = 0; i < input.length; i += 2) {
                if (i < input.length - 1) {
                    output[i] = input[i + 1];
                    output[i + 1] = input[i];
                } else {
                    output[i] = input[i];
                }
            }
            outputStream.write(output);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}