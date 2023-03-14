package com.javaCore.level_7.lecture_10.task_12;
/*
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла.
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines.
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines.
4. Если условие из п.3 не выполнено, то:
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
Не забудь закрыть потоки.

Требования:
•	Класс Solution должен содержать public static поле allLines типа List<String>.
•	Класс Solution должен содержать public static поле forRemoveLines типа List<String>.
•	Класс Solution должен содержать public void метод joinData() который может бросать исключение CorruptedDataException.
•	Программа должна считывать c консоли имена двух файлов.
•	Программа должна считывать построчно данные из первого файла в список allLines.
•	Программа должна считывать построчно данные из второго файла в список forRemoveLines.
•	Метод joinData должен удалить в списке allLines все строки из списка forRemoveLines, если в allLines содержаться все строки из списка forRemoveLines.
•	Метод joinData должен очистить список allLines и выбросить исключение CorruptedDataException, если в allLines не содержаться все строки из списка forRemoveLines.
•	Метод joinData должен вызываться в main.
 */

import java.io.BufferedReader;
import java.io.FileReader;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws CorruptedDataException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String fileName1 = bufferedReader.readLine();
            String fileName2 = bufferedReader.readLine();
            bufferedReader.close();

            BufferedReader reader1 = new BufferedReader(new FileReader(fileName1));
            String input;
            while ((input = reader1.readLine()) != null) {
                allLines.add(input);
            }
            reader1.close();
            BufferedReader reader2 = new BufferedReader(new FileReader(fileName2));

            while ((input = reader2.readLine()) != null) {
                forRemoveLines.add(input);
            }
            reader2.close();

            new Solution().joinData();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
