package com.javaCore.level_5.lecture_12.task_13;

/*
Исправь класс Hryvnia так, чтоб избежать возникновения ошибки StackOverflowError.

Требования:
•	Класс Hryvnia должен быть потомком класса Money.
•	В классе Hryvnia должен быть реализован метод getAmount.
•	Метод getAmount в классе Hryvnia должен возвращать значение поля amount.
•	При выполнении программы не должны возникать исключения или ошибки.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Hryvnia().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {
            return getMoney().getAmount();
        }
    }

    public static class Hryvnia extends Money {
        private double amount = 123d;

        public Hryvnia getMoney() {
            return this;
        }

        public Object getAmount() {
            return amount;
        }
    }
}
