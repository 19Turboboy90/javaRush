package com.JavaSyntaxPro.level_15.lecture_4.task_5;
/*
Объедини блоки catch с одинаковым кодом.

Требования:
•	Количество блоков catch должно быть минимальным.
 */
public class Solution {
    public static void main(String[] args) {
        try {
            System.out.println("Программа работает от забора");
            Thread.sleep(1000);
            System.out.println("до обеда");
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Произошло исключение на букву N");
        } catch (IllegalArgumentException | IllegalStateException | InterruptedException e) {
            System.out.println("Произошло исключение на букву I");
        } catch (ClassCastException e) {
            System.out.println("Произошло исключение на букву C");
        }
    }
}
