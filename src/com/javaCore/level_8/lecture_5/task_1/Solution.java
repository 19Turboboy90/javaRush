package com.javaCore.level_8.lecture_5.task_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Исправить функциональность в соответствии с требованиями.

Программа должна:
1. Переписать все байты одного файла в другой одним куском.
2. Закрывать потоки ввода-вывода.

Подсказка:
4 ошибки.

Требования:
•	Программа должна использовать классы FileInputStream и FileOutputStream.
•	Программа должна переписать все байты одного файла в другой одним куском.
•	Потоки FileInputStream и FileOutputStream должны быть закрыты.
•	Нужно исправить 4 ошибки.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("c:/result.txt");
        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }
        inputStream.close();
        outputStream.close();
    }
}
