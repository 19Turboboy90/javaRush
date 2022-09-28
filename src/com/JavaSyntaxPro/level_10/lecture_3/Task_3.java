package com.JavaSyntaxPro.level_10.lecture_3;

/*
Проинициализируй статические переменные следующими значениями:

partyFace — "\uD83E\uDD73"
balloon — "\uD83C\uDF88"
gift — "\uD83C\uDF81"
partyPopper — "\uD83C\uDF89"
cake — "\uD83C\uDF82"
Чтобы посмотреть поздравление, запусти метод main().

Требования:
•	Нужно, чтобы переменная partyFace при объявлении была проинициализирована значением "\uD83E\uDD73".
•	Нужно, чтобы переменная balloon при объявлении была проинициализирована значением "\uD83C\uDF88".
•	Нужно, чтобы переменная gift при объявлении была проинициализирована значением "\uD83C\uDF81".
•	Нужно, чтобы переменная partyPopper при объявлении была проинициализирована значением "\uD83C\uDF89".
•	Нужно, чтобы переменная cake при объявлении была проинициализирована значением "\uD83C\uDF82".
 */
public class Task_3 {
    public static String partyFace = "\uD83E\uDD73";
    public static String balloon = "\uD83C\uDF88";
    public static String gift = "\uD83C\uDF81";
    public static String partyPopper = "\uD83C\uDF89";
    public static String cake = "\uD83C\uDF82";

    public static void main(String[] args) {
        printCongratulation();
    }

    public static void printCongratulation() {
        String happyBirthday = "С днем рождения!";
        String congratulation = partyFace + balloon + partyPopper + cake + gift;
        System.out.println(happyBirthday + congratulation);
    }
}
