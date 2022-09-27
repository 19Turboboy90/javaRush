package com.JavaSyntaxPro.level_10.lecture_2;

/*
Публичный статический метод toHex(String) должен переводить строковое представление двоичного числа, полученное в качестве входящего параметра,
из двоичной системы счисления в шестнадцатеричную и возвращать его строковое представление. А публичный статический метод toBinary(String) наоборот —
из строкового представления шестнадцатеричного числа в строковое представление двоичного числа.

Методы работают только с не пустыми строками.
Если входящий параметр — пустая строка или null, то оба метода возвращают пустую строку.
Если входящий параметр метода toHex(String) содержит любой символ, кроме 0 или 1, то метод возвращает пустую строку.
Если входящий параметр метода toBinary(String) содержит любой символ, кроме цифр от 0 до 9 или латинскую букву от a до f (в нижнем регистре),
то метод возвращает пустую строку.

Твоя задача — реализовать эти методы.

Один из алгоритмов перевода строкового представления двоичного числа в строковое представление шестнадцатеричного числа следующий:

Проверяем длину строки, полученной входящим параметром. Она должна быть кратна 4.
Если это не так, то добавляем нужное количество 0 в начало строки.
Берем каждые четыре символа (бита) и проверяем, какому символу шестнадцатеричной кодировки он соответствует.
Например:

двоичное представление — "100111010000", где "1001" — "9", "1101" — "d", "0000" — "0",
шестнадцатеричное представление — "9d0".

Один из алгоритмов перевода строкового представления шестнадцатеричного числа в строковое представление двоичного числа следующий:
Берем каждый символ и проверяем какому двоичному числу (4 бита) он соответствует.

Например:

шестнадцатеричное представление — "9d0", где "9" — "1001", "d" — "1101", "0" — "0000",
двоичное представление — "100111010000".
Метод main() не принимает участие в тестировании.

Требования:
•	Нужно, чтобы метод toHex(String) был реализован согласно условию.
•	Нужно, чтобы метод toBinary(String) был реализован согласно условию.
•	Методы Integer.toBinaryString(int) и Long.toBinaryString(int) использовать нельзя.
•	Методы Integer.toHexString(int) и Long.toHexString(int) использовать нельзя.
•	Методы Integer.parseInt(String, int) и Long.parseLong(String, int) использовать нельзя.
•	Методы Integer.toString(int, int) и Long.toString(long, int) использовать нельзя.
•	Объект типа BigInteger использовать нельзя.
•	Объект типа BigDecimal использовать нельзя.
 */
public class Task_4 {
    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String hexNumber = "";
        if (binaryNumber == null) {
            return hexNumber;
        }

        StringBuilder temp = new StringBuilder();
        if (binaryNumber.length() % 4 == 1) {
            temp.append("000").append(binaryNumber);
        } else if (binaryNumber.length() % 4 == 2) {
            temp.append("00").append(binaryNumber);
        } else if (binaryNumber.length() % 4 == 3) {
            temp.append("0").append(binaryNumber);
        } else {
            temp.append(binaryNumber);
        }

        StringBuilder result = new StringBuilder();
        label:
        for (int i = 0; i < temp.length(); i += 4) {
            String substring = temp.substring(i, i + 4);
            String element;
            switch (substring) {
                case "0000":
                    element = "0";
                    break;
                case "0001":
                    element = "1";
                    break;
                case "0010":
                    element = "2";
                    break;
                case "0011":
                    element = "3";
                    break;
                case "0100":
                    element = "4";
                    break;
                case "0101":
                    element = "5";
                    break;
                case "0110":
                    element = "6";
                    break;
                case "0111":
                    element = "7";
                    break;
                case "1000":
                    element = "8";
                    break;
                case "1001":
                    element = "9";
                    break;
                case "1010":
                    element = "a";
                    break;
                case "1011":
                    element = "b";
                    break;
                case "1100":
                    element = "c";
                    break;
                case "1101":
                    element = "d";
                    break;
                case "1110":
                    element = "e";
                    break;
                case "1111":
                    element = "f";
                    break;
                default:
                    result.setLength(0);
                    break label;
            }
            result.append(element);
        }
        return result.toString();
    }

    public static String toBinary(String hexNumber) {
        String binaryNumber = "";
        if (hexNumber == null) {
            return binaryNumber;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < hexNumber.length(); i++) {
            String element;
            if (hexNumber.charAt(i) == '0') {
                element = "0000";
            } else if (hexNumber.charAt(i) == '1') {
                element = "0001";
            } else if (hexNumber.charAt(i) == '2') {
                element = "0010";
            } else if (hexNumber.charAt(i) == '3') {
                element = "0011";
            } else if (hexNumber.charAt(i) == '4') {
                element = "0100";
            } else if (hexNumber.charAt(i) == '5') {
                element = "0101";
            } else if (hexNumber.charAt(i) == '6') {
                element = "0110";
            } else if (hexNumber.charAt(i) == '7') {
                element = "0111";
            } else if (hexNumber.charAt(i) == '8') {
                element = "1000";
            } else if (hexNumber.charAt(i) == '9') {
                element = "1001";
            } else if (hexNumber.charAt(i) == 'a') {
                element = "1010";
            } else if (hexNumber.charAt(i) == 'b') {
                element = "1011";
            } else if (hexNumber.charAt(i) == 'c') {
                element = "1100";
            } else if (hexNumber.charAt(i) == 'd') {
                element = "1101";
            } else if (hexNumber.charAt(i) == 'e') {
                element = "1110";
            } else if (hexNumber.charAt(i) == 'f') {
                element = "1111";
            } else {
                result.setLength(0);
                break;
            }
            result.append(element);
        }
        return result.toString();
    }
}
