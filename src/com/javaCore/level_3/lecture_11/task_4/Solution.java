package com.javaCore.level_3.lecture_11.task_4;

import java.io.*;

/*
В этой задаче тебе нужно:
Прочесть с консоли имя файла.
Считывать строки с консоли, пока пользователь не введет строку "exit".
Записать абсолютно все введенные в п.2 строки в файл: каждую строчку — с новой строки.
Требования:
•	Программа должна считывать c консоли имя файла.
•	Создай и используй объект типа BufferedWriter.
•	Программа не должна ничего считывать из файловой системы.
•	Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
•	Программа должна записать все введенные строки (включая "exit", но не включая имя файла) в файл: каждую строчку — с новой строки.
•	Метод main должен закрывать объект типа BufferedWriter после использования.
•	Метод main не должен выводить данные на экран.
 */
public class Solution {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(bufferedReader.readLine()))) {

            StringBuilder builder = new StringBuilder();

            String s = "";
            while (!s.equals("exit")) {
                s = bufferedReader.readLine();
                builder.append(s).append("\n");
            }
            bufferedWriter.write(builder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
