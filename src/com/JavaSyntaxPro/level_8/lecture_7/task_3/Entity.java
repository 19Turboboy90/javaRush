package com.JavaSyntaxPro.level_8.lecture_7.task_3;

/*
Правильно унаследуй классы:

Человека — от существа;
Java-девелопера — от человека.
Удали дублирующие методы.
Требования:
•	Класс Human должен наследоваться от класса Entity.
•	Класс JavaDeveloper должен наследоваться от класса Human.
•	Дублирующих методов не должно бы
 */
public class Entity {
    public void move() {
        System.out.println("Я передвигаюсь.");
    }

    public void eat() {
        System.out.println("Я ем.");
    }
}
