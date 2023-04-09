package com.javaCore.level_8.lecture_11.task_1;

import java.io.*;

/*
Придумать механизм шифровки/дешифровки.

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName

где:
fileName - имя файла, который необходимо зашифровать/расшифровать.
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования.
-e - ключ указывает, что необходимо зашифровать данные.
-d - ключ указывает, что необходимо расшифровать данные.

Требования:
•	Считывать с консоли ничего не нужно.
•	Создай поток для чтения из файла, который приходит вторым параметром ([fileName]).
•	Создай поток для записи в файл, который приходит третьим параметром ([fileOutputName]).
•	В режиме "-e" программа должна зашифровать [fileName] и записать в [fileOutputName].
•	В режиме "-d" программа должна расшифровать [fileName] и записать в [fileOutputName].
•	Созданные для файлов потоки должны быть закрыты.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        String param = args[0];
        if (!(param.equals("-e") || param.equals("-d"))) return;
        try (FileInputStream fileInputStream = new FileInputStream(args[1]);
             FileOutputStream fileOutputStream = new FileOutputStream(args[2])) {

            if (param.equals("-e")) {
                while (fileInputStream.available() > 0) {
                    int read = fileInputStream.read();
                    fileOutputStream.write(read + 1);
                }
            } else {
                while (fileInputStream.available() > 0) {
                    int read = fileInputStream.read();
                    fileOutputStream.write(read - 1);
                }
            }
        }
    }
}
