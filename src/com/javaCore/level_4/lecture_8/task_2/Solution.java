package com.javaCore.level_4.lecture_8.task_2;

/*
Давай напишем программу, которая поможет нам определить, какое вино пить по какому случаю.
Для этого нужно:
Создать абстрактный класс Drink с реализованным методом public void taste(), который выводит в консоль "Вкусно".
Создать класс Wine, наследуемый от Drink, с реализованным методом public String getHolidayName(), который возвращает строку "День Рождения".
Создать класс SparklingWine, наследуемый от Wine, с реализованным методом public String getHolidayName(), который возвращает строку "Новый Год".
Написать реализацию методов getDeliciousDrink, getWine, getSparklingWine.
Все классы должны находиться в отдельных файлах.
Требования:
•	Абстрактный класс Drink должен быть создан в отдельном файле.
•	В классе Drink должен быть реализован метод public void taste(), который выводит на экран строку - "Вкусно".
•	Класс Wine должен быть создан в отдельном файле и быть потомком класса Drink.
•	В классе Wine должен быть реализован метод public String getHolidayName(), который возвращает строку - "День Рождения".
•	Класс SparklingWine должен быть создан в отдельном файле и быть потомком класса Wine.
•	В классе SparklingWine должен быть реализован метод public String getHolidayName(), который возвращает строку - "Новый Год".
•	В классе Solution должен быть реализован метод getDeliciousDrink(), который возвращает объект типа Wine.
•	В классе Solution должен быть реализован метод getWine(), который возвращает объект типа Wine.
•	В классе Solution должен быть реализован метод getSparklingWine(), который возвращает объект типа SparklingWine.
 */
public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getSparklingWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static Drink getDeliciousDrink() {
        return new Wine();
    }

    public static Wine getWine() {
        return new Wine();
    }

    public static Wine getSparklingWine() {
        return new SparklingWine();
    }
}
