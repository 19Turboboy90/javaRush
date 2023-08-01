package com.javaCore.level_8.lecture_11.task_4;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
В метод main первым параметром приходит путь к файлу.
Посчитать количество символов в файле, которые соответствуют буквам английского алфавита.
Вывести на экран число (количество символов).
Закрыть потоки.

Требования:
•	Считывать с консоли ничего не нужно.
•	Создай поток чтения из файла, который приходит первым параметром в main.
•	В файле необходимо посчитать количество символов, которые соответствуют буквам английского алфавита,
и вывести это число в консоль.
•	Нужно учитывать заглавные и строчные буквы.
•	Поток чтения из файла должен быть закрыт.
 */
public class Solution {
    private final static Character[] ENGLISH_CHARACTERS_ARRAY = new Character[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L'
            , 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'
            , 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private final static Set<Character> ENGLISH_CHARACTERS = new HashSet<>(Arrays.asList(ENGLISH_CHARACTERS_ARRAY));

    public static void main(String[] args) throws IOException {
        int countOfEnglishChars = 0;
        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                char readChar = (char) fileReader.read();
                if (ENGLISH_CHARACTERS.contains(readChar)) countOfEnglishChars++;
            }
        }
        System.out.println(countOfEnglishChars);
    }
}
