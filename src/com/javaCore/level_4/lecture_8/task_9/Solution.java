package com.javaCore.level_4.lecture_8.task_9;

import java.util.ArrayList;
import java.util.List;

/*
Расширь функциональность программы, которая позволит производить манипуляции с валютами.
1. В существующем абстрактном классе Money создай приватное поле amount типа double.

2. Создай публичный геттер для поля amount(public double getAmount()), чтобы к этому полю можно было получить доступ извне класса Money.

3. В отдельных файлах создай классы Hryvnia, Ruble и USD, которые будут являться потомками класса Money.

4. В классах Hryvnia, Ruble и USD реализуй метод getCurrencyName() который будет возвращать название соответствующей валюты
(строку) в виде аббревиатуры (USD, UAH, RUB).

5. В классах Hryvnia, Ruble и USD реализуй публичный (public) конструктор, который принимает один параметр и вызывает
конструктор базового класса (super) с этим параметром.

6. Заполни список allMoney объектами всех возможных в рамках условия задачи и функциональности программы валют.
Требования:
•	В классе Money должно содержаться приватное поле amount типа double.
•	В классе Money должен быть реализован публичный конструктор с одним параметром типа double, который устанавливает
значение переменной amount согласно переданному параметру.
•	В классе Money должен быть реализован публичный метод getAmount(), который будет возвращать значение поля amount.
•	Классы Hryvnia, Ruble и USD должны быть потомками класса Money и существовать в отдельных файлах.
•	В классах Hryvnia, Ruble и USD должен быть реализован метод getCurrencyName().
•	Метод getCurrencyName() должен возвращать название соответствующей валюты (строку) в виде аббревиатуры (USD, UAH, RUB).
•	В классах Hryvnia, Ruble и USD должен быть реализован публичный конструктор с одним параметром типа double,
который устанавливает значение поля amount класса Money путем вызова конструктора класса родителя c тем же параметром.
 */
public class Solution {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<>();
            allMoney.add(new Hryvnia(100));
            allMoney.add(new Ruble(100));
            allMoney.add(new USD(100));
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}
