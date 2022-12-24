package com.javaCore.level_4.lecture_8.task_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
У нас есть кинофабрика, но она работает не в полную силу.
Давай расширим ее функционал по аналогии с тем, что уже есть, и добавим чтение с консоли.
Вот что тебе нужно сделать для успешного решения:
1. Разобраться, что программа умеет делать.
2. Все классы должны быть внутри класса Solution.
3. Добавить классы Cartoon, Thriller.
4. Разобраться, как мы получаем объект класса SoapOpera по ключу "soapOpera".
5. Аналогично получению объекта SoapOpera сделать:
добавить в MovieFactory.getMovie получение объекта Cartoon для ключа "cartoon".
добавить в MovieFactory.getMovie получение объекта Thriller для ключа "thriller".
6. Считать с консоли несколько ключей (строк).
Важно: ввод заканчивается, как только вводится строка не совпадающая с одной из: "cartoon", "thriller", "soapOpera".

7. Создать переменную movie типа Movie и для каждой введенной строки (ключа):
получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
Вывести на экран movie.getClass().getSimpleName().
Требования:
•	Классы Cartoon и Thriller должны быть статическими и существовать внутри класса Solution.
•	Метод MovieFactory.getMovie должен возвращать объект типа Cartoon при передаче ему строки "cartoon" в качестве параметра.
•	Метод MovieFactory.getMovie должен возвращать объект типа Thriller при передаче ему строки "thriller" в качестве параметра.
•	Метод main должен считывать строки с клавиатуры.
•	Метод main должен прекращать считывать строки с клавиатуры, если была введена некорректная строка (не "cartoon", не "thriller" или не "soapOpera").
•	Для каждой введенной строки (в том числе для некорректной) необходимо вызвать метод MovieFactory.getMovie().
•	Для всех введенных корректных строк необходимо вывести на экран простые имена (movie.getClass().getSimpleName()) типов объектов,
    возвращаемых методом MovieFactory.getMovie().
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String key = reader.readLine();
            Movie movie = MovieFactory.getMovie(key);
            if (movie == null) {
                return;
            }
            System.out.println(movie.getClass().getSimpleName());
        }
    }

    static class MovieFactory {
        static Movie getMovie(String key) {
            Movie movie = null;
            switch (key) {
                case "soapOpera":
                    movie = new SoapOpera();
                    break;
                case "cartoon":
                    movie = new Cartoon();
                    break;
                case "thriller":
                    movie = new Thriller();
                    break;
            }
            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static public class Cartoon extends Movie {
    }

    static public class Thriller extends Movie {
    }
}
